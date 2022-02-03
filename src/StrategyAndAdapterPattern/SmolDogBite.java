package StrategyAndAdapterPattern;

//Another implementation of Bite
public class SmolDogBite implements BiteBehavior {
    @Override
    public String bite() {
        return "Your dog looks sad trying to chew you";
    }
}
