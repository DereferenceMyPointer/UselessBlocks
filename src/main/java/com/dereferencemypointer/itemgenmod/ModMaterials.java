package com.dereferencemypointer.itemgenmod;

import com.dereferencemypointer.itemgenmod.item.ModItems;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class ModMaterials {
    private ModMaterials(){

    }
    public static final Tier USEFUL = new ToolMaterialBase(25f, 25f,5,7,7000,
            () -> Ingredient.of(ModItems.USELESS_INGOT.get()));
}
