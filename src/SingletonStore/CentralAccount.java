package SingletonStore;

import java.util.ArrayList;

public class CentralAccount {

    ArrayList<Observer> observers = new ArrayList<Observer>();

    float balance;
    //Creating our Singleton (The Central account) so isn't created multiple times;
    private static CentralAccount centralAccount = new CentralAccount(0);

    private CentralAccount(float balance) {
        this.balance =balance;
        observers.add(new LoanAlert());
        observers.add(new StoreNotification());
    };

    public void addMoney(float value){
        balance = balance + value;
        notifyObs(balance);
    }
    public void getMoney(float value){
        balance = balance - value;
        notifyObs(balance);
    }
    public static CentralAccount getCentralAccount(){
        return centralAccount;
    }
    private void notifyObs(float Balance){
        observers.forEach(
                observer ->  observer.ReceiveData(Balance)
        );
    }
}
