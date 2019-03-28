package com.ew.tutorialmod.blocks;

import com.ew.tutorialmod.Main;
import com.ew.tutorialmod.init.ModBlocks;
import com.ew.tutorialmod.init.ModItems;
import com.ew.tutorialmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{
	
	public BlockBase(String name, Material material) {
		
		super(material); // call super method
		setUnlocalizedName(name); //set unlocalized name
		setRegistryName(name); // set registry name
		setCreativeTab(Main.TUTORIAL_TAB); // set creative tab
		
		ModBlocks.BLOCKS.add(this); // have to add to blocks list
		// blocks have to be both a block and an item
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
	
	

}
