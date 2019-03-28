package com.ew.tutorialmod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TutorialTab extends CreativeTabs {

	public TutorialTab(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	public TutorialTab(int index, String label) {
		super(index, label);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack getTabIconItem() {
		// TODO Auto-generated method stub
		return new ItemStack(Items.IRON_INGOT);
	}

}
