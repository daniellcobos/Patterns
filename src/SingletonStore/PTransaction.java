package SingletonStore;

import java.util.ArrayList;

public class PTransaction extends Transaction{
    private float total;
    private ArrayList<Item> itemList;
    private String id;

    public PTransaction(ArrayList<Item> itemList, String id) {
        this.total = 0;
        this.itemList = itemList;
        this.id = id;
    }

    public float doTransactions(){
        System.out.println("Buying from provider " + id);
        itemList.forEach(
                (item -> {
                    total = total + (item.getPrice() * item.getQuantity());
                })

        );
        return total;
    }

}
