package FactoryPattern;

import java.util.Objects;

public class BogotaEmpanadaFactory extends  EmpanadaFactory{
    Empanada createEmpanada(String tipo){
        if (Objects.equals(tipo, "Carne")){
            return new EmpanadaCarne();
        }
        if (Objects.equals(tipo, "Pollo")){
            return new EmpanadaPollo();
        }
        else return null;
    }
}
