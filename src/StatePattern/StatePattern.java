package StatePattern;

public class StatePattern {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.PutNetflix();
        tv.TurnOn();
        tv.ChangeChannel();
        tv.PutNetflix();
        tv.Mute();
        tv.TurnOn();
        tv.TurnOff();


    }
}
