package com.dereferencemypointer.itemgenmod.block;

import com.dereferencemypointer.itemgenmod.ItemGenMod;
import com.dereferencemypointer.itemgenmod.block.custom.UselessOreBlock;
import com.dereferencemypointer.itemgenmod.item.ModCreativeModeTab;
import com.dereferencemypointer.itemgenmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ItemGenMod.MOD_ID);

    public static final RegistryObject<Block> USELESS_BLOCK = registerBlock("useless_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(8f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.ITEMGEN_TAB);

    public static final RegistryObject<Block> USELESS_ORE = registerBlock("useless_ore",
            () -> new UselessOreBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.ITEMGEN_TAB);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
         RegistryObject<T> toReturn = BLOCKS.register(name, block);
         registerBlockItem(name, toReturn);
         return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    }
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
