package com.alexjw.thematicarmor.server.event;

import com.alexjw.thematicarmor.ThematicArmor;
import com.alexjw.thematicarmor.server.data.TAData;
import com.alexjw.thematicarmor.server.enchantment.ModEnchantments;
import com.alexjw.thematicarmor.server.helper.ThematicHelper;
import com.alexjw.thematicarmor.server.specialists.SpecialistManager;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ListIterator;
import java.util.Random;

import static net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel;

@Mod.EventBusSubscriber(modid = ThematicArmor.MODID)
public class CommonEventHandler {
    private static Random random = new Random();

    @SubscribeEvent(priority = EventPriority.HIGH)
    public void onRespawn(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent event) {
        if (TAData.TENACITY.getBoolean(event.player)) {
            TAData.TENACITY.put(event.player, false);
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGH)
    public void preventDeathOutlast(LivingDamageEvent event) {
        if (event.getEntity() instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer) event.getEntity();
            if (event.getAmount() >= entityPlayer.getHealth()) {

                if (ThematicHelper.getTheme(entityPlayer) != null) {
                    if (ThematicHelper.getTheme(entityPlayer).getSpecialistSkill() != null) {
                        if (ThematicHelper.getTheme(entityPlayer).getSpecialistSkill().equals(SpecialistManager.specialistOutlast)) {
                            if (!TAData.HAS_DIED.getBoolean(entityPlayer)) {
                                event.setCanceled(true);
                                entityPlayer.setHealth(entityPlayer.getMaxHealth());
                                TAData.HAS_DIED.put(entityPlayer, true);
                                TAData.TIME_DEAD.put(entityPlayer, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGH)
    public void vitalityLastDamage(LivingDamageEvent event) {
        if (event.getEntityLiving() instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer) event.getEntityLiving();
            TAData.LAST_HEAL.put(entityPlayer, 0);
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGH)
    public void extraHealthTenacity(LivingDamageEvent event) {
        if (event.getEntityLiving() instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer) event.getEntityLiving();

            if (event.getAmount() >= entityPlayer.getHealth()) {
                if (ThematicHelper.getTheme(entityPlayer) != null) {
                    if (ThematicHelper.getTheme(entityPlayer).getSpecialistSkill() != null) {
                        if (ThematicHelper.getTheme(entityPlayer).getSpecialistSkill().equals(SpecialistManager.specialistTenacity)) {
                            if (!TAData.TENACITY.getBoolean(entityPlayer)) {
                                event.setCanceled(true);
                                entityPlayer.setHealth(entityPlayer.getMaxHealth() * 0.3f);
                                TAData.TENACITY.put(entityPlayer, true);
                            }
                        }
                    }
                }
            }
        }
    }

    @SubscribeEvent (priority = EventPriority.HIGH)
    public void handlePlayerDropsEvent(PlayerDropsEvent event) {
        EntityPlayer player = event.getEntityPlayer();

        if (player instanceof FakePlayer) {
            return;
        }
        if (player.world.getGameRules().getBoolean("keepInventory")) {
            return;
        }
        ListIterator<EntityItem> iter = event.getDrops().listIterator();
        while (iter.hasNext()) {
            EntityItem drop = iter.next();
            ItemStack stack = drop.getItem();
            if (isSoulbound(stack)) {
                if (addToPlayerInventory(player, stack)) {
                    iter.remove();
                }
            }
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGH)
    public void handlePlayerCloneEvent(PlayerEvent.Clone event) {
        if (!event.isWasDeath()) {
            return;
        }
        EntityPlayer player = event.getEntityPlayer();
        EntityPlayer oldPlayer = event.getOriginal();

        if (player instanceof FakePlayer) {
            return;
        }
        if (player.world.getGameRules().getBoolean("keepInventory")) {
            return;
        }
        for (int i = 0; i < oldPlayer.inventory.armorInventory.size(); i++) {
            ItemStack stack = oldPlayer.inventory.armorInventory.get(i);
            int encSoulbound = EnchantmentHelper.getEnchantmentLevel(ModEnchantments.SOULBOUND, stack);
            if (encSoulbound > 0) {
                if (addToPlayerInventory(player, stack)) {
                    oldPlayer.inventory.armorInventory.set(i, ItemStack.EMPTY);
                }
            }
        }
        for (int i = 0; i < oldPlayer.inventory.mainInventory.size(); i++) {
            ItemStack stack = oldPlayer.inventory.mainInventory.get(i);
            int encSoulbound = MathHelper.clamp(EnchantmentHelper.getEnchantmentLevel(ModEnchantments.SOULBOUND, stack), 0, ModEnchantments.SOULBOUND.getMaxLevel() * 2);
            if (encSoulbound > 0) {
                if (addToPlayerInventory(player, stack)) {
                    oldPlayer.inventory.mainInventory.set(i, ItemStack.EMPTY);
                }
            }
        }
    }
    public boolean isSoulbound(ItemStack stack) {
        return getEnchantmentLevel(ModEnchantments.SOULBOUND, stack) > 0;
    }


    public static boolean addToPlayerInventory(EntityPlayer player, ItemStack stack) {
        if (stack.isEmpty() || player == null) {
            return false;
        }
        InventoryPlayer inv = player.inventory;
        for (int i = 0; i < inv.mainInventory.size(); i++) {
            if (inv.mainInventory.get(i).isEmpty()) {
                inv.mainInventory.set(i, stack.copy());
                return true;
            }
        }
        if (stack.getItem() instanceof ItemArmor) {
            ItemArmor arm = (ItemArmor) stack.getItem();
            int index = arm.armorType.getIndex();
            if (player.inventory.armorInventory.get(index).isEmpty()) {
                inv.mainInventory.set(inv.mainInventory.size() + 1, stack.copy());
                return true;
            }
        }
        return false;
    }
}
