package StrategyAndAdapterPattern;

public class WolfBite implements BiteBehavior{

    @Override
    public String bite() {
        return "You will die";
    }
}
