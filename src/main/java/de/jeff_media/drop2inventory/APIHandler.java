package de.jeff_media.drop2inventory;

import de.jeff_media.drop2inventory.handlers.DropOwnerManager;
import de.jeff_media.drop2inventory.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class APIHandler extends APIWrapper {

    private final Main plugin = (Main) Bukkit.getPluginManager().getPlugin("Drop2InventoryPlus");

    public APIHandler() throws ClassNotFoundException {
        Class.forName("de.jeff_media.drop2inventory.Main");
    }

    @Override
    public void addOrDrop(Player player, ItemStack itemStack, Location dropLocation) {
        Utils.addOrDrop(itemStack, player, dropLocation);
    }

    @Override
    public void addOrDrop(Player player, ItemStack[] itemStacks, Location dropLocation) {
        Utils.addOrDrop(itemStacks, player, dropLocation);
    }

    @Override
    public boolean hasDropCollectionEnabled(Player player) {
        return plugin.enabled(player);
    }

    @Override
    public boolean hasSeenMessage(Player player) {
        return plugin.hasSeenMessage(player);
    }

    @Override
    public boolean isDrop2InventoryEnabled() {
        return plugin != null;
    }

    @Override
    public void registerFutureDrop(Player player, Block block) {
        if(!hasDropCollectionEnabled(player)) return;
        DropOwnerManager.register(player, block.getLocation(), block);
    }
}
