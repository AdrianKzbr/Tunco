package com.Vinyks.Tunco.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Ore extends BlockBase

{

	public Ore(String name, Material material, float hardness, int harvestLevel) 
	{
		super(name, material);
	
		setSoundType(SoundType.STONE);
		setHardness(hardness);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", harvestLevel);
	}

}
