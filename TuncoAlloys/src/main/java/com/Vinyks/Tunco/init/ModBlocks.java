package com.Vinyks.Tunco.init;

import java.util.ArrayList;
import java.util.List;

import com.Vinyks.Tunco.blocks.BlockBase;
import com.Vinyks.Tunco.blocks.BlockTungstenChest;
import com.Vinyks.Tunco.blocks.CobaltBlock;
import com.Vinyks.Tunco.blocks.CobaltTungstenAlloyBlock;
import com.Vinyks.Tunco.blocks.Ore;
import com.Vinyks.Tunco.blocks.TungstenBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block TUNGSTEN_BLOCK = new TungstenBlock("tungsten_block", Material.IRON);
	
	public static final Block COBALT_BLOCK = new CobaltBlock("cobalt_block", Material.IRON);
	
	public static final Block COBALT_TUNGSTEN_ALLOY_BLOCK = new CobaltTungstenAlloyBlock("cobalt_tungsten_alloy_block", Material.IRON);

	public static final Block METALMIXER = new TungstenBlock("metalmixer_block", Material.IRON);
	
	public static final Block TUNGSTEN_ORE = new Ore("tungsten_ore", Material.IRON, 5.0F, 2);
	
	public static final Block COBALT_ORE = new Ore("cobalt_ore", Material.IRON, 3.0F, 2);
	
	public static final Block TUNGSTEN_CHEST = new BlockTungstenChest("tungsten_chest");
}