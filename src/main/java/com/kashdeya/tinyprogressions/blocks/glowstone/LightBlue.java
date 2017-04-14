package com.kashdeya.tinyprogressions.blocks.glowstone;

import java.util.Random;

import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.main.tinyprogressions;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.MathHelper;

public class LightBlue extends Block
{
    public LightBlue()
    {
        super(Material.GLASS);
        this.setHardness(0.3F);
        this.setSoundType(blockSoundType.GLASS);
        this.setLightLevel(1.0F);
        this.setCreativeTab(tinyprogressions.tabTP);
        this.setUnlocalizedName("lightblue_glowstone");
    }

    /**
     * Get the quantity dropped based on the given fortune level
     */
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        return MathHelper.clamp_int(this.quantityDropped(random) + random.nextInt(fortune + 1), 1, 4);
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random random)
    {
        return 2 + random.nextInt(3);
    }

    /**
     * Get the Item that this Block should drop when harvested.
     */
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return TechItems.lightblue_dust;
    }

    /**
     * Get the MapColor for this Block and the given BlockState
     */
    public MapColor getMapColor(IBlockState state)
    {
        return MapColor.LIGHT_BLUE;
    }
}