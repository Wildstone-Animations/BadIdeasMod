
package com.wildstone_a.badideasmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.wildstone_a.badideasmod.itemgroup.BadItemsItemGroup;
import com.wildstone_a.badideasmod.BADIDEASMODElements;

@BADIDEASMODElements.ModElement.Tag
public class GoldHandeledWoodenSwordItem extends BADIDEASMODElements.ModElement {
	@ObjectHolder("badideasmod:goldhandeledwoodensword")
	public static final Item block = null;
	public GoldHandeledWoodenSwordItem(BADIDEASMODElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 0f, new Item.Properties().group(BadItemsItemGroup.tab)) {
		}.setRegistryName("goldhandeledwoodensword"));
	}
}
