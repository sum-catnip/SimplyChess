package coder.chess.proxy;

import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;

/**
 * Created by Freestyle Coder on 6/27/2017.
 */
public class CommonProxy {
    public void registerItemRenderer(Item item, int meta, String id) {
        //needs to be empty!!!
    }

    public String localize(String unlocalized, Object... args) {
        return I18n.format(unlocalized, args);
    }
}
