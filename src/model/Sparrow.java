package model;

public class Sparrow extends Bird{
    public Sparrow(int nrOfLegs, String name, Boolean migrates, int avgFlightAltitude) {
        super(nrOfLegs, name, migrates, avgFlightAltitude);
    }

    public Sparrow(){
        super(2,"Sparrow",true,100);
    }
}
