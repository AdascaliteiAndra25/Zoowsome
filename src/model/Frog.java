package model;

public class Frog extends Aquatic{
    public Frog(int nrOfLegs, String name, int avgSwimDepth, WaterType waterType) {
        super(nrOfLegs, name, avgSwimDepth, waterType);
    }

    public Frog(){
        super(4,"Frog",4,WaterType.FRESHWATER);
    }
}
