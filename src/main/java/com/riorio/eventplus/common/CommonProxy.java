package com.riorio.eventplus.common;


import com.riorio.eventplus.EventPlus;
import com.riorio.eventplus.gui.GuiHandler;

import cpw.mods.fml.common.network.NetworkRegistry;

public abstract class CommonProxy {
	public void registerRenderThings() {
	}

	public int addArmor(final String armor) {
		return 0;
	}

	public void registerNetworkStuff() {
		NetworkRegistry.INSTANCE.registerGuiHandler(EventPlus.EventPlusInstance, new GuiHandler());
	}

	public void registerTileEntities() {
	//	GameRegistry.registerTileEntity(TileEntityMachineSmelter.class, NDCID.MODID+"DiamondSmelter");
	//	GameRegistry.registerTileEntity(TileEntityMachineDiamondAlloySmelter.class, NDCID.MODID+"AlloyFurnace");
	//
	//	GameRegistry.registerTileEntity(TileEntityEngineDiamond.class, "engine.diamondengine");

	}

}
