package SingletonPattern;

import java.util.ArrayList;

public class DbwClient implements Runnable{
    String DispatcherId;

    DispatcherThreadless dbw;
    ArrayList<Double> dbwlist = new ArrayList<Double>();
    DbwClient(String Id){
        DispatcherId = Id;


        //Basic Singleton
        dbw = DispatcherThreadless.getInstance();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            for (int i = 0; i < 50000; i++) {
                if(dbw.Dispatch(DispatcherId) == 0){
                    break;
                }
                else{
                    dbwlist.add(dbw.Dispatch(DispatcherId));
                }

            }
        }
        catch (InterruptedException exc){
            System.out.println("Interrupted");
        }


        System.out.println("No thread"+ DispatcherId + "\n" + dbwlist.toString());
    }
}
