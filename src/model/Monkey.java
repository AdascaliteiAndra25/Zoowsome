package model;

public class Monkey extends  Mammal{
    public Monkey(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
        super(nrOfLegs, name, normalBodyTemp, percBodyHair);
    }
    public Monkey(){
        super(4,"Monkey",24,87);

    }
}
