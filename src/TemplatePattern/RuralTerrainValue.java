package TemplatePattern;

public class RuralTerrainValue implements TerrainValue{

    private double inclination;
    private double fertilityrate;
    private boolean hasWater;
    private double neighboorPriceAverage;
    private boolean legalissues;
    private boolean ishaunted;


    public RuralTerrainValue(double inclination, double fertilityrate, boolean hasWater, double neighboorPriceAverage, boolean legalissues, boolean ishaunted) {
        this.inclination = inclination;
        this.fertilityrate = fertilityrate;
        this.hasWater = hasWater;
        this.neighboorPriceAverage = neighboorPriceAverage;
        this.legalissues = legalissues;
        this.ishaunted = ishaunted;
    }

    @Override
    public double setTerrainValue() {
        double TerrainValue = 0;
        TerrainValue = neighboorPriceAverage * (1- (inclination/10)) * (1 + (fertilityrate/10));
        if (hasWater){
            TerrainValue = TerrainValue * 1.5;
        }
        if (legalissues){
            TerrainValue = 0;
            System.out.println("You can do nothing with theeeeeeees");
        }
        if (ishaunted){
            TerrainValue = TerrainValue * 0.98;
        }
        return TerrainValue;
    }
}
