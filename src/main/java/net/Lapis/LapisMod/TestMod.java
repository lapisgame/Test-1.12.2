package net.Lapis.LapisMod;


import net.Lapis.LapisMod.proxy.CommonProxy;
import net.Lapis.LapisMod.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class TestMod {

    @Mod.Instance
    public static TestMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event){
    }

    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event){
    }

    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event){

    }
}
