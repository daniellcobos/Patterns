package StrategyPattern;

public class DumbSmolDog extends Dog{

    DumbSmolDog(){
        biteBehavior = new SmolDogBite();
        chaseBehavior = new BraveChase();
    }

    public void display() {
        System.out.println("Dumb Smol Dog here");
    }
}
