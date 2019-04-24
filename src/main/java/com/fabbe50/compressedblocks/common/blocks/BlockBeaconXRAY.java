package com.fabbe50.compressedblocks.common.blocks;

import com.fabbe50.compressedblocks.common.tileentities.TileEntityBeaconXray;
import com.fabbe50.compressedblocks.core.registry.StatsRegistry;
import com.fabbe50.compressedblocks.core.utils.helper.ChatHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by fabbe50 on 10/12/2016.
 */
public class BlockBeaconXRAY extends BlockContainer {
    public BlockBeaconXRAY(Material material, MapColor mapColor, String modid, String name, float hardness, float resistance, CreativeTabs tab) {
        super(material, mapColor);
        this.setRegistryName(modid, name);
        this.setTranslationKey(this.getRegistryName().toString());
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setCreativeTab(tab);
    }

    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityBeaconXray();
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (worldIn.isRemote) {
            return true;
        }
        else {
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof TileEntityBeaconXray) {
                playerIn.displayGUIChest((TileEntityBeaconXray) tileentity);
                playerIn.addStat(StatsRegistry.POWERBEACONINTERACTION);
            }

            return true;
        }
    }

    @SuppressWarnings("deprecation")
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @SuppressWarnings("deprecation")
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        super.onBlockPlacedBy(worldIn, pos, state, placer, stack);

        if (stack.hasDisplayName()) {
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof TileEntityBeaconXray) {
                ((TileEntityBeaconXray) tileentity).setName(stack.getDisplayName());
            }
        }
    }

    @SuppressWarnings("deprecation")
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
        TileEntity tileentity = worldIn.getTileEntity(pos);

        if (tileentity instanceof TileEntityBeaconXray) {
            ((TileEntityBeaconXray) tileentity).updateBeacon();
            worldIn.addBlockEvent(pos, this, 1, 0);
        }
    }

    public static void updateColorAsync(final World worldIn, final BlockPos glassPos) {
        HttpUtil.DOWNLOADER_EXECUTOR.submit(new Runnable() {
            public void run() {
                Chunk chunk = worldIn.getChunk(glassPos);

                for (int i = glassPos.getY() - 1; i >= 0; --i) {
                    final BlockPos blockpos = new BlockPos(glassPos.getX(), i, glassPos.getZ());

                    IBlockState iblockstate = worldIn.getBlockState(blockpos);

                    if (iblockstate.getBlock() == Blocks.BEACON) {
                        ((WorldServer) worldIn).addScheduledTask(new Runnable() {
                            public void run() {
                                TileEntity tileentity = worldIn.getTileEntity(blockpos);

                                if (tileentity instanceof TileEntityBeaconXray) {
                                    ((TileEntityBeaconXray) tileentity).updateBeacon();
                                    worldIn.addBlockEvent(blockpos, Blocks.BEACON, 1, 0);
                                }
                            }
                        });
                    }
                }
            }
        });
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, @Nullable World world, List<String> tooltip, ITooltipFlag advanced) {
        tooltip.add(ChatHelper.PURPLE + "Emits a beam of light strong enough to pass through blocks.");
        tooltip.add("");
        tooltip.add(ChatHelper.DARK_GRAY + "Broken item texture :(");
    }
}
