package coder.chess;

import coder.chess.block.ModBlocks;
import coder.chess.item.ModItems;
import coder.chess.proxy.CommonProxy;
import coder.chess.recipe.ModRecipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class ChessMain {
    public static final ModCreativeTab creativeTab = new ModCreativeTab();

    @Mod.Instance(Reference.MODID)
    public static ChessMain instance;

    @SidedProxy(serverSide = Reference.CommonProxy, clientSide = Reference.ClientProxy)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(Reference.NAME + " loaded :3");
        ModItems.init();
        ModBlocks.init();
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new ModGuiHandler());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}
