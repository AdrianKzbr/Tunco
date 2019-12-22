package com.Vinyks.Tunco.blocks.gui;

import com.Vinyks.Tunco.blocks.container.ContainerTungstenChest;
import com.Vinyks.Tunco.blocks.tileentity.TileEntityTungstenChest;
import com.Vinyks.Tunco.util.Reference;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiTungstenChest extends GuiContainer 
{

	private static final ResourceLocation GUI_CHEST = new ResourceLocation(Reference.MOD_ID +":textures/gui/tungsten_chest.png");
	private final InventoryPlayer playerInventory;
	private final TileEntityTungstenChest tm;
	
	public GuiTungstenChest(InventoryPlayer playerInventory, TileEntityTungstenChest tm, EntityPlayer player)
	{
		super(new ContainerTungstenChest(playerInventory, tm, player));
		
		this.playerInventory = playerInventory;
		this.tm = tm;
		
		this.xSize = 179; 
		this.ySize = 256;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) 
	{
		this.fontRenderer.drawString(this.tm.getDisplayName().getFormattedText(), 8, 6, 788791);
		this.fontRenderer.drawString(this.playerInventory.getDisplayName().getUnformattedText(),  8, this.ySize - 92, 788791);
	}
	
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) 
	{
		GlStateManager.color(1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(GUI_CHEST);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
		
	}

}
