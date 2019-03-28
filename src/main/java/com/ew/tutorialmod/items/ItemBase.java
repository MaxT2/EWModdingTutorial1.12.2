package com.ew.tutorialmod.items;

import com.ew.tutorialmod.Main;
import com.ew.tutorialmod.init.ModItems;
import com.ew.tutorialmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name){
		setUnlocalizedName(name); //set unlocalized name
		setRegistryName(name); // set registry name
		setCreativeTab(Main.TUTORIAL_TAB); // set creative tab
		
		// tell minecraft this is an item
		ModItems.ITEMS.add(this); // add this item to mod items list
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}

