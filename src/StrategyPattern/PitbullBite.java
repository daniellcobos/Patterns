package StrategyPattern;

//An implementation of the bite
public class PitbullBite implements  BiteBehavior{

    @Override
    public String bite() {
        return "Great, your dog Killed someone";
    }
}
