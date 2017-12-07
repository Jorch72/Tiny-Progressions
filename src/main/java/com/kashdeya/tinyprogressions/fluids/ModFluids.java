package com.kashdeya.tinyprogressions.fluids;

import java.lang.reflect.Field;
import java.util.List;

import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
import com.kashdeya.tinyprogressions.main.Reference;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModFluids {

	public static final ModFluids INSTANCE = new ModFluids();

	public static Fluid VASHOLINE = new Fluid("vasholine", new ResourceLocation(Reference.MOD_ID, "fluids/wub_juice_still"), new ResourceLocation(Reference.MOD_ID, "fluids/wub_juice_flow")).setDensity(6000).setViscosity(6000).setUnlocalizedName("vasholine");

	private ModFluids() {
	}

	public static void init() {
		try {
			for (Field f : ModFluids.class.getDeclaredFields()) {
				Object obj = f.get(null);
				if (obj instanceof Fluid) {
					Fluid fluid = (Fluid) obj;
					if (FluidRegistry.isFluidRegistered(fluid.getName()))
						f.set(null, FluidRegistry.getFluid(fluid.getName()));
					else {
						FluidRegistry.registerFluid(fluid);
						FluidRegistry.addBucketForFluid(fluid);
					}
				}
			}
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void onTextureStitchPre(TextureStitchEvent.Pre event) {
		event.getMap().registerSprite(VASHOLINE.getStill());
		event.getMap().registerSprite(VASHOLINE.getFlowing());
	}
}