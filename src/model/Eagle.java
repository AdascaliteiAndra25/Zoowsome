package model;

public class Eagle extends Bird{
    public Eagle(int nrOfLegs, String name, Boolean migrates, int avgFlightAltitude) {
        super(nrOfLegs, name, migrates, avgFlightAltitude);
    }

    public Eagle(){
        super(2,"Eagle",true,3500);
    }
}
