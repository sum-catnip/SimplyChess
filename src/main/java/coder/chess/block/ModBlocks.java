package coder.chess.block;

import coder.chess.block.simple_chess.BlockSimpleChess;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Freestyle Coder on 6/27/2017.
 */
public class ModBlocks {

    public static BlockSimpleChess simpleChess;

    public static void init() {
        simpleChess = register(new BlockSimpleChess());
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);

        if(block instanceof BaseBlock) {
            ((BaseBlock)block).registerItemBlock(itemBlock);
        }
        if(block instanceof BlockTileEntity) {
            GameRegistry.registerTileEntity(((
                    BlockTileEntity<?>)block).getTileEntityClass(), block.getRegistryName().toString());
        }

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
