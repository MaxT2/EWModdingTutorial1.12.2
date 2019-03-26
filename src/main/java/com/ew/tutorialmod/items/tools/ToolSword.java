package com.ew.tutorialmod.items.tools;

import com.ew.tutorialmod.Main;
import com.ew.tutorialmod.init.ModItems;
import com.ew.tutorialmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel{
	
	public ToolSword(String name, ToolMaterial material){
		super(material);
		setUnlocalizedName(name); //set unlocalized name
		setRegistryName(name); // set registry name
		setCreativeTab(CreativeTabs.TOOLS); // set creative tab
		
		// tell minecraft this is an item
		ModItems.ITEMS.add(this); // add this item to mod items list
	}
	
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}