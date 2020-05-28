package com.alexjw.siegecraft.common.entity.operator;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityRook extends EntityDummy {
    protected ItemStack[] dummyInventory;

    public EntityRook(World worldIn) {
        super(worldIn);
    }

    public EntityRook(World worldIn, ItemStack[] containerPlayer) {
        super(worldIn);
        this.dummyInventory = containerPlayer;
    }

    public ItemStack[] getDummyInventory() {
        return dummyInventory;
    }

    public void setDummyInventory(ItemStack[] dummyInventory) {
        this.dummyInventory = dummyInventory;
    }
}