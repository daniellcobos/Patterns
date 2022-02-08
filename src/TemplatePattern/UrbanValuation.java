package TemplatePattern;

public class UrbanValuation extends Valuation{
    double area;
    double buildingPotential;
    boolean horizontalProperty;
    double neighborPriceAverage;
    double securityIndex;
    double equipmentIndex;
    double quailtyIndex;
    double materialPriceIndex;


    @Override
    public int calculateBuildingValue() {
        UrbanBuildingValue urbanBuildingValue = new UrbanBuildingValue(area,neighborPriceAverage,materialPriceIndex,horizontalProperty,quailtyIndex);
        return (int) urbanBuildingValue.setBuildingValue();
    }

    @Override
    public int calculateTerrainValue() {
        UrbanTerrainValue urbanTerrainValue  = new UrbanTerrainValue(area,neighborPriceAverage,buildingPotential,securityIndex,equipmentIndex,horizontalProperty) ;
        return (int) urbanTerrainValue.setTerrainValue();

    }
}
