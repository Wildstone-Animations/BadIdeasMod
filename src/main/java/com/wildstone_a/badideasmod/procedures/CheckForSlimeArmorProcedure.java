package com.wildstone_a.badideasmod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import com.wildstone_a.badideasmod.item.SlimeArmorItem;
import com.wildstone_a.badideasmod.BADIDEASMODElements;

@BADIDEASMODElements.ModElement.Tag
public class CheckForSlimeArmorProcedure extends BADIDEASMODElements.ModElement {
	public CheckForSlimeArmorProcedure(BADIDEASMODElements instance) {
		super(instance, 33);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CheckForSlimeArmor!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.armorInventory.get(3) : ItemStack.EMPTY)
				.getItem() == new ItemStack(SlimeArmorItem.helmet, (int) (1)).getItem())
				&& (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.armorInventory.get(2) : ItemStack.EMPTY)
						.getItem() == new ItemStack(SlimeArmorItem.body, (int) (1)).getItem()))
				&& ((((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.armorInventory.get(1) : ItemStack.EMPTY)
						.getItem() == new ItemStack(SlimeArmorItem.legs, (int) (1)).getItem())
						&& (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.armorInventory.get(0) : ItemStack.EMPTY)
								.getItem() == new ItemStack(SlimeArmorItem.boots, (int) (1)).getItem())))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, (int) 5, (int) 3));
		}
	}
}
