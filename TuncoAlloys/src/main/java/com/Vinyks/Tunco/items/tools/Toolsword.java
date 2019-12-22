package com.Vinyks.Tunco.items.tools;

import com.Vinyks.Tunco.Main;
import com.Vinyks.Tunco.init.ModItems;
import com.Vinyks.Tunco.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class Toolsword extends ItemSword implements IHasModel
	{


	public Toolsword(String name, ToolMaterial material)
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

