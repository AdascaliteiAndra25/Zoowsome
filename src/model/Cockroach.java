package model;

public class Cockroach extends  Insect{
    public Cockroach(int nrOfLegs, String name, Boolean canFly, Boolean isDangerous) {
        super(nrOfLegs, name, canFly, isDangerous);
    }

    public Cockroach(){
        super(6,"Cockroach",false, false);
    }
}
