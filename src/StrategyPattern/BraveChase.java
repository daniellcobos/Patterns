package StrategyPattern;

// A chase implementation
public class BraveChase implements ChaseBehavior {
    @Override
    public String chase() {
        return "Your dog is chasing that candy van over there";
    }
}
