package SingletonStore;

public class CentralAccount {

    float balance;
    //Creating our Singleton (The Central account) so isn't created multiple times;
    private static CentralAccount centralAccount = new CentralAccount(0);

    private CentralAccount(float balance) {
        this.balance =balance;
    };

    public void addMoney(float value){
        balance = balance + value;
        System.out.println("Central Account total report:" +balance);
    }
    public static CentralAccount getCentralAccount(){
        return centralAccount;
    }
    public float getBalance(){
        return balance;
    }
}
