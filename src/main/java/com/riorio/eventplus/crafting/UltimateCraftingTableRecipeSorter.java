package com.riorio.eventplus.crafting;

import java.util.Comparator;

import net.minecraft.item.crafting.IRecipe;

public class UltimateCraftingTableRecipeSorter implements Comparator {

	final UltimateCraftingManager workSurface;

	public UltimateCraftingTableRecipeSorter(UltimateCraftingManager workSurfaceCraftingManager) {
		this.workSurface = workSurfaceCraftingManager;
	}

	public int compareRecipes(IRecipe irecipe1, IRecipe irecipe2) {
		return irecipe1 instanceof UltimateCraftingShapelessRecipes && irecipe2 instanceof UltimateCraftingShapedRecipes ? 1: (irecipe2 instanceof UltimateCraftingShapelessRecipes && irecipe1 instanceof UltimateCraftingShapedRecipes ? -1 : (irecipe2.getRecipeSize() < irecipe1.getRecipeSize() ? -1 : (irecipe2.getRecipeSize() > irecipe1.getRecipeSize() ? 1 : 0)));
	}

	@Override
	public int compare(Object o1, Object o2) {
		return this.compareRecipes((IRecipe)o1, (IRecipe)o2);
	}

}
