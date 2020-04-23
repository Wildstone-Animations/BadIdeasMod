
package com.wildstone_a.badideasmod.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import com.wildstone_a.badideasmod.BADIDEASMODElements;

@BADIDEASMODElements.ModElement.Tag
public class WaterFuel extends BADIDEASMODElements.ModElement {
	public WaterFuel(BADIDEASMODElements instance) {
		super(instance, 37);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(Items.WATER_BUCKET, (int) (1)).getItem())
			event.setBurnTime(1600);
	}
}
