package StrategyAndAdapterPattern;

public class SmallDog extends Dog{

 public SmallDog(){
     biteBehavior = new SmolDogBite();
     chaseBehavior = new CowardChase();
 }


    public void display() {
        System.out.println("Smol Dog here");
    }
}
