package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraft.block.Block;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)

public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    
    public static Block scriptBlock;  
    
    @SuppressWarnings("deprecation")
	@EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
        
        scriptBlock = new Block(null);
        
        GameRegistry.registerBlock(scriptBlock, "Script");
    }
}
