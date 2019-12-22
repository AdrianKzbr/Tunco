package com.Vinyks.Tunco.init;

import java.util.ArrayList;
import java.util.List;

import com.Vinyks.Tunco.items.ItemBase;
import com.Vinyks.Tunco.items.tools.ToolAxe;
import com.Vinyks.Tunco.items.tools.ToolHoe;
import com.Vinyks.Tunco.items.tools.ToolPickaxe;
import com.Vinyks.Tunco.items.tools.ToolSpade;
import com.Vinyks.Tunco.items.tools.Toolsword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{

	//materials
	public static final ToolMaterial MATERIAL_TUNGSTEN = EnumHelper.addToolMaterial("material_tungsten", 2, 3000, 4, 2, 10);
	
	
	
	
	
	
	//items
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item TUNGSTEN_INGOT = new ItemBase("tungsten_ingot");
	
	public static final Item COBALT_INGOT = new ItemBase("cobalt_ingot");

	public static final Item COBALT_TUNGSTEN_ALLOY = new ItemBase("cobalt_tungsten_alloy");
	
	public static final Item IRON_ROD = new ItemBase("iron_rod");
	
	//Tools
	public static final ItemSword TUNGSTEN_SWORD = new Toolsword("tungsten_sword", MATERIAL_TUNGSTEN);
	
	public static final ItemSpade TUNGSTEN_SPADE = new ToolSpade("tungsten_spade", MATERIAL_TUNGSTEN);
	
	public static final ItemPickaxe TUNGSTEN_PICKAXE = new ToolPickaxe("tungsten_pickaxe", MATERIAL_TUNGSTEN);
	
	public static final ItemAxe TUNGSTEN_AXE = new ToolAxe("tungsten_axe", MATERIAL_TUNGSTEN);
	
	public static final ItemHoe TUNGSTEN_HOE = new ToolHoe("tungsten_hoe", MATERIAL_TUNGSTEN);
}
