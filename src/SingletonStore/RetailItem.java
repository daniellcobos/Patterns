package SingletonStore;

public class RetailItem extends Item{
    private float price;
    private String name;
    private int quantity;

    public RetailItem(float price, String name, int quantity, float discount) {
        this.price = price* discount;
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
