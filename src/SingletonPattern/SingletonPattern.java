package SingletonPattern;

public class SingletonPattern {
    public static void main(String[] args) {
        //Singleton
        Dispatcher dispatcher = Dispatcher.UNIQUE;
        DispatcherClient dis1 = new DispatcherClient("Dis1",dispatcher);
        DispatcherClient dis2 = new DispatcherClient("Dis2",dispatcher);
        DbwClient dbw1 = new DbwClient("Dbw1");
        DbwClient dbw2 = new DbwClient("Dbw2");
        //Thread Prepared Singleton
        Thread t1 = new Thread(dis1);
        Thread t2 = new Thread(dis2);
        //Not thread prepared
        Thread t3 = new Thread(dbw1);
        Thread t4 = new Thread(dbw2);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        dispatcher.Dispatch("indpendent");




    }
}
