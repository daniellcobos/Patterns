package StatePattern;

public class TurnedOnState implements State{
    Television television;
    TurnedOnState(Television tv){
        this.television = tv;
    }
    public void ChangeChannel() {
        System.out.println("Cambiando a Cable");
        television.setState(television.getCableState());
    }




    @Override
    public void PutNetflix() {
        System.out.println("Entrando A Netflix");
    }

    @Override
    public void TurnOn() {
        System.out.println("Ya esta Encendido");

    }

    @Override
    public void TurnOff() {
        System.out.println("Apagando");
        television.setState(television.getTurnedOffState());
    }
}
