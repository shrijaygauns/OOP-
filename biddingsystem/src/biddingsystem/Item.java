package biddingsystem;

public class Item {
    private final String name;
    private final String seller;
    private Bid highestBid;

    public Item(String name, String seller) {
        this.name = name;
        this.seller = seller;
        this.highestBid = null;
    }

    public String getName() {
        return name;
    }

    public String getSeller() {
        return seller;
    }

    public Bid getHighestBid() {
        return highestBid;
    }

    public void placeBid(Bid bid) {
        if (highestBid == null || bid.getAmount() > highestBid.getAmount()) {
            highestBid = bid;
        }
    }
}