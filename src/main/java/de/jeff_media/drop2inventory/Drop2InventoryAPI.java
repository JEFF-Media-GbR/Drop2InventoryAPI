package de.jeff_media.drop2inventory;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Contains all public API methods Drop2Inventory provides
 */
public class Drop2InventoryAPI {

    private static APIWrapper wrapper;

    static {
        try {
            wrapper = new APIHandler();
        } catch (Exception ignored) {
            wrapper = new APIWrapper();
        }
    }

    /**
     * Puts the specified ItemStack into the player's inventory. If not all items can be stored, the remaining
     * items are dropped at the given location. If Drop2Inventory is not installed, all items will be
     * dropped at the location.
     * @param player Player to add the ItemStack to
     * @param itemStack ItemStack to add or drop
     * @param dropLocation Location where remaining items are dropped
     */
    public static void addOrDrop(Player player, ItemStack itemStack, Location dropLocation) {
        wrapper.addOrDrop(player, itemStack, dropLocation);
    }

    /**
     * Puts the specified ItemStacks into the player's inventory. If not all items can be stored, the remaining
     * items are dropped at the given location. If Drop2Inventory is not installed, all items will be
     * dropped at the location.
     * @param player Player to add the ItemStack to
     * @param itemStacks ItemStacks to add or drop
     * @param dropLocation Location where remaining items are dropped
     */
    public static void addOrDrop(Player player, ItemStack[] itemStacks, Location dropLocation) {
        wrapper.addOrDrop(player, itemStacks, dropLocation);
    }

    /**
     * Checks whether this player has automatic drop collection enabled
     * @param player Player to check
     * @return true if drop collection is enabled, false if it's disabled or Drop2Inventory is not installed
     */
    public static boolean hasDropCollectionEnabled(Player player) {
        return wrapper.hasDropCollectionEnabled(player);
    }

    /**
     * Checks whether this player has already seen the Drop2Inventory usage message.
     * @param player Player to check
     * @return true if the player saw the message, false if they haven't or Drop2Inventory is not installed
     */
    public static boolean hasSeenMessage(Player player) {
        return wrapper.hasSeenMessage(player);
    }

    /**
     * Checks whether Drop2Inventory is installed and enabled
     * @return true if Drop2Inventory is installed and enabled, otherwise false
     */
    public static boolean isDrop2InventoryEnabled() {
        return wrapper.isDrop2InventoryEnabled();
    }

    /**
     * Registers a future drop so that Drop2Inventory knows to which player it belongs
     * @param player The player that this drop belongs to
     * @param block The block where the items will be dropped
     */
    public static void registerFutureDrop(Player player, Block block) {
        wrapper.registerFutureDrop(player, block);
    }

}
