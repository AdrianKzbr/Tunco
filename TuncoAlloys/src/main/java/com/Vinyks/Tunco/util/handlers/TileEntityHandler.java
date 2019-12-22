package com.Vinyks.Tunco.util.handlers;

import com.Vinyks.Tunco.blocks.tileentity.TileEntityTungstenChest;
import com.Vinyks.Tunco.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityTungstenChest.class, new ResourceLocation(Reference.MOD_ID + ":tungsten_chest"));
	}
}
