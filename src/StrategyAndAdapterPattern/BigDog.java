package StrategyAndAdapterPattern;

public class BigDog extends Dog {

    BigDog(){
        chaseBehavior = new BraveChase();
        biteBehavior = new PitbullBite();
    }

    public void display() {
        System.out.println("Big Dog here");
    }
}
