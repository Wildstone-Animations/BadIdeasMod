
package com.wildstone_a.badideasmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.wildstone_a.badideasmod.BADIDEASMODElements;

@BADIDEASMODElements.ModElement.Tag
public class BadItemsItemGroup extends BADIDEASMODElements.ModElement {
	public BadItemsItemGroup(BADIDEASMODElements instance) {
		super(instance, 32);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbaditems") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.SKELETON_SKULL, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
