/*
 * Copyright 2011 Sebastian Köhler <sebkoehler@whoami.org.uk>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.org.whoami.authme.cache.limbo;

import org.bukkit.inventory.ItemStack;

import org.bukkit.Location;
import org.bukkit.craftbukkit.inventory.*;

public class LimboPlayer {

    private String name;
    private ItemStack[] inventory;
    private ItemStack[] armour;
    private Location loc;
    private int timeoutTaskId = -1;
    private int gameMode = 0;
    private boolean operator;
    private String group;

    public LimboPlayer(String name, Location loc, org.bukkit.inventory.ItemStack[] inv, org.bukkit.inventory.ItemStack[] arm, int gameMode, boolean operator, String group) {
        this.name = name;
        this.loc = loc;
        this.inventory = inv;
        this.armour = arm;
        this.gameMode = gameMode;
        this.operator = operator;
        this.group = group;
        //System.out.println("il gruppo in limboPlayer "+group);
    }
    
	
    public LimboPlayer(String name, String group) {
        this.name = name;
        this.group = group;
    }
    
	public CraftItemStack[] cast(ItemStack[] bukkit){
		int length = bukkit.length;
		CraftItemStack[] craftbukkit = new CraftItemStack[length];
			for(int i = 0; i < bukkit.length; i++){
				craftbukkit[i] = (CraftItemStack)bukkit[i];
			}
			return craftbukkit;
	}
	
    public String getName() {
        return name;
    }

    public Location getLoc() {
        return loc;
    }

    //cast into CraftItemStack[] -> LoginCommand
    public CraftItemStack[] getArmour() {
        return cast(armour);
    }

    public CraftItemStack[] getInventory() {
        return cast(inventory);
    }

    public int getTimeoutTaskId() {
        return timeoutTaskId;
    }

    public void setTimeoutTaskId(int timeoutTaskId) {
        this.timeoutTaskId = timeoutTaskId;
    }

    public int getGameMode() {
        return gameMode;
    }
    
    public boolean getOperator() {
        return operator;
    }
    
    public String getGroup() {
        return group;
    }    
}
