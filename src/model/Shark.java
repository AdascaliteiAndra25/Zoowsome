package model;

public class Shark extends Aquatic {
    public Shark(int nrOfLegs, String name, int avgSwimDepth, WaterType waterType) {
        super(nrOfLegs, name, avgSwimDepth, waterType);
    }
    public Shark(){
        super(0,"Shark",2000,WaterType.SALTWATER);
    }
}
