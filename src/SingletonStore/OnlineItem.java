package SingletonStore;

public class OnlineItem extends Item {
    private float price;
    private String name;
    private int quantity;

    public OnlineItem(float price, String name, int quantity, float deliveryFee) {
        this.price = price * deliveryFee;
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
}
