/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.org.whoami.authme.cache.backup;

import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

public class DataFileCache {


	private ItemStack[] inventory;
	private ItemStack[] armor;	
        private String group;
        private boolean operator;

    	
	public DataFileCache(ItemStack[] inventory, CraftItemStack[] stacka){
		this.inventory = inventory;
		this.armor = stacka;
                
	}

	public DataFileCache(ItemStack[] inventory, CraftItemStack[] armor, String group, boolean operator){
		this.inventory = inventory;
		this.armor = armor;
                this.group = group;
                this.operator = operator;
	}        
	public ItemStack[] getInventory(){
		return inventory;
	}

	public ItemStack[] getArmour(){
		return armor;
	}
        
	public String getGroup(){
		return group;
	}
        
	public Boolean getOperator(){
                return operator;
	}         
}    

