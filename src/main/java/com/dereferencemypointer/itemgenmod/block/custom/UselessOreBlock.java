package com.dereferencemypointer.itemgenmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

public class UselessOreBlock extends Block {
    private float explosionRadius = 10f;

    public UselessOreBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public void playerWillDestroy(Level pLevel, BlockPos pPos, BlockState pState, Player pPlayer) {
        pLevel.explode(null, DamageSource.LIGHTNING_BOLT, null, pPos.getX(), pPos.getY(), pPos.getZ(), explosionRadius, false, Explosion.BlockInteraction.BREAK);
        super.playerWillDestroy(pLevel, pPos, pState, pPlayer);
    }
}
