package factory;

import model.*;

public class BirdFactory extends SpeciesFactory{
    @Override
    public Animal getAnimal(String type) throws Exception {
        if (Constants.Animals.Birds.EAGLE.equals(type)){
            return new Eagle();
        }else if (Constants.Animals.Birds.PENGUIN.equals(type)){
            return new Penguin();
        }else if (Constants.Animals.Birds.SPARROW.equals(type)){
            return new Sparrow();
        }else {
            throw new Exception("Invalid animal exception!");
        }
    }
}
