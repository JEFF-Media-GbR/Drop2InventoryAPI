package de.jeff_media.drop2inventory;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

class APIWrapper {

    public void addOrDrop(Player player, ItemStack itemStack, Location dropLocation) {
        dropLocation.getWorld().dropItemNaturally(dropLocation, itemStack);
    }

    public void addOrDrop(Player player, ItemStack[] itemStacks, Location dropLocation) {
        for (ItemStack itemStack : itemStacks) {
            addOrDrop(player, itemStack, dropLocation);
        }
    }

    public boolean hasDropCollectionEnabled(Player player) {
        return false;
    }

    public boolean hasSeenMessage(Player player) {
        return false;
    }

    public boolean isDrop2InventoryEnabled() {
        return false;
    }

    public void registerFutureDrop(Player player, Block block) {

    }
}
