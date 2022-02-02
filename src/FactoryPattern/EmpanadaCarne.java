package FactoryPattern;

public class EmpanadaCarne extends Empanada{
    EmpanadaCarne(){
        nombre = "Empanada de Carne";
        masa = "Harina de Maiz";
        relleno = "Carne y Huevo";
        precio = 1500;
    }
    void porcionar() {
        System.out.println("Sirva de a 3 Empanadas");
    }
}
