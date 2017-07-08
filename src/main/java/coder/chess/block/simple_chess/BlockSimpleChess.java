package coder.chess.block.simple_chess;

import coder.chess.ChessMain;
import coder.chess.ModGuiHandler;
import coder.chess.block.BlockTileEntity;
import jline.internal.Nullable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

/**
 * Created by Freestyle Coder on 6/27/2017.
 */
public class BlockSimpleChess extends BlockTileEntity<TileEntityChess> {
    public BlockSimpleChess() {
        super(Material.ROCK,"SimpleChessTable");
        setHardness(3f);
        setResistance(5f);
        this.setCreativeTab(ChessMain.creativeTab);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state,
                                    EntityPlayer playerIn, EnumHand hand, @javax.annotation.Nullable
                                    ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote) {
            if (playerIn.isSneaking()) {
            } else {
                playerIn.openGui(ChessMain.instance, ModGuiHandler.SIMPLE_CHESS, worldIn, pos.getX(), pos.getY(), pos.getZ());
            }
        }
        return true;
    }

    //hacky invisible ground workaround
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    public Class<TileEntityChess> getTileEntityClass() {
        return TileEntityChess.class;
    }

    @Nullable
    @Override
    public TileEntityChess createTileEntity(World world, IBlockState state) {
        return new TileEntityChess();
    }

    /*
    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {

        super.breakBlock(worldIn, pos, state);
    }
    */
}
