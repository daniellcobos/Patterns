package SingletonStore;

import java.util.ArrayList;

public class Client {
    private ArrayList<Item> cart = new ArrayList<Item>();

    public void PushtoCart(Item item){
        cart.add(item);
    }
    public ArrayList<Item> Buy() {

        return this.cart;
    }

    public Client(ArrayList<Item> cart) {

        this.cart = cart;
    }
    public ArrayList<Item> getCart(){
        System.out.println(cart.toString());
        return this.cart;
    }
}
