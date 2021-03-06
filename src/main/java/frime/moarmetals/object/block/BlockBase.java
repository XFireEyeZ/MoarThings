package frime.moarmetals.object.block;

import frime.moarmetals.MoarMetals;
import frime.moarmetals.init.Metals;
import frime.moarmetals.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

	public BlockBase(String name, Material material, CreativeTabs tab) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		Metals.BLOCKS.add(this);
		Metals.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		MoarMetals.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
