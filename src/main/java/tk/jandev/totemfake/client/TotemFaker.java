package tk.jandev.totemfake.client;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Items;

public class TotemFaker {
    static MinecraftClient client = MinecraftClient.getInstance();
    public static boolean enabled = true;
    static int totemSlot = 1;

    public static void putTotemInHand()  {
        if(client.player == null) return;

        PlayerInventory inventory = client.player.getInventory();
        inventory.setSelectedSlot(totemSlot - 1);
        inventory.setStack(totemSlot - 1, Items.TOTEM_OF_UNDYING.getDefaultStack());
        inventory.setStack(PlayerInventory.OFF_HAND_SLOT, Items.TOTEM_OF_UNDYING.getDefaultStack());
    }
}
