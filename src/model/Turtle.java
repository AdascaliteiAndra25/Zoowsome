package model;

public class Turtle extends Reptile{
    public Turtle(int nrOfLegs, String name, Boolean laysEggs) {
        super(nrOfLegs, name, laysEggs);
    }

    public Turtle(){
        super(4,"Turtle",true);

    }

}
