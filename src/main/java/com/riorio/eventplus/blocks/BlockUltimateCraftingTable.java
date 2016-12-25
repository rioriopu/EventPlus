package com.riorio.eventplus.blocks;

import com.riorio.eventplus.EP;
import com.riorio.eventplus.EventPlus;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockUltimateCraftingTable extends Block{

	@SideOnly(Side.CLIENT)
	private IIcon Top;
	private int GUIID;

	public BlockUltimateCraftingTable() {
		super(Material.iron);
		this.setHardness(3.5F);
		this.setResistance(5.0F);
		this.setCreativeTab(EventPlus.EventPlusTab);
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon (int side, int metadata) {
		return side == 1 ? this.Top : this.blockIcon;
	}

	public void registerBlockIcons(final IIconRegister iconregister) {
		this.blockIcon = iconregister.registerIcon(EP.MODID+":crafting_table_front");
		this.Top = iconregister.registerIcon(EP.MODID+":crafting_table_top");
	}

	public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		if (!player.isSneaking()) {
			player.openGui(EventPlus.EventPlusInstance, EventPlus.guiUltimateCraftingTable, world, x, y, z);
			return true;
		}else{
			return false;
		}
	}


}

