package coder.chess.block;

import coder.chess.ChessMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

/**
 * Created by Freestyle Coder on 6/27/2017.
 */
public class BaseBlock extends Block{
    protected String name;

    public BaseBlock(Material material, String name) {
        super(material);

        this.name = name;

        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemBlock(ItemBlock itemBlock) {
        ChessMain.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    @Override
    public BaseBlock setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
