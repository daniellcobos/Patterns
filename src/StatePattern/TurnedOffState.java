package StatePattern;

public class TurnedOffState implements State {
    Television television;
    TurnedOffState(Television tv){
        this.television = tv;
    }
    public void ChangeChannel() {
        System.out.println("Esta Apagado");
    }



    @Override
    public void PutNetflix() {
        System.out.println("Apagado");
    }

    @Override
    public void TurnOn() {
        System.out.println("Encendiendo");
        television.setState(television.getTurnedOnState());
    }

    @Override
    public void TurnOff() {
        System.out.println("Esta Apagado");
    }
}
