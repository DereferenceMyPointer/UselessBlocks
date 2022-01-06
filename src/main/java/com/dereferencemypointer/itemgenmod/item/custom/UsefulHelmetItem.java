package com.dereferencemypointer.itemgenmod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class UsefulHelmetItem extends ArmorItem {
    public UsefulHelmetItem(ArmorMaterial pMaterial, EquipmentSlot pSlot, Properties pProperties) {
        super(pMaterial, pSlot, pProperties);
    }

    @Override
    public void onUsingTick(ItemStack stack, LivingEntity player, int count) {
        player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 2));
    }

}