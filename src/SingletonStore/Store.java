package SingletonStore;

import java.util.ArrayList;

public class Store {

    public static void main(String[] args) throws InterruptedException {
        CentralAccount ca = CentralAccount.getCentralAccount();
        //Functionality Test
        //Test Items
        OnlineItem item1 = new OnlineItem(12000,"Online1",2,1.05f);
        OnlineItem item2 = new OnlineItem(12000,"Online2",3,1.06f);
        RetailItem item3 = new RetailItem(13000,"Retail1", 4,0.80f);
        RetailItem item4 = new RetailItem(20000,"Retail2", 1,0.90f);
        ProviderItem pitem1 = new ProviderItem(30000,"Miscellaneous", 6,5000);
        //Test Clients
        ArrayList<Item> testC1 = new ArrayList<Item>();
        ArrayList<Item> testC2 = new ArrayList<Item>();
        ArrayList<Item> testP1 = new ArrayList<>();
        testC1.add(item1);
        testC1.add(item3);
        testC2.add(item3);
        testC2.add(item2);
        testC2.add(item4);
        testP1.add(pitem1);
        Cart cart1 = new Cart(testC1);
        Cart cart2 = new Cart(testC2);
        Cart pcart1 = new Cart(testP1);
        //Test Cashiers
        Cashier Cashier1 = new Cashier(cart1.Buy(),"1A");
        Cashier Cashier2 = new Cashier(cart2.Buy(), "1B");
        Provider provider1 = new Provider(pcart1.Buy(),"GotaaGoat");
        Thread Cash1 = new Thread(Cashier1);
        Thread Cash2 = new Thread(Cashier2);
        Thread Pro1 = new Thread(provider1);
        // Starting Threads
        Cash1.start();
        Cash2.start();
        Cash1.join();
        Cash2.join();
        Pro1.start();

    }
}
