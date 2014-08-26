package com.mcjty.ancientmagic.gui;

import com.mcjty.ancientmagic.AncientMagic;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiProxy implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int guiid, EntityPlayer entityPlayer, World world, int x, int y, int z) {
        System.out.println("#### com.mcjty.ancientmagic.gui.GuiProxy.getServerGuiElement");
        return null;
    }

    @Override
    public Object getClientGuiElement(int guiid, EntityPlayer entityPlayer, World world, int x, int y, int z) {
        System.out.println("#### com.mcjty.ancientmagic.gui.GuiProxy.getClientGuiElement");
        return null;
    }

}
