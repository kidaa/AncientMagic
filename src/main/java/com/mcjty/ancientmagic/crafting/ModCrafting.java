package com.mcjty.ancientmagic.crafting;

import com.mcjty.ancientmagic.blocks.ModBlocks;
import com.mcjty.ancientmagic.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public final class ModCrafting {

    /*

    Runes:
        It
        Tar
        Oth
        Zal
        Oda
        Zor
        Dol
        Nuh
        Grah
        Bera
        Thera
        Ida
        Odro
        Argun
        Tod


    Zombie, Skelet, Creeper: It, Tar
    Blaze, Enderman, Wither Skeleton: Tar, Oth
    Wither: Zor, Dol
    End Dragon: Argun, Tod



    Effecten:
        regeneratie
        armor bij
        leven bij
        sneller mijnen
        sneller lopen
        hoger springen
        meer pijn doen
        nachtzicht
        onder water ademen
        onder water zien
        monsters pijn doen wanneer ze aanvallen
        vliegen


     */

    public static final void init() {
        GameRegistry.addRecipe(new ItemStack(ModItems.runeTar), new Object[]{"i  ", " g ", "  i", 'i', ModItems.runeIt, 'g', Items.gold_ingot});

        ItemStack enchantedChestplate = new ItemStack(Items.leather_chestplate);
        enchantedChestplate.addEnchantment(Enchantment.infinity, 1);
        GameRegistry.addShapelessRecipe(enchantedChestplate, Items.leather_chestplate, ModItems.runeTar);
    }
}
