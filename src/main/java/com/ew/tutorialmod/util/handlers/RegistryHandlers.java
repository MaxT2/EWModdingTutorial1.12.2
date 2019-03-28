package com.ew.tutorialmod.util.handlers;

import com.ew.tutorialmod.init.ModBlocks;
import com.ew.tutorialmod.init.ModItems;
import com.ew.tutorialmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
//@EventBusSubscriber
public class RegistryHandlers {

	// on item registry register all items in the ITEMS array in ModItems.java class
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event){
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}

	// on item registry register all items in the ITEMS array in ModItems.java class
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event){
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	} 

	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event){
		for(Item item : ModItems.ITEMS){
			if(item instanceof IHasModel){
				((IHasModel)item).registerModels();
			}
		}

		for(Block block : ModBlocks.BLOCKS){
			if(block instanceof IHasModel){
				((IHasModel)block).registerModels();
			}
		}


	}



}
