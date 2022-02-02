package FactoryPattern;

public class EmpanadaPollo extends Empanada {
    EmpanadaPollo(){
        nombre = "Empanada de Pollo";
        masa = "Harina de Maiz";
        relleno = "Pollo y Arroz";
        precio = 1000;
    }
    void porcionar() {
        System.out.println("Sirva de a 3 Empanadas");
    }
}
