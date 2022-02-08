package SingletonStore;

import java.util.ArrayList;

public abstract class Transaction {
    private float total;
    private ArrayList<Item> itemList;
    private String id;
    public Transaction() {
    }

    public abstract float doTransactions();
}
