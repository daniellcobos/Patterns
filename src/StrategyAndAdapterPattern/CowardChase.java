package StrategyAndAdapterPattern;

public class CowardChase implements ChaseBehavior{
    @Override
    public String chase() {
        return "It hides behind you";
    }
}
