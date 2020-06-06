package com.alexjw.core.server.items;

import com.alexjw.core.network.MessageReload;
import com.alexjw.core.network.MessageShoot;
import com.alexjw.core.network.ThematicNetworkHandler;
import com.alexjw.core.server.guns.Bullet;
import com.alexjw.core.server.guns.Bullets;
import com.alexjw.core.server.guns.Gun;
import com.alexjw.core.server.guns.Guns;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.CooldownTracker;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class ItemGun extends Item {
    private static Gun gun;

    public ItemGun(Gun gun) {
        super();
        ItemGun.gun = gun;
        this.setUnlocalizedName(gun.getGunName());
        this.setRegistryName(gun.getModID(), gun.getGunName());
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.COMBAT);
        ThematicItems.ITEMS.add(this);
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, World world, List list, ITooltipFlag iTooltipFlag) {
        if(getMaxAmmo(itemStack) != -1)
            list.add(TextFormatting.GRAY + "Ammo: " + TextFormatting.GRAY + getAmmo(itemStack) + TextFormatting.GRAY + ":" + TextFormatting.GRAY + getMaxAmmo(itemStack));
        list.add(TextFormatting.GRAY + "Damage: " + TextFormatting.GRAY + gun.getGunDamage() / 2 + TextFormatting.GRAY + "h");
        list.add(TextFormatting.GRAY + "Recoil: " + TextFormatting.GRAY + gun.getGunRecoil() + TextFormatting.GRAY + "b");
        list.add(TextFormatting.GRAY + "Rate of Fire: " + TextFormatting.GRAY + gun.getShootCooldown() + TextFormatting.GRAY + "/100");
        StringBuilder fireRate = new StringBuilder();
        for(Gun.FireMode fireMode : gun.getGunFireMode())
            fireRate.append(fireMode.toString()).append(" ");
        list.add(TextFormatting.GRAY + "Fire Rate: " + TextFormatting.GRAY + fireRate);
        list.add(TextFormatting.GRAY + "Magazines: ");
        for(Bullet magazine : gun.getGunBullets())
            list.add(TextFormatting.GRAY + magazine.getItemBullet().getItemStackDisplayName(itemStack));
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 72000;
    }

    @Override
    public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack)
    {
        return true;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack heldItem = playerIn.getHeldItem(handIn);
        if(worldIn.isRemote) {
            if (!hasAmmo(heldItem))
                if(hasAmmo(playerIn)){
                    ThematicNetworkHandler.wrapper.sendToServer(new MessageReload());
                }else {
                    return new ActionResult<>(EnumActionResult.FAIL, heldItem);
                }
            if (hasAmmo(heldItem) || playerIn.capabilities.isCreativeMode) {
                if (playerIn.isHandActive())
                    return new ActionResult<>(EnumActionResult.FAIL, heldItem);
                playerIn.setActiveHand(handIn);
                CooldownTracker tracker = playerIn.getCooldownTracker();
                if (!tracker.hasCooldown(heldItem.getItem())) {
                    tracker.setCooldown(heldItem.getItem(), gun.getShootCooldown());
                    ThematicNetworkHandler.wrapper.sendToServer(new MessageShoot());
                }
            }
        }
        return new ActionResult<>(EnumActionResult.FAIL, heldItem);
    }

    public Boolean hasAmmo(EntityPlayer entityPlayer) {
        boolean hasAmmo = false;
        for (int i = 0; i < entityPlayer.inventory.getSizeInventory(); i++) {
            ItemStack stack = entityPlayer.inventory.getStackInSlot(i);
            for(Bullet bullet: getGun().getGunBullets()){
                if(stack.isItemEqual(new ItemStack(bullet.getItemBullet()))){
                    hasAmmo = true;
                    break;
                }
            }
        }
        return hasAmmo;
    }

    /**
     * Check if the gun has ammo set.
     * @param itemStack - ItemGun
     */
    public static Boolean hasAmmo(ItemStack itemStack){
        return (getAmmo(itemStack) > 0) && (getLoadedAmmo(itemStack) != null);
    }

    /**
     * Get the gun for outside use.
     */
    public Gun getGun() {
        return this.gun;
    }

    /**
     * Set/Add ammo into the gun.
     *
     * @param itemStack - This itemstack.
     * @param bullet    - The bullet that's being added.
     * @param count     - The amount of bullets in the magazine, usually bullet.getMax
     */
    public void setLoadedAmmo(ItemStack itemStack, Bullet bullet, int count) {
        NBTTagCompound nbtTagCompound = itemStack.getTagCompound();
        if (nbtTagCompound != null) {
            nbtTagCompound.setString("loaded_ammo", bullet.getBulletName());
            nbtTagCompound.setInteger("ammo", count);
        } else {
            NBTTagCompound newNbtTagCompound = new NBTTagCompound();
            newNbtTagCompound.setString("loaded_ammo", bullet.getBulletName());
            newNbtTagCompound.setInteger("ammo", count);
            itemStack.setTagCompound(newNbtTagCompound);
        }
    }

    /**
     * Get the Bullet that is currently loaded.
     *
     * @param itemStack - This itemstack.
     */
    public static Bullet getLoadedAmmo(ItemStack itemStack) {
        NBTTagCompound nbtTagCompound = itemStack.getTagCompound();
        if (nbtTagCompound != null) {
            return Bullets.getBulletByName(nbtTagCompound.getString("loaded_ammo"));
        } else {
            return null;
        }
    }

    /**
     * Check how much ammo is currently loaded in the gun.
     *
     * @param itemStack - This itemstack
     */
    public static int getAmmo(ItemStack itemStack) {
        NBTTagCompound nbtTagCompound = itemStack.getTagCompound();
        if (nbtTagCompound != null) {
            return nbtTagCompound.getInteger("ammo");
        } else {
            return 0;
        }
    }

    /**
     * Check the maximum ammunition size of this particular gun.
     *
     * @param itemStack - This itemstack
     */
    public int getMaxAmmo(ItemStack itemStack) {
        if(getLoadedAmmo(itemStack) != null){
            return getLoadedAmmo(itemStack).getBulletMag();
        } else {
            return -1;
        }
    }
}