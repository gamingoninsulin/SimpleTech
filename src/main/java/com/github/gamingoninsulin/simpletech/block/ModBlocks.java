package com.github.gamingoninsulin.simpletech.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.github.gamingoninsulin.simpletech.SimpleTech.MOD_ID;
import static com.github.gamingoninsulin.simpletech.item.ModCreativeTab.CREATIVESIMPLEITEMSTAB;
import static com.github.gamingoninsulin.simpletech.item.ModItems.ITEMS;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

// Aluminum
    // Aluminum Ore (STONE)
    public static final RegistryObject<Block> ALUMINUM_ORE = registerBlock("aluminum_ore",
        () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(9f).
                sound(SoundType.STONE).requiresCorrectToolForDrops(),
                UniformInt.of(3,7)), CREATIVESIMPLEITEMSTAB);

    // Aluminum Ore (DEEPSLATE)
    public static final RegistryObject<Block> ALUMINUM_DEEPSLATE_ORE = registerBlock("aluminum_deepslate_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(9f).
                    sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), CREATIVESIMPLEITEMSTAB);

    // Aluminum block
    public static final RegistryObject<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f).
                    sound(SoundType.METAL).requiresCorrectToolForDrops()), CREATIVESIMPLEITEMSTAB);

// Tin
// Tin Ore
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).
                    sound(SoundType.STONE).requiresCorrectToolForDrops()), CREATIVESIMPLEITEMSTAB);

// tree stuff
    // Rubber Log
    public static final RegistryObject<Block> RUBBER_LOG = registerBlock("rubber_log",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f).
                    sound(SoundType.WOOD).requiresCorrectToolForDrops()), CREATIVESIMPLEITEMSTAB);

    // Rubber Log Sap
    public static final RegistryObject<Block> RUBBER_LOG_SAP = registerBlock("rubber_log_sap",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f).
                    sound(SoundType.WOOD).requiresCorrectToolForDrops()), CREATIVESIMPLEITEMSTAB);

    // Rubber Log Stripped
    public static final RegistryObject<Block> RUBBER_LOG_STRIPPED = registerBlock("rubber_log_stripped",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f).
                    sound(SoundType.WOOD).requiresCorrectToolForDrops()), CREATIVESIMPLEITEMSTAB);


    // Rubber Leaves
    public static final RegistryObject<Block> RUBBER_LEAVES = registerBlock("rubber_leaves",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f).
                    sound(SoundType.GRASS).requiresCorrectToolForDrops()), CREATIVESIMPLEITEMSTAB);


    // no blocks beneath here
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);

        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {

        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void Register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
