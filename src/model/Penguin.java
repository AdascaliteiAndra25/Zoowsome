package model;

public class Penguin extends Bird{
    public Penguin(int nrOfLegs, String name, Boolean migrates, int avgFlightAltitude) {
        super(nrOfLegs, name, migrates, avgFlightAltitude);
    }

    public Penguin(){
        super(2,"Penguin",false,0);
    }
}
