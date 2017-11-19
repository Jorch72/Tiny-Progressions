package com.kashdeya.tinyprogressions.items.tools.base;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class BaseHoe extends ItemHoe {
	
	public BaseHoe(ToolMaterial material){
		super(material);
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setMaxStackSize(1);
	}
}
