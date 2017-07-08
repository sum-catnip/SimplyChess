package coder.chess.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Freestyle Coder on 6/30/2017.
 */
public class ModItems {
    //black
    public static BaseItem black_pawn;
    public static BaseItem black_bishop;
    public static BaseItem black_king;
    public static BaseItem black_queen;
    public static BaseItem black_knight;
    public static BaseItem black_rook;

    //white
    public static BaseItem white_pawn;
    public static BaseItem white_bishop;
    public static BaseItem white_king;
    public static BaseItem white_queen;
    public static BaseItem white_knight;
    public static BaseItem white_rook;

    public static BaseItem checkerboard;
    public static BaseItem black_set;
    public static BaseItem white_set;

    public static void init() {
        //black
        black_pawn = register(new BaseItem("black_pawn"));
        black_bishop = register(new BaseItem("black_bishop"));
        black_king = register(new BaseItem("black_king"));
        black_queen = register(new BaseItem("black_queen"));
        black_knight = register(new BaseItem("black_knight"));
        black_rook = register(new BaseItem("black_rook"));

        //white
        white_pawn = register(new BaseItem("white_pawn"));
        white_bishop = register(new BaseItem("white_bishop"));
        white_king = register(new BaseItem("white_king"));
        white_queen = register(new BaseItem("white_queen"));
        white_knight = register(new BaseItem("white_knight"));
        white_rook = register(new BaseItem("white_rook"));

        //other
        checkerboard = register(new BaseItem("checkerboard"));
        black_set = register(new BaseItem("black_set"));
        white_set = register(new BaseItem("white_set"));
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if(item instanceof BaseItem) {
            ((BaseItem)item).registerItemModel();
        }

        return item;
    }
}
