package com.riorio.eventplus.gui;

import com.riorio.eventplus.EventPlus;
import com.riorio.eventplus.inventory.ContainerUltimateCraftingTable;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {

	public static int GUI_ID;

	public GuiHandler() {

	}

	@Override
	public Object getServerGuiElement(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z) {
		/*TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case Nealecraft.guiIDAlabasterOven:
				if (entity instanceof TileEntityAlabasterOven) {
					return new ContainerAlabasterOven(player.inventory, (TileEntityAlabasterOven) entity);
				}
				return null;
		
			case Nealecraft.guiIDIngotMasher:
				if (entity instanceof TileEntityIngotMasher) {
					return new ContainerIngotMasher(player.inventory, (TileEntityIngotMasher) entity);
				return null;
			}
		}*/

		if (ID==EventPlus.guiUltimateCraftingTable)
			return ID==EventPlus.guiUltimateCraftingTable&&world.getBlock(x, y, z)==EventPlus.UltimateCraftingTable ? new ContainerUltimateCraftingTable(player.inventory, world, x, y, z) : null;

		return null;
	}

	@Override
	public Object getClientGuiElement(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z) {
		/*TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case Nealecraft.guiIDAlabasterOven:
				if (entity instanceof TileEntityAlabasterOven) {
					return new GuiAlabasterOven(player.inventory, (TileEntityAlabasterOven) entity);
				}
				return null;
		
			case Nealecraft.guiIDIngotMasher:
				if (entity instanceof TileEntityIngotMasher) {
					return new GuiIngotMasher(player.inventory, (TileEntityIngotMasher) entity);
				}
				return null;
			}
		}*/

		if (ID==EventPlus.guiUltimateCraftingTable)
			return ID==EventPlus.guiUltimateCraftingTable&&world.getBlock(x, y, z)==EventPlus.UltimateCraftingTable ? new GuiUltimateCraftingTable(player.inventory, world, x, y, z) : null;

		return null;
	}

}