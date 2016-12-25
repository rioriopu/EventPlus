package com.riorio.eventplus.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemEnchantBase extends Item {

	public ItemEnchantBase() {
		final String name = "ItemBase";
		this.maxStackSize = 64;
		return;
	}

    public boolean hasEffect(ItemStack p_77636_1_)
    {
        return true;
    }


}
