package SingletonStore;

import java.util.ArrayList;

public class CTransaction {
    private float total;
    private ArrayList<Item> itemList;
    private String id;

    public CTransaction(ArrayList<Item> itemList, String id) {
        this.total = 0;
        this.itemList = itemList;
        this.id = id;
    }

    public float doTransactions(){
        System.out.println("Transaction Starting in Register " + id);
        itemList.forEach(
                (item -> {
                    total = total + (item.getPrice() * item.getQuantity());
                })

        );
        return total;
    }

}
