package com.riorio.eventplus.blocks;

import com.riorio.eventplus.EP;
import com.riorio.eventplus.EventPlus;
import com.riorio.eventplus.gui.GuiHandler;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockUltimateCraftingTable extends Block {
	public static int GUI_ID;

	@SideOnly(Side.CLIENT)
	private IIcon Top;
	private int GUIID;

	public BlockUltimateCraftingTable() {
		super(Material.iron);
		setHardness(3.5F);
		setResistance(5.0F);
		setCreativeTab(EventPlus.EventPlusTab);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(final int side, final int metadata) {
		return side==1 ? this.Top : this.blockIcon;
	}

	@Override
	public void registerBlockIcons(final IIconRegister iconregister) {
		this.blockIcon = iconregister.registerIcon(EP.MODID+":crafting_table_front");
		this.Top = iconregister.registerIcon(EP.MODID+":crafting_table_top");
	}

	@Override
	public boolean onBlockActivated(final World World, final int par2, final int par3, final int par4, final EntityPlayer par5EntityPlayer, final int par6, final float par7, final float par8, final float par9) {
		if (World.isRemote)
			return true;
		par5EntityPlayer.openGui(EventPlus.EventPlusInstance, GuiHandler.GUI_ID = 0, World, par2, par3, par4);

		return true;
	}

}
