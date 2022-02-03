package StrategyAndAdapterPattern;

public class Wolf  {
    WolfHuntBehavior hunt;
    BiteBehavior biteBehavior;

    public Wolf(){
         hunt = new ArticWolfHunt();
         biteBehavior = new WolfBite();
    }

}
