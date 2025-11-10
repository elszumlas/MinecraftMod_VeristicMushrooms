package net.silverelle.veristicmushrooms.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.silverelle.veristicmushrooms.VeristicMushrooms;
import net.silverelle.veristicmushrooms.block.ModBlocks;
import net.silverelle.veristicmushrooms.block.custom.MushroomBlock;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, VeristicMushrooms.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        mushroomBlock(ModBlocks.BAYBOLETE_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject)
    {
        simpleBlockItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    /**
     * Generates a mushroom-like block using a "cross" (two intersecting quads)
     * and also makes its item use the same flat model.
     */
    private void mushroomBlock(RegistryObject<Block> blockRegistryObject) {
        Block block = blockRegistryObject.get();

        // Make the cross-style model for the block
        ModelFile model = models().cross(name(block), blockTexture(block)).renderType("cutout");

        // Use the cross model for both the block and its item
        simpleBlock(block, model);
        simpleBlockItem(block, model);
    }

    /**
     * Helper to get a block’s registry name path (e.g., "baybolete_block").
     */
    private String name(Block block) {
        ResourceLocation key = ForgeRegistries.BLOCKS.getKey(block);
        if (key == null) throw new IllegalStateException("Block has no registry name: " + block);
        return key.getPath();
    }
}
