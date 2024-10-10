package factory;

import model.*;

public class AquaticFactory extends SpeciesFactory{
    @Override
    public Animal getAnimal(String type) throws Exception {
        if(Constants.Animals.Aquatics.SHARK.equals(type)){
            return new Shark();
        }else if (Constants.Animals.Aquatics.DOLPHIN.equals(type)){
            return new Dolphin();
        }else if (Constants.Animals.Aquatics.FROG.equals(type)){
            return new Frog();
        }else {
            throw new Exception("Invalid animal exception!");
        }
    }
}
