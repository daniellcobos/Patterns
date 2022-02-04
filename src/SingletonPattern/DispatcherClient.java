package SingletonPattern;

import java.util.ArrayList;

public class DispatcherClient implements Runnable{
    String DispatcherId;
    Dispatcher dispatcher;
    ArrayList<Double> list = new ArrayList<Double>();

    DispatcherClient(String Id, Dispatcher dispatcher){
        DispatcherId = Id;
        //Enum Singleton
        this.dispatcher = dispatcher;
        //Basic Singleton

    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            for (int i = 0; i < 50000; i++) {
                if(dispatcher.Dispatch(DispatcherId) == 0){
                    break;
                }
                else{
                    list.add(dispatcher.Dispatch(DispatcherId));
                }

            }
        }
        catch (InterruptedException exc){
            System.out.println("Interrupted");
        }

        System.out.println("Thread" + DispatcherId + "\n" + list.toString());

    }
}
