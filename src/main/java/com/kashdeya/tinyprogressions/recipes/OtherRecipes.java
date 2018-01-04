package com.kashdeya.tinyprogressions.recipes;

import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.registry.recipes.ShapedRecipe;
import com.kashdeya.tinyprogressions.registry.recipes.ShapelessRecipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class OtherRecipes
{
	public static IRecipe POUCH;
	public static IRecipe FLINT1, SUGAR1;
	public static IRecipe LAVA_BUCKET, WATER_BUCKET;
	public static IRecipe FLINT_KNIFE, QUARTZ_KNIFE, QUARTZ_DUST;
	public static IRecipe MYCELIUM_SEEDS;
	public static IRecipe OBSIDIAN_INGOT, OBSIDIAN1;
	
	public static void init()
	{
		// vasholine
		
		/**
		if (ConfigHandler.vasholine){
			RecipeRegistry.addShapedRecipe(new ItemStack(<forge:bucketfilled>.withTag({FluidName: "vasholine", Amount: 1000})), new Object[] {
		            "lll",
		            "lbl",
		            "lll",
		                Character.valueOf('b'), Items.BUCKET,
		                Character.valueOf('l'), TechItems.vasholine_gem
		    });
		}
		*/
		
		// Pouch
		if (ConfigHandler.pouch) {
		    POUCH = new ShapedRecipe(new ItemStack(TechItems.pouch), "lsl",
                "clc",
                "lsl",
				's', Items.STRING,
				'l', Items.LEATHER,
				'c', Blocks.CHEST);
		}
		
		// MISC Flint Recipe
		if (ConfigHandler.FlintRecipe){
			FLINT1 = new ShapedRecipe(new ItemStack(Items.FLINT), "gg ",
                "g  ",
				'g', "blockGravel");
		}
		
		// Lava Bucket
		if (ConfigHandler.lava_block_recipe) {
			LAVA_BUCKET = new ShapelessRecipe(new ItemStack(Items.LAVA_BUCKET), TechBlocks.lava_block, Items.BUCKET);
		}
		
		// Water Bucket
		if (ConfigHandler.water_block_recipe) {
			WATER_BUCKET = new ShapelessRecipe(new ItemStack(Items.WATER_BUCKET), TechBlocks.water_block, Items.BUCKET);
		}
		
		// Old Reed
		if (ConfigHandler.old_reed) {
			SUGAR1 = new ShapelessRecipe(new ItemStack(Items.SUGAR), TechItems.dead_reed);
		}
		
		// Quartz Items
		if (ConfigHandler.QuartzKnife) {
			QUARTZ_KNIFE = new ShapedRecipe(new ItemStack(TechItems.quartz_knife), "  s",
                " s ",
                "q  ",
				's', "stickWood",
				'q', "gemQuartz");
						
			QUARTZ_DUST = new ShapedRecipe(new ItemStack(TechItems.quartz_dust), "k",
                "q",
				'k', TechItems.quartz_knife,
				'q', "gemQuartz");
		}
					
		// Mycelium Seeds
		if (ConfigHandler.MyceliumSeeds) {
			MYCELIUM_SEEDS = new ShapedRecipe(new ItemStack(TechItems.mycelium_seeds), "sss",
                "ses",
                "sss",
				's', Items.WHEAT_SEEDS,
				'e', Items.SPIDER_EYE);
		}
		
		// Flint Ingot WIP
		if (ArmorHandler.FlintArmor) {
			GameRegistry.addSmelting(TechBlocks.flint_block, new ItemStack(TechItems.flint_ingot), 1.0F);
		}
		
		// Reinforced Obsidian Ingot
		if (ConfigHandler.ReinforcedObsidian) {
			OBSIDIAN_INGOT = new ShapelessRecipe(new ItemStack(TechItems.reinforced_obsidian_ingot, 9), TechBlocks.reinforced_obsidian);
			OBSIDIAN1 = new ShapedRecipe(new ItemStack(TechBlocks.reinforced_obsidian), "sss",
                "sss",
                "sss",
				's', TechItems.reinforced_obsidian_ingot);
		}
		
		// Flint Knife
		if (ConfigHandler.FlintKnife) {
			FLINT_KNIFE = new ShapelessRecipe(new ItemStack(TechItems.flint_knife), "flint", "flint", "stickWood");
		}
	}
}