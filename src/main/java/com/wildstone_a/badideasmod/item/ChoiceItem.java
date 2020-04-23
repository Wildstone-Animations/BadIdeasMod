
package com.wildstone_a.badideasmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import com.wildstone_a.badideasmod.itemgroup.BadItemsItemGroup;
import com.wildstone_a.badideasmod.BADIDEASMODElements;

@BADIDEASMODElements.ModElement.Tag
public class ChoiceItem extends BADIDEASMODElements.ModElement {
	@ObjectHolder("badideasmod:choice")
	public static final Item block = null;
	public ChoiceItem(BADIDEASMODElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, BADIDEASMODElements.sounds.get(new ResourceLocation("badideasmod:choice")),
					new Item.Properties().group(BadItemsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("choice");
		}
	}
}
