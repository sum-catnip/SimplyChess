package coder.chess.block.simple_chess;

import coder.chess.item.ModItems;
import jline.internal.Nullable;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

/**
 * Created by Freestyle Coder on 6/27/2017.
 */
public class TileEntityChess extends TileEntity {
    private ItemStackHandler m_inventory = new ItemStackHandler(Constants.ALL_SLOTS);

    public TileEntityChess() {
        //put white pieces on left side
        int i = Constants.WHITE_INDEX_START;
        //didnt want to destroy the symmetry xD
        m_inventory.setStackInSlot(i + 0, new ItemStack(ModItems.white_pawn,  8));
        m_inventory.setStackInSlot(i + 1, new ItemStack(ModItems.white_knight,2));
        m_inventory.setStackInSlot(i + 2, new ItemStack(ModItems.white_bishop,2));
        m_inventory.setStackInSlot(i + 3, new ItemStack(ModItems.white_rook,  2));
        m_inventory.setStackInSlot(i + 4, new ItemStack(ModItems.white_queen, 1));
        m_inventory.setStackInSlot(i + 5, new ItemStack(ModItems.white_king,  1));

        //put black pieces on right side
        i = Constants.BLACK_INDEX_START;
        m_inventory.setStackInSlot(i + 0, new ItemStack(ModItems.black_pawn,  8));
        m_inventory.setStackInSlot(i + 1, new ItemStack(ModItems.black_knight,2));
        m_inventory.setStackInSlot(i + 2, new ItemStack(ModItems.black_bishop,2));
        m_inventory.setStackInSlot(i + 3, new ItemStack(ModItems.black_rook,  2));
        m_inventory.setStackInSlot(i + 4, new ItemStack(ModItems.black_queen, 1));
        m_inventory.setStackInSlot(i + 5, new ItemStack(ModItems.black_king,  1));
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        compound.setTag("inventory", m_inventory.serializeNBT());
        return super.writeToNBT(compound);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        m_inventory.deserializeNBT(compound.getCompoundTag("inventory"));
        super.readFromNBT(compound);
    }

    @Override
    public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing) {
        return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY || super.hasCapability(capability, facing);
    }

    @Nullable
    @Override
    public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing) {
        return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY ?
                (T)m_inventory : super.getCapability(capability, facing);
    }
}
