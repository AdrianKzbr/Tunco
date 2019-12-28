package com.Vinyks.Tunco.util.handlers;

import com.Vinyks.Tunco.Main;
import com.Vinyks.Tunco.blocks.TungstenChest;
import com.Vinyks.Tunco.blocks.animation.RenderTungstenChest;
import com.Vinyks.Tunco.blocks.tileentity.TileEntityTungstenChest;
import com.Vinyks.Tunco.blocks.tileentity.ItemStackRenderer.TileEntityItemStackRendererTungstenChest;
import com.Vinyks.Tunco.init.ModBlocks;
import com.Vinyks.Tunco.init.ModItems;
import com.Vinyks.Tunco.init.ModRecipes;
import com.Vinyks.Tunco.util.IHasModel;
import com.Vinyks.Tunco.world.ModWorldGen;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler 
{
	
	@SubscribeEvent
	public static void registerBlock(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
		TileEntityHandler.registerTileEntities();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTungstenChest.class, new RenderTungstenChest());
        
	}
	
	
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(ModBlocks.TUNGSTEN_CHEST), 0, null);
		
		for(Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : ModBlocks.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}

	
	public static void initRegistries()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
		SoundsHandler.registerSounds();
		ModRecipes.init();
		
	
	}
	public static void preInitRegistries()
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}
	public static void postInitRegistries()
	{
		
	}

}

