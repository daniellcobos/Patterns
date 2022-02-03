package StrategyAndAdapterPattern;

public abstract class Dog {

    //These are the behaviors that changes between Dogs,so it's better to establish an interface of them
    BiteBehavior biteBehavior;
    ChaseBehavior chaseBehavior;
    public Dog() { }
    public abstract void display();
    //Calling the methods of those interfaces, whatever they are
    public void performBite() {
        System.out.println(biteBehavior.bite());
    }
    public void performChase() {
        System.out.println(chaseBehavior.chase());
    }
    //This is the "method" that stays the same between all the dogs
    public void bark() {
        System.out.println("Woof Woof");
    }
}