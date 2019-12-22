package com.Vinyks.Tunco.items.tools;

import com.Vinyks.Tunco.Main;
import com.Vinyks.Tunco.init.ModItems;
import com.Vinyks.Tunco.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;

public class ToolHoe extends ItemHoe implements IHasModel
		{


		public ToolHoe(String name, ToolMaterial material)
		{
			super(material);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(CreativeTabs.MATERIALS);
		
			ModItems.ITEMS.add(this);
		}	
		
		@Override
		public void registerModels() 
		{
			
			Main.proxy.registerItemRenderer(this, 0, "inventory");
			
		}

	}

