package net.silverelle.veristicmushrooms.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;
import net.silverelle.veristicmushrooms.Item.ModItems;
import net.silverelle.veristicmushrooms.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {

        this.add(ModBlocks.BAYBOLETE_BLOCK.get(), block -> createOreDrop(ModBlocks.BAYBOLETE_BLOCK.get(), ModItems.RAW_BAYBOLETE.get()));
    }

    protected LootTable.Builder createSilkTouchOnlyTable(Block pBlock) {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool().when(this.hasSilkTouch()).setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(pBlock)));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
