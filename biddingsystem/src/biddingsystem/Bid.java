package biddingsystem;

public class Bid {
    private final String buyer;
    private final int amount;

    public Bid(String buyer, int amount) {
        this.buyer = buyer;
        this.amount = amount;
    }

    public String getBuyer() {
        return buyer;
    }

    public int getAmount() {
        return amount;
    }
}



