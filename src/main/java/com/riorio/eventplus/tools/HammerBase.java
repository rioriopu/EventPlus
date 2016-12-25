package com.riorio.eventplus.tools;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class HammerBase extends Item {
	private boolean repair = false;

	public HammerBase() {
		super();
		setMaxStackSize(1);
		//効果がわかりやすいように数値を低く設�?
	}

	//アイ�?�?がクラフト後に戻らな�?ようにする
	@Override
	public boolean doesContainerItemLeaveCraftingGrid(final ItemStack par1ItemStack) {
		return false;
	}

	//修�?以外ならクラフト後にgetContainerItemStackを呼び出�?
	@Override
	public boolean hasContainerItem() {
		return !this.repair;
	}

	//修�?かど�?かを判定す�?
	@SubscribeEvent
	public void onCrafting(final ItemCraftedEvent event) {
		//IDが無くなった�?�で、アイ�?�?インスタンスで比�?�?

	}

	//クラフト後�?�アイ�?�?を�?�ダメージを与えて返す
	@Override
	public ItemStack getContainerItem(final ItemStack itemStack) {
		if (itemStack!=null&&itemStack.getItem()==this)
			itemStack.setItemDamage(itemStack.getItemDamage()+1);
		return itemStack;
	}

}
