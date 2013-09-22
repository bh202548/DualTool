package Brendan.Hansknecht.DualTool;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class CraftingHandler implements ICraftingHandler {

	int uses,damage;
	
	@Override
	public void onCrafting(EntityPlayer player, ItemStack item,
			IInventory craftMatrix) {
		for(int i=0; i < craftMatrix.getSizeInventory(); i++) //Checks all the slots
		{               
		if(craftMatrix.getStackInSlot(i) != null) //If there is an item
		{
		ItemStack j = craftMatrix.getStackInSlot(i); //Gets the item
		if(j.getItem() != null && j.getItem() == mod_DualTool.smithhammerStone) //If it's a firestone
		{
			uses = j.getItemDamage();
			damage = uses+2;
		         ItemStack k = new ItemStack(mod_DualTool.smithhammerStone, 2,damage); //Makes a new itemstack that's been damaged and has 2 items
		         if (k.getItemDamage() >= k.getMaxDamage()) {
		        	 k.stackSize--;
		        }
		         craftMatrix.setInventorySlotContents(i, k); //Sets the slot to the new item
		}
		if(j.getItem() != null && j.getItem() == mod_DualTool.smithhammerIron) //If it's a firestone
		{
			uses = j.getItemDamage();
			damage = uses+2;
		         ItemStack k = new ItemStack(mod_DualTool.smithhammerIron, 2,damage); //Makes a new itemstack that's been damaged and has 2 items
		         if (k.getItemDamage() >= k.getMaxDamage()) {
		        	 k.stackSize--;
		        }
		         craftMatrix.setInventorySlotContents(i, k); //Sets the slot to the new item
		}
		if(j.getItem() != null && j.getItem() == mod_DualTool.smithhammerGold) //If it's a firestone
		{
			uses = j.getItemDamage();
			damage = uses+2;
		         ItemStack k = new ItemStack(mod_DualTool.smithhammerGold, 2,damage); //Makes a new itemstack that's been damaged and has 2 items
		         if (k.getItemDamage() >= k.getMaxDamage()) {
		        	 k.stackSize--;
		        }
		         craftMatrix.setInventorySlotContents(i, k); //Sets the slot to the new item
		}
		if(j.getItem() != null && j.getItem() == mod_DualTool.smithhammerDiamond) //If it's a firestone
		{
			uses = j.getItemDamage();
			damage = uses+2;
		         ItemStack k = new ItemStack(mod_DualTool.smithhammerDiamond, 2,damage); //Makes a new itemstack that's been damaged and has 2 items
		         if (k.getItemDamage() >= k.getMaxDamage()) {
		        	 k.stackSize--;
		        }
		         craftMatrix.setInventorySlotContents(i, k); //Sets the slot to the new item
		}
		}
		}

	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		// TODO Auto-generated method stub

	}

}
