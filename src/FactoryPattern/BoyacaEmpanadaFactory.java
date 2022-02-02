package FactoryPattern;

import java.util.Objects;

public class BoyacaEmpanadaFactory extends  EmpanadaFactory{
  Empanada createEmpanada(String tipo){
    if (Objects.equals(tipo, "Arverja")){
      return new EmpanadaArverja();
    }
    if (Objects.equals(tipo, "Queso")){
      return new EmpanadaQueso();
    }
    else return null;
  }
}
