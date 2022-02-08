package SingletonStore;

public class ProviderItem extends Item{
    private float price;
    private String name;
    private int quantity;

    public ProviderItem(float price, String name, int quantity, int damages) {
        this.price = price - damages;
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
