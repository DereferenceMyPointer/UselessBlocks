package com.dereferencemypointer.itemgenmod;

import net.minecraft.tags.Tag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class ToolMaterialBase implements Tier {
    private final float attackDamageBonus, speed;
    private final int enchantability, harvestLevel, durability;
    private final Supplier<Ingredient> repairMaterial;

    public ToolMaterialBase(float attackDamageBonus, float speed, int enchantability, int harvestLevel, int durability, Supplier<Ingredient> repairMaterial) {
        this.attackDamageBonus = attackDamageBonus;
        this.speed = speed;
        this.enchantability = enchantability;
        this.harvestLevel = harvestLevel;
        this.durability = durability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getUses() {
        return durability;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamageBonus;
    }

    @Override
    public int getLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    }
}
