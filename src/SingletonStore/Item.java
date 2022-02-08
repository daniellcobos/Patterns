package SingletonStore;

public abstract class Item {
    private float price;
    private String name;
    private int quantity;

    public Item() {

    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
