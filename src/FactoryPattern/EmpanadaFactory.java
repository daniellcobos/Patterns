package FactoryPattern;

public abstract class EmpanadaFactory {
    abstract Empanada createEmpanada(String item);

    public Empanada orderEmpanada(String type) {
        Empanada empanada = createEmpanada(type);
        System.out.println("--- Fabricando " + empanada.getName() + " ---");
        empanada.preparar();
        empanada.porcionar();
        empanada.hornear();
        return empanada;
    }
}
