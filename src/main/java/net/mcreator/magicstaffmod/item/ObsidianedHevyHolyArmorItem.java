
package net.mcreator.magicstaffmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.magicstaffmod.init.MaModTabs;
import net.mcreator.magicstaffmod.init.MaModItems;

public abstract class ObsidianedHevyHolyArmorItem extends ArmorItem {
	public ObsidianedHevyHolyArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 35;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 7, 8, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 16;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MaModItems.OBSIDIAN_PLATE.get()));
			}

			@Override
			public String getName() {
				return "obsidianed_hevy_holy_armor";
			}

			@Override
			public float getToughness() {
				return 3f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends ObsidianedHevyHolyArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(MaModTabs.TAB_MAGIC_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ma:textures/models/armor/obsidian__layer_1.png";
		}
	}

	public static class Chestplate extends ObsidianedHevyHolyArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(MaModTabs.TAB_MAGIC_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ma:textures/models/armor/obsidian__layer_1.png";
		}
	}

	public static class Leggings extends ObsidianedHevyHolyArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(MaModTabs.TAB_MAGIC_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ma:textures/models/armor/obsidian__layer_2.png";
		}
	}

	public static class Boots extends ObsidianedHevyHolyArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(MaModTabs.TAB_MAGIC_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ma:textures/models/armor/obsidian__layer_1.png";
		}
	}
}
