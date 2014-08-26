package com.mcjty.ancientmagic.items;

import com.mcjty.ancientmagic.AncientMagic;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;

public final class ModItems {
    public static RuneIt runeIt;
    public static RuneTar runeTar;

    public static Staff staff;

    public static final void init() {
        runeIt = new RuneIt();
        runeIt.setUnlocalizedName("RuneIt");
        runeIt.setCreativeTab(CreativeTabs.tabMisc);
        runeIt.setTextureName(AncientMagic.MODID + ":runeIt");
        GameRegistry.registerItem(runeIt, "RuneIt");

        runeTar = new RuneTar();
        runeTar.setUnlocalizedName("RuneTar");
        runeTar.setCreativeTab(CreativeTabs.tabMisc);
        runeTar.setTextureName(AncientMagic.MODID + ":runeTar");
        GameRegistry.registerItem(runeTar, "RuneTar");

        staff = new Staff();
        staff.setUnlocalizedName("Staff");
        staff.setCreativeTab(CreativeTabs.tabMisc);
        staff.setTextureName(AncientMagic.MODID + ":staff");
        GameRegistry.registerItem(staff, "Staff");
    }
}
