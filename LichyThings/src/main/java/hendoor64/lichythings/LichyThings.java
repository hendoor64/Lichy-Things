package hendoor64.lichythings;

import hendoor64.lichythings.proxy.CommonProxy;
import hendoor64.lichythings.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class LichyThings 
{
	@Instance
	public static LichyThings instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
