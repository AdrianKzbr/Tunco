package com.Vinyks.Tunco.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{

	public static void init() 
	{
		
		GameRegistry.addSmelting(ModBlocks.TUNGSTEN_ORE, new ItemStack(ModItems.TUNGSTEN_INGOT, 1), 10.0f);
		GameRegistry.addSmelting(ModBlocks.COBALT_ORE, new ItemStack(ModItems.COBALT_INGOT, 1), 10.0f);
		
	}
	
}
