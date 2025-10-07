package net.the_blob.craller_heaven.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.the_blob.craller_heaven.Craller_heaven;
import net.the_blob.craller_heaven.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
         DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Craller_heaven.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CRALLER_TAB = CREATIVE_MODE_TABS.register("craller_tab", () ->CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CRALLER.get()))
            .title(Component.translatable("creativetab.craller_tab"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.CRALLER.get());

                output.accept(ModBlocks.CHARGER.get());

                output.accept(ModItems.CRALLER_SPAWN_EGG.get());
                output.accept(ModItems.QUEEN_CRALLER_SPAWN_EGG.get());

            })
            .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
