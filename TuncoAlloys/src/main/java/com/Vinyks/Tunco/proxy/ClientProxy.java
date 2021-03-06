package com.Vinyks.Tunco.proxy;

import com.Vinyks.Tunco.blocks.tileentity.ItemStackRenderer.TileEntityItemStackRendererTungstenChest;
import com.Vinyks.Tunco.init.ModBlocks;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy
{
	public void registerItemRenderer(Item item, int meta, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
		Item.getItemFromBlock(ModBlocks.TUNGSTEN_CHEST).setTileEntityItemStackRenderer(TileEntityItemStackRendererTungstenChest.instance);
		//ItemBlock tc = new ItemBlock(ModBlocks.TUNGSTEN_CHEST);
		//tc.setTileEntityItemStackRenderer(com.Vinyks.Tunco.blocks.tileentity.ItemStackRenderer.TileEntityItemStackRendererTungstenChest.instance);
	}
}
