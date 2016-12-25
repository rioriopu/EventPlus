package com.riorio.eventplus.gui;

import com.riorio.eventplus.EventPlus;
import com.riorio.eventplus.inventory.ContainerUltimateCraftingTable;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {
	/*サーバ�?�側の処�?*/
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);

		if(entity != null) {
			switch(ID) {
				}
				return null;
		}

		if(ID == EventPlus.guiUltimateCraftingTable) {
			return ID == EventPlus.guiUltimateCraftingTable && world.getBlock(x, y, z) == EventPlus.UltimateCraftingTable ? new ContainerUltimateCraftingTable(player.inventory, world, x, y, z) : null;
		}

		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);

		if(entity != null) {
			switch(ID) {
				}
				return null;
		}

		if(ID == EventPlus.guiUltimateCraftingTable) {
			return ID == EventPlus.guiUltimateCraftingTable && world.getBlock(x, y, z) == EventPlus.UltimateCraftingTable ? new GuiUltimateCraftingTable(player.inventory, world, x, y, z) : null;
		}

		return null;
	}

}