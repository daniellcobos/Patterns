package FacadePattern;

public class FacadePattern {
    public static void main(String[] args) {
        //Get all the pieces
        Motor mt = new Motor();
        Battery patito = new Battery();
        Transmission trash = new Transmission();
        GasCheck exxon = new GasCheck();
        // Put them on an unified system
        Car beater = new Car(patito,exxon,mt,trash,"Marca Patito");
        beater.TurnOn();
    }
}
