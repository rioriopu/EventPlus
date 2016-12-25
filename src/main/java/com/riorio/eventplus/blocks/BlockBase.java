package com.riorio.eventplus.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class BlockBase
  extends Block
{
  public BlockBase()
  {
    super(Material.rock);
    setHardness(1.5F);
    setResistance(9999.0F);
    setStepSound(Block.soundTypeStone);
    setLightLevel(15.0F);
  }

  public void onNeighborBlockChange(World world, int x, int y, int z, Block Block) {

  }

  public int quantityDropped(Random random)
  {
    return 1;
  }
}