package FactoryPattern;

public class FactoryPattern {
    public static void main(String[] args) {
        BogotaEmpanadaFactory bgfactory = new BogotaEmpanadaFactory();
        BoyacaEmpanadaFactory byfactory = new BoyacaEmpanadaFactory();

        bgfactory.orderEmpanada("Carne");
        bgfactory.orderEmpanada("Pollo");
        byfactory.orderEmpanada("Queso");
        byfactory.orderEmpanada("Arverja");
    }
}
