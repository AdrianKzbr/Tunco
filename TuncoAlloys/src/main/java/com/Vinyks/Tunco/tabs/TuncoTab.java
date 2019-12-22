package com.Vinyks.Tunco.tabs;

import com.Vinyks.Tunco.init.ModBlocks;
import com.Vinyks.Tunco.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TuncoTab extends CreativeTabs
{
		
			
	public TuncoTab(String label) 
	{
		super(label);
		this.setBackgroundImageName("defaulttab.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		 return new ItemStack(ModItems.COBALT_TUNGSTEN_ALLOY); //Item
		//return new ItemStack(Item.getItemFromBlock(ModBlocks.RUBY_BLOCK)); //Block
	}

}
