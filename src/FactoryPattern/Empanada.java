package FactoryPattern;

public abstract class Empanada {
    String nombre;
    String relleno;
    String masa;
    float precio;


    void preparar() {
        System.out.println("Prepare " + nombre);
        System.out.println("Preparando Relleno...");
        System.out.println("Envolviendo en la Masa...");
    }

    void hornear() {
        System.out.println("Hornee en un Horno duh");
    }

    void porcionar() {
        System.out.println("Sirva de a 2 Empanadas");
    }



    public String getName() {
        return nombre;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + nombre + " ----\n");
        display.append(relleno + "\n");
        display.append(masa + "\n");
        return display.toString();
    }
}
