package model;

public abstract class Reptile extends Animal{

    private Boolean laysEggs;

    public Reptile(int nrOfLegs, String name,Boolean laysEggs){
        super(nrOfLegs,name);
        this.laysEggs=laysEggs;
    }

    public Boolean getLaysEggs() {
        return laysEggs;
    }

    public void setLaysEggs(Boolean laysEggs) {
        this.laysEggs = laysEggs;
    }
}
