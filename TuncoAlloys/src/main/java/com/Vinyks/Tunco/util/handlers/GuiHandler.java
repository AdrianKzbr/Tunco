package com.Vinyks.Tunco.util.handlers;

import com.Vinyks.Tunco.blocks.container.ContainerTungstenChest;
import com.Vinyks.Tunco.blocks.gui.GuiTungstenChest;
import com.Vinyks.Tunco.blocks.tileentity.TileEntityTungstenChest;
import com.Vinyks.Tunco.util.Reference;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_TUNGSTEN_CHEST) return new ContainerTungstenChest(player.inventory, (TileEntityTungstenChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_TUNGSTEN_CHEST) return new GuiTungstenChest(player.inventory, (TileEntityTungstenChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		return null;
	}
	
	public static void registerGUIs()
	{
		
	}
}
