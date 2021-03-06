package SingletonStore;

import java.util.ArrayList;

public class Provider implements Runnable{
    private ArrayList<Item> itemList;
    private String id;
    private CentralAccount Ca = CentralAccount.getCentralAccount();
    private ArrayList<Float> transactionHistory = new ArrayList<Float>();
    private float transactionValue;
    public void run(){

        try {
            Thread.sleep(1000);
            PTransaction transaction = new PTransaction(itemList, id);
            transactionValue = transaction.doTransactions();
            transactionHistory.add(transactionValue);
            System.out.println("Taking " + transactionValue + " From Central account");
            Ca.getMoney(transactionValue);

        }
        catch(InterruptedException exc){
            System.out.println("Interrupted");
        }
    }

    public Provider(ArrayList<Item> itemList, String id) {
        this.itemList = itemList;
        this.id = id;
    }
}
