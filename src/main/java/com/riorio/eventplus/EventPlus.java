package com.riorio.eventplus;

import com.riorio.eventplus.blocks.BlockEnchantBase;
import com.riorio.eventplus.blocks.BlockUltimateCraftingTable;
import com.riorio.eventplus.common.CommonProxy;
import com.riorio.eventplus.gui.GuiHandler;
import com.riorio.eventplus.items.ItemBase;
import com.riorio.eventplus.items.ItemEnchantBase;
import com.riorio.eventplus.tools.HammerBase;
import com.riorio.eventplus.tools.SawBase;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = EP.MODID, name = EP.MODID, version = EP.VERSION)
public class EventPlus {
	@SidedProxy(clientSide = "com.riorio.eventplus.common.ClientProxy", serverSide = "com.riorio.eventplus.common.ServerProxy")
	public static CommonProxy proxy;
	public static SimpleNetworkWrapper NETWORK;
	@Mod.Metadata
	public static ModMetadata meta;
	@Mod.Instance("EventPlus")
	public static EventPlus EventPlusInstance;
	public static Item GenerationCore;
	public static Item AdvancedGenerationCore;
	public static Item EndingIngot;
	public static Item EndingNugget;
	public static Block EndingBlock;
	public static Block UltimateCraftingTable;
	public static Item AmuletOfGaia;
	public static Item AmuletOfDignity;
	public static Item DropOfTheEarth;
	public static Item TestHammer;
	public static Item IronHammer;
	public static Item GoldHammer;
	public static Item UraniumHammer;
	public static Item SteelHammer;
	public static Item TinHammer;
	public static Item DiamondHammer;
	public static Item SuperHammer;
	public static Item TestSaw;
	public static Item IronSaw;
	public static Item GoldSaw;
	public static Item UraniumSaw;
	public static Item SteelSaw;
	public static Item TinSaw;
	public static Item DiamondSaw;
	public static Item SuperSaw;

	public static final int guiUltimateCraftingTable = 0;

