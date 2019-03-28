package com.ew.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;

import com.ew.tutorialmod.blocks.BlockBase;

//import com.ew.tutorialmod.blocks.BlockBase;
//import com.ew.tutorialmod.blocks.TristoniumBlock;
//import com.ew.tutorialmod.blocks.TristoniumOre;
//import com.ew.tutorialmod.blocks.TutorialOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//basic block with no properties
	public static final Block TRISTONIUM_BLOCK = new BlockBase("tristonium_block", Material.IRON );
	

//	public static final Block TRISTONIUM_BLOCK = new TristoniumBlock("tristonium_block", Material.IRON );
//	public static final Block TRISTONIUM_ORE = new TristoniumOre("tristonium_ore", Material.ROCK);
//	public static final Block TUTORIAL_ORE = new TutorialOre("tutorial_ore", Material.ROCK);
}


