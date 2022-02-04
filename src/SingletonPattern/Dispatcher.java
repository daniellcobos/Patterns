package SingletonPattern;

public enum Dispatcher {
    UNIQUE;

    int availableRequests = 500;
    public double Dispatch(String id){
        availableRequests = availableRequests - 1;

         System.out.println("Dispatching" + id );
        if(availableRequests == 0){
            System.out.println(id + "Finished here......................");
            return 0;
        }
        return Math.floor(availableRequests * Math.random()  * Math.random()  * Math.random() + 1) ;

    }
}
