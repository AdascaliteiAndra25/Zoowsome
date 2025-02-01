package model;

public class Tiger extends Mammal{
    public Tiger(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
        super(nrOfLegs, name, normalBodyTemp, percBodyHair);
    }
    public Tiger(){
        super(4,"Tiger",25,80);
    }
}
