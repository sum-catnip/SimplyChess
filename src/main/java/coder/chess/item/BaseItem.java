package coder.chess.item;

import coder.chess.ChessMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Freestyle Coder on 6/30/2017.
 */
public class BaseItem extends Item {
    protected String name;

    public BaseItem(String name) {
        this.name = name;
        this.setCreativeTab(ChessMain.creativeTab);
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        ChessMain.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public BaseItem setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
