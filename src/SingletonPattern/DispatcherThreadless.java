package SingletonPattern;

public class DispatcherThreadless {
    private static DispatcherThreadless uniqueInstance;
    // This one is not optimized for threads
    private DispatcherThreadless() {}
    public static DispatcherThreadless getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new DispatcherThreadless();
        }
        return uniqueInstance;
    }
    int availableRequests = 500;
    public double Dispatch(String id){
        availableRequests = availableRequests - 1;
        if(availableRequests == 0){
            System.out.println(id + "Finished here............................");
            return 0;
        }

        return Math.floor(availableRequests * Math.random()  * Math.random()  * Math.random() + 1 ) ;
    }
}
