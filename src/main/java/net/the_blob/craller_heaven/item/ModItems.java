package net.the_blob.craller_heaven.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.the_blob.craller_heaven.Craller_heaven;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Craller_heaven.MOD_ID);

public static final RegistryObject<Item> CRALLER = ITEMS.register("craller",
        () -> new Item(new Item.Properties()));

public static final RegistryObject<Item> CRALLER_SPAWN_EGG = ITEMS.register("craller_spawn_egg",
        () -> new Item(new Item.Properties()));

public static final RegistryObject<Item> QUEEN_CRALLER_SPAWN_EGG = ITEMS.register("queen_craller_spawn_egg",
        () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
