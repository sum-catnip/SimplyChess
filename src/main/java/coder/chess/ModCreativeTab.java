package coder.chess;

import coder.chess.block.ModBlocks;
import coder.chess.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

/**
 * Created by Freestyle Coder on 7/2/2017.
 */
public class ModCreativeTab extends CreativeTabs {
    public ModCreativeTab() {
        super(Reference.MODID);
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.checkerboard;
    }
}
