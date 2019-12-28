package com.Vinyks.Tunco.blocks;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.Vinyks.Tunco.Main;
import com.Vinyks.Tunco.blocks.tileentity.TileEntityTungstenChest;
import com.Vinyks.Tunco.blocks.tileentity.ItemStackRenderer.CustomTextureAtlasSprite;
import com.Vinyks.Tunco.init.ModBlocks;
import com.Vinyks.Tunco.init.ModItems;
import com.Vinyks.Tunco.util.Reference;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemOverrideList;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TungstenChest extends BlockContainer implements IBakedModel {

	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	public static final AxisAlignedBB TUNGSTEN_CHEST_AABB = new AxisAlignedBB(0.9375D, 0.875D, 0.9375D, 0.0625D, 0, 0.0625D);
	
	public TungstenChest(String name) {
		super(Material.IRON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tuncotab);
		
        ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		//ItemStack stack = new ItemStack(Item.getItemFromBlock(ModBlocks.TUNGSTEN_CHEST));
        //stack.getItem().setTileEntityItemStackRenderer(com.Vinyks.Tunco.blocks.tileentity.ItemStackRenderer.TileEntityItemStackRendererTungstenChest.instance);
        
	}
	
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
	{
		
		if(!worldIn.isRemote)
		{
			/*IBlockState north = worldIn.getBlockState(pos.north());
			IBlockState south = worldIn.getBlockState(pos.south());
			IBlockState west = worldIn.getBlockState(pos.west());
			IBlockState east = worldIn.getBlockState(pos.east());
			EnumFacing face = (EnumFacing)state.getValue(FACING);
			
			if(face == EnumFacing.NORTH && north.isFullBlock() && !south.isFullBlock()) 
			{
				face = EnumFacing.SOUTH;
			}
			else if(face == EnumFacing.SOUTH && south.isFullBlock() && !north.isFullBlock()) 
			{
				face = EnumFacing.NORTH;
			}
			else if(face == EnumFacing.WEST && west.isFullBlock() && !east.isFullBlock()) 
			{
				face = EnumFacing.EAST;
			}
			else if(face == EnumFacing.EAST && east.isFullBlock() && !west.isFullBlock()) 
			{
				face = EnumFacing.WEST;
			}
			worldIn.setBlockState(pos, state.withProperty(FACING, face), 2);*/
			
		}
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		
		if(!worldIn.isRemote) 
		{
			playerIn.openGui(Main.instance, Reference.GUI_TUNGSTEN_CHEST, worldIn, pos.getX(), pos.getY(), pos.getZ());
		}
		
		return true;
	}
	/*
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock(ModBlocks.TUNGSTEN_CHEST);
	}
	*/
	
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) 
	{
		TileEntityTungstenChest tileentity = (TileEntityTungstenChest)worldIn.getTileEntity(pos);
		InventoryHelper.dropInventoryItems(worldIn, pos, tileentity);
		super.breakBlock(worldIn, pos, state);
	}
	
	
	
	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) 
	{
		if(stack.hasDisplayName()) 
		{
			TileEntity tileentity = worldIn.getTileEntity(pos);
		
			if(tileentity instanceof TileEntityTungstenChest) {
				((TileEntityTungstenChest)tileentity).setCustomName(stack.getDisplayName());
			}
		}
		
		TileEntityTungstenChest tile = (TileEntityTungstenChest)worldIn.getTileEntity(pos);
		tile.direction = placer.getHorizontalFacing().getHorizontalAngle() + 180.0F;
		if(placer.getHorizontalFacing().equals(EnumFacing.EAST))
		{
			tile.offSetZ = 1.0F;
		}
		else if(placer.getHorizontalFacing().equals(EnumFacing.SOUTH))
		{
			tile.offSetX = 1.0F;
			tile.offSetZ = 1.0F;
		}
		else if(placer.getHorizontalFacing().equals(EnumFacing.WEST))
		{
			tile.offSetX = 1.0F;
		}
	}
	
	
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) 
	{
		
		return new TileEntityTungstenChest();
	}
	
	public EnumBlockRenderType getRenderType(IBlockState state) 
	{
		return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
	}
	
	@Override
	public boolean isFullBlock(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return TUNGSTEN_CHEST_AABB;
	}

	@Override
	public List<BakedQuad> getQuads(IBlockState state, EnumFacing side, long rand) {
		return Collections.EMPTY_LIST;
	}

	@Override
	public boolean isAmbientOcclusion() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGui3d() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBuiltInRenderer() {
		return true;
	}

	@Override
	public TextureAtlasSprite getParticleTexture() {
		CustomTextureAtlasSprite x = new CustomTextureAtlasSprite("123");
		return x;
	}

	@Override
	public ItemOverrideList getOverrides() {
		return ItemOverrideList.NONE;
	}

}
