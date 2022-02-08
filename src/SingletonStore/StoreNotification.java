package SingletonStore;

public class StoreNotification  implements  Observer{
    @Override
    public void ReceiveData(float Balance) {
        System.out.printf("Total Balance " + Balance + "\n");
    }
}
