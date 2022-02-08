package SingletonStore;

import java.util.ArrayList;

public class Cashier implements Runnable{

    private ArrayList<Item> itemList;
    private String id;
    private CentralAccount Ca = CentralAccount.getCentralAccount();
    private ArrayList<Float> transactionHistory = new ArrayList<Float>();
    private float transactionValue;
    public void run(){

        try {
            Thread.sleep(1000);
        Transaction transaction = new Transaction(itemList, id);
        transactionValue = transaction.doTransactions();
        transactionHistory.add(transactionValue);
        System.out.println("Adding " + transactionValue + "To Central account");
        Ca.addMoney(transactionValue);

        }
        catch(InterruptedException exc){
            System.out.println("Interrupted");
        }
    }

    public Cashier(ArrayList<Item> itemList, String id) {
        this.itemList = itemList;
        this.id = id;
    }
}