	@EventHandler
	public void preInit(final FMLPreInitializationEvent event) {
		NETWORK = NetworkRegistry.INSTANCE.newSimpleChannel("eventplus");

		GenerationCore = new ItemBase().setUnlocalizedName("GenerationCore").setTextureName("eventplus:GenerationCore").setCreativeTab(EventPlusTab);
		AdvancedGenerationCore = new ItemEnchantBase().setUnlocalizedName("AdvancedGenerationCore").setTextureName("eventplus:GenerationCore").setCreativeTab(EventPlusTab);
		EndingIngot = new ItemEnchantBase().setUnlocalizedName("EndingIngot").setTextureName("eventplus:ending_ingot").setCreativeTab(EventPlusTab);
		EndingNugget = new ItemEnchantBase().setUnlocalizedName("EndingNugget").setTextureName("eventplus:ending_nugget").setCreativeTab(EventPlusTab);
		AmuletOfGaia = new ItemEnchantBase().setUnlocalizedName("AmuletOfGaia").setTextureName("eventplus:AmuletOfGaia").setCreativeTab(EventPlusTab);
		AmuletOfDignity = new ItemEnchantBase().setUnlocalizedName("AmuletOfDignity").setTextureName("eventplus:AmuletOfDignity").setCreativeTab(EventPlusTab);
		DropOfTheEarth = new ItemEnchantBase().setUnlocalizedName("DropOfTheEarth").setTextureName("eventplus:DropOfTheEarth").setCreativeTab(EventPlusTab);

		EndingBlock = new BlockEnchantBase().setBlockName("EndingBlock").setBlockTextureName("eventplus:ending_metal_block").setCreativeTab(EventPlusTab);
		UltimateCraftingTable = new BlockUltimateCraftingTable().setBlockName("UltimateCraftingTable").setBlockTextureName("eventplus:UltimateCraftingTable").setCreativeTab(EventPlusTab);

		TestHammer = new HammerBase().setUnlocalizedName("TestHammer").setMaxDamage(0).setCreativeTab(EventPlusTab);
		IronHammer = new HammerBase().setUnlocalizedName("IronHammer").setMaxDamage(256).setTextureName("eventplus:IronHammer").setCreativeTab(EventPlusTab);
		GoldHammer = new HammerBase().setUnlocalizedName("GoldHammer").setMaxDamage(33).setTextureName("eventplus:GoldHammer").setCreativeTab(EventPlusTab);
		SteelHammer = new HammerBase().setUnlocalizedName("SteelHammer").setMaxDamage(1200).setTextureName("eventplus:SteelHammer").setCreativeTab(EventPlusTab);
		UraniumHammer = new HammerBase().setUnlocalizedName("UraniumHammer").setMaxDamage(564).setTextureName("eventplus:IronHammer").setCreativeTab(EventPlusTab);
		DiamondHammer = new HammerBase().setUnlocalizedName("DiamondHammer").setMaxDamage(1300).setTextureName("eventplus:DiamondHammer").setCreativeTab(EventPlusTab);
		SuperHammer = new HammerBase().setUnlocalizedName("SuperHammer").setMaxDamage(0).setTextureName("eventplus:SuperHammer").setCreativeTab(EventPlusTab);

		TestSaw = new SawBase().setUnlocalizedName("TestSaw").setMaxDamage(0).setCreativeTab(EventPlusTab);
		IronSaw = new SawBase().setUnlocalizedName("IronSaw").setMaxDamage(256).setTextureName("eventplus:IronSaw").setCreativeTab(EventPlusTab);
		GoldSaw = new SawBase().setUnlocalizedName("GoldSaw").setMaxDamage(33).setTextureName("eventplus:GoldSaw").setCreativeTab(EventPlusTab);
		SteelSaw = new SawBase().setUnlocalizedName("SteelSaw").setMaxDamage(1300).setTextureName("eventplus:SteelSaw").setCreativeTab(EventPlusTab);
		UraniumSaw = new SawBase().setUnlocalizedName("UraniumSaw").setMaxDamage(564).setTextureName("eventplus:IronSaw").setCreativeTab(EventPlusTab);
		DiamondSaw = new SawBase().setUnlocalizedName("DiamondSaw").setMaxDamage(1000).setTextureName("eventplus:DiamondSaw").setCreativeTab(EventPlusTab);
		SuperSaw = new SawBase().setUnlocalizedName("SuperSaw").setMaxDamage(0).setTextureName("eventplus:SuperSaw").setCreativeTab(EventPlusTab);

		GameRegistry.registerItem(GenerationCore, "GenerationCore");
		GameRegistry.registerItem(AdvancedGenerationCore, "AdvancedGenerationCore");
		GameRegistry.registerItem(EndingIngot, "EndingIngot");
		GameRegistry.registerItem(EndingNugget, "EndingNugget");
		GameRegistry.registerItem(AmuletOfGaia, "AmuletOfGaia");
		GameRegistry.registerItem(AmuletOfDignity, "AmuletOfDignity");
		GameRegistry.registerItem(DropOfTheEarth, "DropOfTheEarth");

		GameRegistry.registerBlock(EndingBlock, "EndingBlock");
		GameRegistry.registerBlock(UltimateCraftingTable, "UltimateCraftingTable");

		GameRegistry.registerItem(IronHammer, "IronHammer");
		GameRegistry.registerItem(TestHammer, "TestHammer");
		GameRegistry.registerItem(GoldHammer, "GoldHammer");
		GameRegistry.registerItem(UraniumHammer, "UraniumHammer");
		GameRegistry.registerItem(SteelHammer, "SteelHammer");
		GameRegistry.registerItem(DiamondHammer, "DiamondHammer");
		GameRegistry.registerItem(SuperHammer, "SuperHammer");

		GameRegistry.registerItem(IronSaw, "IronSaw");
		GameRegistry.registerItem(TestSaw, "TestSaw");
		GameRegistry.registerItem(GoldSaw, "GoldSaw");
		GameRegistry.registerItem(UraniumSaw, "UraniumSaw");
		GameRegistry.registerItem(SteelSaw, "SteelSaw");
		GameRegistry.registerItem(DiamondSaw, "DiamondSaw");
		GameRegistry.registerItem(SuperSaw, "SuperSaw");
	}

	@Mod.EventHandler
	public void init(final FMLInitializationEvent e) {
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());

		proxy.registerTileEntities();
	}

	public static CreativeTabs EventPlusTab = new CreativeTabs("EventPlus") {
		@Override
		public Item getTabIconItem() {
			return EventPlus.GenerationCore;
		}
	};
}