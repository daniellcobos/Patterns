package StatePattern;

public class CableState  implements  State{
    Television television;
    CableState(Television tv){
        this.television = tv;
    }
    public void ChangeChannel() {
        System.out.println("Cambiando");
    }



    @Override
    public void PutNetflix() {
        System.out.println("Activando NessFlix");
        television.setState(television.getNetflixState());
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
