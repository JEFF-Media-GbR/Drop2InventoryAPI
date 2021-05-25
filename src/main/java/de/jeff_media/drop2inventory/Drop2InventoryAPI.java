package de.jeff_media.drop2inventory;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Drop2InventoryAPI {

    private static APIWrapper wrapper;

    static {
        try {
            wrapper = new APIHandler();
        } catch (Exception ignored) {
            wrapper = new APIWrapper();
        }
    }

    public static void addOrDrop(Player player, ItemStack itemStack, Location dropLocation) {
        wrapper.addOrDrop(player, itemStack, dropLocation);
    }

    public static void addOrDrop(Player player, ItemStack[] itemStacks, Location dropLocation) {
        wrapper.addOrDrop(player, itemStacks, dropLocation);
    }

    public static boolean hasDropCollectionEnabled(Player player) {
        return wrapper.hasDropCollectionEnabled(player);
    }

    public static boolean hasSeenMessage(Player player) {
        return wrapper.hasSeenMessage(player);
    }

    public static boolean isDrop2InventoryEnabled() {
        return wrapper.isDrop2InventoryEnabled();
    }

    public static void registerFutureDrop(Player player, Block block) {
        wrapper.registerFutureDrop(player, block);
    }

}
