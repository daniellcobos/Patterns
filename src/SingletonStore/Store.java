package SingletonStore;

import java.util.ArrayList;

public class Store {

    public static void main(String[] args) {
        CentralAccount ca = CentralAccount.getCentralAccount();
        //Functionality Test
        //Test Items
        OnlineItem item1 = new OnlineItem(12000,"Online1",2,1.05f);
        OnlineItem item2 = new OnlineItem(12000,"Online2",3,1.06f);
        RetailItem item3 = new RetailItem(13000,"Retail1", 4,0.80f);
        RetailItem item4 = new RetailItem(20000,"Retail2", 1,0.90f);
        //Test Clients
        ArrayList<Item> testC1 = new ArrayList<Item>();
        ArrayList<Item> testC2 = new ArrayList<Item>();
        testC1.add(item1);
        testC1.add(item3);
        testC2.add(item3);
        testC2.add(item2);
        testC2.add(item4);
        Client client1 = new Client(testC1);
        Client client2 = new Client(testC2);
        //Test Cashiers
        Cashier Cashier1 = new Cashier(client1.Buy(),"1A");
        Cashier Cashier2 = new Cashier(client2.Buy(), "1B");
        Thread Cash1 = new Thread(Cashier1);
        Thread Cash2 = new Thread(Cashier2);
        Cash1.start();
        Cash2.start();

    }
}
