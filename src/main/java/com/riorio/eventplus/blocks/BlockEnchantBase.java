package com.riorio.eventplus.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockEnchantBase
  extends Block
{
  public BlockEnchantBase()
  {
    super(Material.rock);
    setHardness(1.5F);
    setResistance(9999.0F);
    setStepSound(Block.soundTypeStone);
    setLightLevel(15.0F);
  }

  public void onNeighborBlockChange(World world, int x, int y, int z, Block Block) {}

  public boolean hasBlockEffect(ItemStack p_77636_1_)
  {
    return true;
  }

  public int quantityDropped(Random random)
  {
    return 1;
  }
}
