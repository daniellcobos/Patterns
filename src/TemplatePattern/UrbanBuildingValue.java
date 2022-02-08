package TemplatePattern;

public class UrbanBuildingValue implements BuildingValue {
     double area;
     double averageM2neighboorValue;
     double materialPriceindex;
     boolean horizontalProperty;
     double qualityIndex;

     public UrbanBuildingValue(double area, double averageM2neighboorValue, double materialPriceindex, boolean horizontalProperty, double qualityIndex) {
          this.area = area;
          this.averageM2neighboorValue = averageM2neighboorValue;
          this.materialPriceindex = materialPriceindex;
          this.horizontalProperty = horizontalProperty;
          this.qualityIndex = qualityIndex;
     }

     @Override
     public double setBuildingValue() {
          double buildingCost;
          buildingCost = area * averageM2neighboorValue * materialPriceindex * qualityIndex;
          if (horizontalProperty)
          {buildingCost = buildingCost *1.2;}
          return  buildingCost;
     }
}
