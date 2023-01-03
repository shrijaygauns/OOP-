package biddingsystem;

import java.util.ArrayList;
import java.util.List;

public class Auction {
    private final List<Item> items;

    public Auction() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void placeBid(String itemName, String buyer, int amount) {
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                item.placeBid(new Bid(buyer, amount));
            }
        }
    }

    public List<Item> getItems() {
        return items;
    }
}
