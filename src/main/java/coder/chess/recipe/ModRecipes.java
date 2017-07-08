package coder.chess.recipe;

import coder.chess.block.ModBlocks;
import coder.chess.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Freestyle Coder on 7/1/2017.
 */
public class ModRecipes {
    public static void init() {
        // -=-=[ WHITE CHESS PIECES ]=-=-

        //white pawn
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.white_pawn),
                "   ",
                " Q ",
                " Q ",
                'Q', Items.QUARTZ);

        //white queen
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.white_queen),
                "Q Q",
                "QQQ",
                "QQQ",
                'Q', Items.QUARTZ);

        //white king
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.white_king),
                " Q ",
                "QQQ",
                "QQQ",
                'Q', Items.QUARTZ);

        //white bishop
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.white_bishop),
                " Q ",
                " Q ",
                "QQQ",
                'Q', Items.QUARTZ);

        //white knight
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.white_knight),
                "QQ ",
                " Q ",
                " Q ",
                'Q', Items.QUARTZ);

        //white rook
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.white_rook),
                " QQ",
                " QQ",
                " QQ",
                'Q', Items.QUARTZ);

        // -=-=[ BLACK CHESS PIECES ]=-=-

        //black pawn
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.black_pawn),
                "   ",
                " L ",
                " L ",
                'L', new ItemStack(Items.DYE, 1, 4));

        //black queen
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.black_queen),
                "L L",
                "LLL",
                "LLL",
                'L', new ItemStack(Items.DYE, 1, 4));

        //black king
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.black_king),
                " L ",
                "LLL",
                "LLL",
                'L', new ItemStack(Items.DYE, 1, 4));

        //black bishop
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.black_bishop),
                " L ",
                " L ",
                "LLL",
                'L', new ItemStack(Items.DYE, 1, 4));

        //black knight
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.black_knight),
                "LL ",
                " L ",
                " L ",
                'L', new ItemStack(Items.DYE, 1, 4));

        //black rook
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.black_rook),
                " LL",
                " LL",
                " LL",
                'L', new ItemStack(Items.DYE, 1, 4));

        // -=-=[ OTHER ITEMS ]=-=-

        //checkerboard
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.checkerboard),
                "QCQ",
                "CQC",
                "QCQ",
                'Q', Blocks.QUARTZ_BLOCK,
                'C', Blocks.COAL_BLOCK);

        //white_set
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.white_set),
                ModItems.white_pawn,
                ModItems.white_knight,
                ModItems.white_bishop,
                ModItems.white_rook,
                ModItems.white_queen,
                ModItems.white_king,
                Blocks.CHEST);

        //black_set
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.black_set),
                ModItems.black_pawn,
                ModItems.black_knight,
                ModItems.black_bishop,
                ModItems.black_rook,
                ModItems.black_queen,
                ModItems.black_king,
                Blocks.CHEST);

        // -=-=[ BLOCKS ]=-=-

        //chess table
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.simpleChess),
                "BOW",
                "SAS",
                "SSS",
                'B', ModItems.black_set,
                'W', ModItems.white_set,
                'O', ModItems.checkerboard,
                'S', Blocks.BRICK_BLOCK,
                'A', Items.WATER_BUCKET);
    }
}
