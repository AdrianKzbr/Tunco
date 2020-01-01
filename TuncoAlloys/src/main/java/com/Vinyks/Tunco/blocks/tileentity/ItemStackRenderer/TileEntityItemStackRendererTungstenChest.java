package com.Vinyks.Tunco.blocks.tileentity.ItemStackRenderer;

import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

import com.Vinyks.Tunco.blocks.tileentity.TileEntityTungstenChest;
import com.mojang.authlib.GameProfile;

import net.minecraft.block.Block;
import net.minecraft.block.BlockShulkerBox;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BannerTextures;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.tileentity.TileEntityShulkerBox;
import net.minecraft.tileentity.TileEntitySkull;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TileEntityItemStackRendererTungstenChest extends TileEntityItemStackRenderer
{
    private final TileEntityTungstenChest tunChest = new TileEntityTungstenChest();
    public static TileEntityItemStackRendererTungstenChest instance;
	
    @Override
	public void renderByItem(ItemStack itemStackIn)
    {
        this.renderByItem(itemStackIn, 1.0F);
    }

	@Override
    public void renderByItem(ItemStack p_192838_1_, float partialTicks)
    {
        Item item = p_192838_1_.getItem();

        TileEntityRendererDispatcher.instance.render(this.tunChest, 0.0D, 0.0D, 0.0D, 0.0F, partialTicks);
    }
	
    static
    {

        instance = new TileEntityItemStackRendererTungstenChest();
    }
}