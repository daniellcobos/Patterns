package FacadePattern;

public class Car {
    Battery battery;
    GasCheck gasCheck;
    Motor motor;
    Transmission transmission;
    String name;

    public Car(Battery battery, GasCheck gasCheck, Motor motor, Transmission transmission, String name) {
        this.battery = battery;
        this.gasCheck = gasCheck;
        this.motor = motor;
        this.transmission = transmission;
        this.name = name;
    }

    //Now the car turns on without you knowing what the other things do
    public void TurnOn(){
        System.out.println("Getting car ready");
        System.out.println(name);
        battery.Charged();
        gasCheck.Check();
        transmission.Ready();
        motor.Ignite();
    }

}
