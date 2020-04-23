
package com.wildstone_a.badideasmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import com.wildstone_a.badideasmod.itemgroup.BadItemsItemGroup;
import com.wildstone_a.badideasmod.BADIDEASMODElements;

@BADIDEASMODElements.ModElement.Tag
public class SKILLCRANEItem extends BADIDEASMODElements.ModElement {
	@ObjectHolder("badideasmod:skillcrane")
	public static final Item block = null;
	public SKILLCRANEItem(BADIDEASMODElements instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, BADIDEASMODElements.sounds.get(new ResourceLocation("badideasmod:skillcrane")),
					new Item.Properties().group(BadItemsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("skillcrane");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
