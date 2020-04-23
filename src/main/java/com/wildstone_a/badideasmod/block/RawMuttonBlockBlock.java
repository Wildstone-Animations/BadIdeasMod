
package com.wildstone_a.badideasmod.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

import com.wildstone_a.badideasmod.itemgroup.BadItemsItemGroup;
import com.wildstone_a.badideasmod.BADIDEASMODElements;

@BADIDEASMODElements.ModElement.Tag
public class RawMuttonBlockBlock extends BADIDEASMODElements.ModElement {
	@ObjectHolder("badideasmod:rawmuttonblock")
	public static final Block block = null;
	public RawMuttonBlockBlock(BADIDEASMODElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(BadItemsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(1f, 10f).lightValue(0));
			setRegistryName("rawmuttonblock");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(Items.MUTTON, (int) (9)));
		}
	}
}
