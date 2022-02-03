package StrategyAndAdapterPattern;

public class HuntToChase implements ChaseBehavior {
    WolfHuntBehavior wf;

    HuntToChase(WolfHuntBehavior wf){
        this.wf = wf;
    }

    public String chase() {
        return wf.Hunt();
    }
}
