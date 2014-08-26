package com.mcjty.ancientmagic.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Staff extends Item {

    public Staff() {
        setMaxDamage(10);
    }

    @Override
    public boolean hitEntity(ItemStack itemStack, EntityLivingBase enemy, EntityLivingBase player) {
        itemStack.damageItem(1, player);
        return true;
    }
}
