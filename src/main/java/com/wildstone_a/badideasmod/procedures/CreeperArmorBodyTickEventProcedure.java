package com.wildstone_a.badideasmod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.Explosion;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import com.wildstone_a.badideasmod.item.CreeperArmorItem;
import com.wildstone_a.badideasmod.BADIDEASMODElements;

@BADIDEASMODElements.ModElement.Tag
public class CreeperArmorBodyTickEventProcedure extends BADIDEASMODElements.ModElement {
	public CreeperArmorBodyTickEventProcedure(BADIDEASMODElements instance) {
		super(instance, 67);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CreeperArmorBodyTickEvent!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CreeperArmorBodyTickEvent!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CreeperArmorBodyTickEvent!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CreeperArmorBodyTickEvent!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CreeperArmorBodyTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.armorInventory.get(3) : ItemStack.EMPTY)
				.getItem() == new ItemStack(CreeperArmorItem.helmet, (int) (1)).getItem())
				&& (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.armorInventory.get(2) : ItemStack.EMPTY)
						.getItem() == new ItemStack(CreeperArmorItem.body, (int) (1)).getItem()))
				&& ((((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.armorInventory.get(1) : ItemStack.EMPTY)
						.getItem() == new ItemStack(CreeperArmorItem.legs, (int) (1)).getItem())
						&& (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.armorInventory.get(0) : ItemStack.EMPTY)
								.getItem() == new ItemStack(CreeperArmorItem.boots, (int) (1)).getItem())))) {
			if (!world.isRemote) {
				world.createExplosion(null, (int) x, (int) y, (int) z, (float) 3, Explosion.Mode.BREAK);
			}
		}
	}
}
