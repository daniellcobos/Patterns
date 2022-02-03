package StatePattern;

public class NetflixState implements State{
    Television television;
    NetflixState(Television tv){
        this.television = tv;
    }
    public void ChangeChannel() {
        System.out.println("Cambiando a TV");
        television.setState(television.getCableState());
    }



    @Override
    public void PutNetflix() {
        System.out.println("Activando NessFlix");

    }

    @Override
    public void TurnOn() {
        System.out.println(" Ya Esta encendida");

    }

    @Override
    public void TurnOff() {
        System.out.println("Apagando");
        television.setState(television.getTurnedOffState());
    }
}
