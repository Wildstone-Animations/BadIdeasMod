
package com.wildstone_a.badideasmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import com.wildstone_a.badideasmod.itemgroup.BadItemsItemGroup;
import com.wildstone_a.badideasmod.BADIDEASMODElements;

@BADIDEASMODElements.ModElement.Tag
public class ChickenNuggetsItem extends BADIDEASMODElements.ModElement {
	@ObjectHolder("badideasmod:chickennuggets")
	public static final Item block = null;
	public ChickenNuggetsItem(BADIDEASMODElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(BadItemsItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(2).saturation(0.3f).setAlwaysEdible().meat().build()));
			setRegistryName("chickennuggets");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
