package net.silverelle.veristicmushrooms.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.silverelle.veristicmushrooms.Item.ModItems;
import net.silverelle.veristicmushrooms.VeristicMushrooms;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, VeristicMushrooms.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        basicItem(ModItems.MYCOLOGYBOOK.get());

        basicItem(ModItems.RAW_BROWNBUTTON.get());
        basicItem(ModItems.RAW_BAYBOLETE.get());
        basicItem(ModItems.RAW_CHANTERELLE.get());
        basicItem(ModItems.RAW_DEATHCAP.get());

        basicItem(ModItems.COOKED_BROWNBUTTON.get());
        basicItem(ModItems.COOKED_BAYBOLETE.get());
        basicItem(ModItems.COOKED_CHANTERELLE.get());
        basicItem(ModItems.COOKED_DEATHCAP.get());
    }
}
