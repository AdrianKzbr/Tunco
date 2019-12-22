package com.Vinyks.Tunco.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Ore extends BlockBase

{

	public Ore(String name, Material material) 
	{
		super(name, material);
	
		setSoundType(SoundType.STONE);
		setHardness(3.5F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}

}
