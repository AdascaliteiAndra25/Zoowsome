package model;

public class Snake extends Reptile{
    public Snake(int nrOfLegs, String name, Boolean laysEggs) {
        super(nrOfLegs, name, laysEggs);
    }

    public Snake(){
        super(0,"Spider",true);

    }
}
