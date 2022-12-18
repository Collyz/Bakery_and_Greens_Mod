package net.collywobbles.greensmod;

import com.mojang.logging.LogUtils;
import net.collywobbles.greensmod.block.entity.ModBlockEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.collywobbles.greensmod.block.ModBlocks;
import net.collywobbles.greensmod.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GreensMod.MOD_ID)
public class GreensMod
{
    //net.collywobbles.greensmod
    public static final String MOD_ID = "greensmod";

    private static final Logger LOGGER = LogUtils.getLogger();
    public GreensMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //Registering mod items
        ModItems.register(modEventBus);
        //Registering mod blocks
        ModBlocks.register(modEventBus);

       // ModBlockEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
