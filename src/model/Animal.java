package model;

public abstract class Animal {

    private int nrOfLegs;
    private String name;


    Animal(int nrOfLegs, String name){
        this.nrOfLegs=nrOfLegs;
        this.name=name;
    }

    public int getnrOfLegs(){
        return nrOfLegs;
    }

    public void setNrOfLegs(int nrOfLegs){
        this.nrOfLegs=nrOfLegs;
    }

  public String getName(){
        return name;
  }

    public void setName(String name) {
        this.name = name;
    }
}
