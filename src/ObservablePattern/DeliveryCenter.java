package ObservablePattern;

import java.util.ArrayList;
import java.util.List;

public class DeliveryCenter implements Subject{
    private List<Observer> observers;
    private int ongoing;
    private int waiting;
    private int free;

    public DeliveryCenter(){
        observers = new ArrayList<Observer>();
    }


    public void registerObserver(Observer o) {
        observers.add(o);
    }
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(ongoing, waiting, free);
        }
    }
    public void measurementsChanged() {
        notifyObservers();
    }
    public void setMeasurements(int ongoing, int waiting, int free) {
        this.ongoing = ongoing;
        this.waiting = waiting;
        this.free = free;
        measurementsChanged();
    }
}
