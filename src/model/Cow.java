package model;

public class Cow extends Mammal{
    public Cow(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
        super(nrOfLegs, name, normalBodyTemp, percBodyHair);
    }

    public Cow(){
        super(4,"Cow",27,79);

    }
}
