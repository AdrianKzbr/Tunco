package com.Vinyks.Tunco.items.tools;

import com.Vinyks.Tunco.Main;
import com.Vinyks.Tunco.init.ModItems;
import com.Vinyks.Tunco.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;

public class ToolAxe extends ItemAxe implements IHasModel
		{


		public ToolAxe(String name, ToolMaterial material)
		{
			super(material, 8.0F, -3.2F);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(Main.tuncotab);
		
			ModItems.ITEMS.add(this);
		}	
		
		@Override
		public void registerModels() 
		{
			
			Main.proxy.registerItemRenderer(this, 0, "inventory");
			
		}

	}

