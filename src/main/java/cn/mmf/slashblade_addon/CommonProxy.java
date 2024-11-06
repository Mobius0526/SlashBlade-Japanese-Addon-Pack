package cn.mmf.slashblade_addon;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import mods.flammpfeil.slashblade.SlashBlade;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.common.Thaumcraft;

public class CommonProxy {
	private static final SimpleNetworkWrapper network = NetworkRegistry.INSTANCE.newSimpleChannel(SJAP.MODID);

	public static SimpleNetworkWrapper getNetwork() {
		return network;
	}

	public void preInit(FMLPreInitializationEvent event) {
		// new ConfigLoader(event);
		// new SELoader();
		// new ItemLoader(event);
		// new BladeLoader(event);
		// network.registerMessage(new
		// PacketKeyMessageHandler(),PacketKeyMessage.class,0,Side.SERVER);
	}

	public void init(FMLInitializationEvent event) {

	}

	public void postInit(FMLPostInitializationEvent event) {

	}
}
