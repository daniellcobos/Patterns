package TemplatePattern;

public class UrbanTerrainValue implements TerrainValue{
    private double area;
    private double neighboorPriceAverage;
    private double buildingPotental;
    private double securityIndex;
    private double equipementIndex;
    private boolean horizontalProperty;


    public UrbanTerrainValue(double area,double neighboorPriceAverage, double buildingPotential, double securityIndex, double equipmentIndex, boolean horizontalProperty) {
        this.area = area;
        this.neighboorPriceAverage = neighboorPriceAverage;
        this.buildingPotental = buildingPotential;
        this.securityIndex = securityIndex;
        this.equipementIndex = equipmentIndex;
        this.horizontalProperty = horizontalProperty;
    }

    @Override
    public double setTerrainValue() {
        double TerrainValue;
        TerrainValue = neighboorPriceAverage * buildingPotental * (1-(securityIndex/100)) * (1+(equipementIndex/100));
        if (horizontalProperty){
            TerrainValue = TerrainValue * 1.2;
        }
        return TerrainValue;
    }
}
