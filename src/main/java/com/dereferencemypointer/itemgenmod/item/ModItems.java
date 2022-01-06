package com.dereferencemypointer.itemgenmod.item;

import com.dereferencemypointer.itemgenmod.ItemGenMod;
import com.dereferencemypointer.itemgenmod.ModArmorMaterials;
import com.dereferencemypointer.itemgenmod.ModMaterials;
import com.dereferencemypointer.itemgenmod.item.custom.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ItemGenMod.MOD_ID);

    public static final RegistryObject<Item> USELESS_INGOT = ITEMS.register("useless_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEMGEN_TAB)
                    .food(new FoodProperties.Builder().alwaysEat().fast().effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 1000), 1f)
                            .nutrition(-7).saturationMod(2f).build())));

    public static final RegistryObject<Item> USEFUL_PICKAXE = ITEMS.register("useful_pickaxe",
            () -> new UsefulPickaxeItem(ModMaterials.USEFUL, 1,1,
                    new Item.Properties().tab(ModCreativeModeTab.ITEMGEN_TAB).durability(7000)));

    public static final RegistryObject<Item> USEFUL_HELMET = ITEMS.register("useful_helmet",
            () -> new UsefulHelmetItem(ModArmorMaterials.USEFUL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.ITEMGEN_TAB)));
    public static final RegistryObject<Item> USEFUL_CHESTPLATE = ITEMS.register("useful_chestplate",
            () -> new UsefulChestplateItem(ModArmorMaterials.USEFUL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.ITEMGEN_TAB)));
    public static final RegistryObject<Item> USEFUL_LEGGINGS = ITEMS.register("useful_leggings",
            () -> new UsefulLeggingsItem(ModArmorMaterials.USEFUL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.ITEMGEN_TAB)));
    public static final RegistryObject<Item> USEFUL_BOOTS = ITEMS.register("useful_boots",
            () -> new UsefulBootsItem(ModArmorMaterials.USEFUL, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.ITEMGEN_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
