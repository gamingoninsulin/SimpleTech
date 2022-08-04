package com.github.gamingoninsulin.simpletech.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.github.gamingoninsulin.simpletech.SimpleTech.MOD_ID;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    // Aluminum Chunk
    public static final RegistryObject<Item> ALUMINUM_CHUNK = ITEMS.register("aluminum_chunk",
    () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    // Aluminum Ingot
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void Register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}