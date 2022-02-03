package StrategyAndAdapterPattern;

public class WolfAdapter extends Dog {
    public WolfAdapter(Wolf wolf){
        biteBehavior = wolf.biteBehavior;
        chaseBehavior = new HuntToChase(wolf.hunt);
    }

    @Override
    public void bark() {
        System.out.println("Auuuuu or whatever Wolfs sound like");
    }

    public void display() {
        System.out.println("This is a Wolf Adapter");
    }

}
