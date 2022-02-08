package TemplatePattern;

public  abstract class Valuation {
    int terrainValue;
    int buildingValue;
    int totalValue;
    //These one change on the type of property, so they are abstract
    public abstract int calculateBuildingValue();

    public abstract int calculateTerrainValue();
    //These ones are the same to all valuations, so they are defined here
    public void signature(){
        System.out.println("Hence this valuator assigns this value to your property: " + totalValue);
    }
    public int totalValue(){
        return terrainValue + buildingValue;
    }

    public void doValuation(){
        terrainValue = calculateTerrainValue();
        buildingValue = calculateBuildingValue();
        totalValue = totalValue();
        signature();
    }
}
