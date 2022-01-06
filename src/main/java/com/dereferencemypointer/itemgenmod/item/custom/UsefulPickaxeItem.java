package com.dereferencemypointer.itemgenmod.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

import java.util.Random;

public class UsefulPickaxeItem extends PickaxeItem {
    private int tickTimeout = 200;
    private int currentT = 200;

    public UsefulPickaxeItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        currentT--;
        if(pIsSelected && currentT <= 0) {
            pEntity.hurt(DamageSource.MAGIC, 1f);
            currentT = tickTimeout;
        }
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack pStack, Player pPlayer, LivingEntity pInteractionTarget, InteractionHand pUsedHand) {
        return pInteractionTarget.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 500))? InteractionResult.PASS : InteractionResult.FAIL;
    }
}
