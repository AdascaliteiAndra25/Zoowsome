package model;

public abstract class Bird extends Animal{

    private Boolean migrates;
    private int avgFlightAltitude;


    public Bird(int nrOfLegs, String name,Boolean migrates, int avgFlightAltitude) {
        super(nrOfLegs, name);
        this.migrates=migrates;
        this.avgFlightAltitude=avgFlightAltitude;
    }

    public Boolean getMigrates() {
        return migrates;
    }

    public void setMigrates(Boolean migrates) {
        this.migrates = migrates;
    }

    public int getAvgFlightAltitude() {
        return avgFlightAltitude;
    }

    public void setAvgFlightAltitude(int avgFlightAltitude) {
        this.avgFlightAltitude = avgFlightAltitude;
    }
}
