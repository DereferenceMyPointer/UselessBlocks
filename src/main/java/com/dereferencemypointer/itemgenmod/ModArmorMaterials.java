package com.dereferencemypointer.itemgenmod;

import com.dereferencemypointer.itemgenmod.item.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class ModArmorMaterials {
    private ModArmorMaterials(){
    }

    public static final ArmorMaterial USEFUL = new ArmorMaterialBase(100,
            new int[] {500, 750, 750, 500}, new int[] {25, 45,63, 27},
            4.2f, 2f, ItemGenMod.MOD_ID + ":useful",
            SoundEvents.AXE_SCRAPE, () -> Ingredient.of(ModItems.USELESS_INGOT.get()));

}
