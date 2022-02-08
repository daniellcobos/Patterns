package SingletonStore;

public class LoanAlert implements Observer{
    @Override
    public void ReceiveData(float Balance) {
        if (Balance < 20000){
            System.out.println("Consider taking a Loan \n");
        }
    }
}
