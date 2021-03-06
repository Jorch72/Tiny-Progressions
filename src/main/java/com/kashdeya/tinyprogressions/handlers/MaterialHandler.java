package com.kashdeya.tinyprogressions.handlers;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialHandler {

	// Tools
	public static final Item.ToolMaterial BONE = EnumHelper.addToolMaterial("boneToolMaterial", 0, 29, 1.0F, 0.0F, 10);
	public static final Item.ToolMaterial FLINT = EnumHelper.addToolMaterial("flintToolMaterial", 0, 100, 3.0F, 0.5F, 15);
	public static final Item.ToolMaterial BIRTHDAY = EnumHelper.addToolMaterial("birthdayToolMaterial", 4, 3061, 45.0F, 4.0F, 25);
	public static final Item.ToolMaterial OBSIDIAN = EnumHelper.addToolMaterial("obsidianToolMaterial", 4, 3561, 100.0F, 6.0F, 25);
	public static final Item.ToolMaterial EMERALD = EnumHelper.addToolMaterial("emeraldToolMaterial", 4, 1961, 50.0F, 5.0F, 10);
	// Armor
	public static final ArmorMaterial stoneArmourMaterial = EnumHelper.addArmorMaterial("stoneArmourMaterial", "tp:stone", 15, new int[]{1, 3, 4, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial flintArmourMaterial = EnumHelper.addArmorMaterial("flintArmourMaterial", "tp:flint", 12, new int[]{2, 3, 2, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial boneArmourMaterial = EnumHelper.addArmorMaterial("boneArmourMaterial", "tp:bone", 8, new int[]{1, 1, 1, 1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial woodArmourMaterial = EnumHelper.addArmorMaterial("woodArmourMaterial", "tp:wood", 5, new int[]{1, 2, 1, 1}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);

}
