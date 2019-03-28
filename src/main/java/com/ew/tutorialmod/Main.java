package com.ew.tutorialmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.ew.tutorialmod.init.ModSmelting;
import com.ew.tutorialmod.proxy.CommonProxy;
import com.ew.tutorialmod.tabs.TutorialTab;
import com.ew.tutorialmod.util.Reference;
//import com.ew.tutorialmod.world.ModWorldGen;
import com.ew.tutorialmod.util.handlers.RegistryHandlers;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
	//global variables
	// first things kids should do is make a creative tab for their mod!
//	public static final CreativeTabs TRISTONIUM_TAB = new TristoniumTab("tristoniumtab");
	public static final CreativeTabs TUTORIAL_TAB = new TutorialTab("TutorialModTab");
	
	
	
	@Instance
	public static Main instance;
	
	
	
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
//	public Main(){
//		MinecraftForge.EVENT_BUS.register(new RegistryHandlers());
//	}

	
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {

//    	GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }

    @EventHandler
    public void Init(FMLInitializationEvent event)
    {
    	ModSmelting.init();
    }
    
    
    @EventHandler
    public void PostInit(FMLInitializationEvent event){
    	
    	
    }
    
}

