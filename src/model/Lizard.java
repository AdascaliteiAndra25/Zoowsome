package model;

public class Lizard extends Reptile{
    public Lizard(int nrOfLegs, String name, Boolean laysEggs) {
        super(nrOfLegs, name, laysEggs);
    }

    public Lizard(){
        super(4,"Lizazrd",false);
    }

}
