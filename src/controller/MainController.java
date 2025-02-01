package controller;

import factory.AnimalFactory;
import factory.SpeciesFactory;
import model.*;

public class MainController {

      public static void main(String[] args) throws Exception {

            AnimalFactory abstractFactory = new AnimalFactory();

            SpeciesFactory mamalSpeciesFactory= abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
            Animal kingTheTiger= mamalSpeciesFactory.getAnimal(Constants.Animals.Mammals.TIGER);
          System.out.printf("We have a tiger with %d legs!\n", kingTheTiger.getnrOfLegs());

          SpeciesFactory reptileSpeciesFactory= abstractFactory.getSpeciesFactory(Constants.Species.REPTILES);
          Animal cobraTheSnake= reptileSpeciesFactory.getAnimal(Constants.Animals.Reptiles.SNAKE);

          if(cobraTheSnake instanceof Reptile) {
              Reptile snakee = (Reptile) cobraTheSnake;
              System.out.printf("Our snake lays eggs:true or false -> %s.\n", snakee.getLaysEggs());
          }


          SpeciesFactory birdSpeciesFactory= abstractFactory.getSpeciesFactory(Constants.Species.BIRDS);
          Animal nikaTheSparrow = birdSpeciesFactory.getAnimal(Constants.Animals.Birds.SPARROW);
          if(nikaTheSparrow instanceof Bird){
              Bird nika=(Bird) nikaTheSparrow;
              System.out.printf("Our sparrow flies up to an altitude of aprox: %d metres.\n", nika.getAvgFlightAltitude() );
          }

          SpeciesFactory aquaticSpeciesFactory= abstractFactory.getSpeciesFactory(Constants.Species.AQUATICS);
          Animal babbyTheShark = aquaticSpeciesFactory.getAnimal(Constants.Animals.Aquatics.SHARK);
          if(babbyTheShark instanceof Aquatic){
              Aquatic babby= (Aquatic) babbyTheShark;
              System.out.printf("Our shark swims up to %d metres in depth in %s.\n", babby.getAvgSwimDepth(),babby.getWaterType());
          }

          SpeciesFactory insectSpeciesFactory= abstractFactory.getSpeciesFactory(Constants.Species.INSECTS);
          Animal billyTheSpider=insectSpeciesFactory.getAnimal(Constants.Animals.Insects.SPIDER);
          if(billyTheSpider instanceof Insect){
              Insect billy=(Insect) billyTheSpider;
              System.out.printf("Our spider can fly:%s. Our spider is dangerous: %s", billy.getCanFly(),billy.getDangerous());
          }
        }

}
