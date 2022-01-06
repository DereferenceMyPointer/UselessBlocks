package com.dereferencemypointer.itemgenmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ITEMGEN_TAB = new CreativeModeTab("itemGenModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.USELESS_INGOT.get());
        }
    };
}
