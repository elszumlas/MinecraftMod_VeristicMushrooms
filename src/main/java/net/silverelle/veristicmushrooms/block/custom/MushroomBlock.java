package net.silverelle.veristicmushrooms.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Optional;

public class MushroomBlock extends Block {

    public MushroomBlock(Properties properties) {
        super(properties);
    }

    protected static final VoxelShape SHAPE = Block.box(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);

    @Override
    protected VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockState belowState = level.getBlockState(pos.below());
        return belowState.is(Blocks.DIRT)
                || belowState.is(Blocks.GRASS_BLOCK)
                || belowState.is(Blocks.MYCELIUM)
                || belowState.is(Blocks.SOUL_SOIL)
                || belowState.is(Blocks.COARSE_DIRT)
                || belowState.is(Blocks.MOSS_BLOCK);
    }


}
