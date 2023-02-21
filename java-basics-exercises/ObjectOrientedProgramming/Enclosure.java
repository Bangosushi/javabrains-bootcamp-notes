package session3.ObjectOrientedProgramming;

import java.util.List;

public class Enclosure {
    List<Animal> animals;
    VoreType voreType;
     enum VoreType {
        CARNIVORE,
        OMNIVORE
    };

    public Enclosure(List<Animal> animals, VoreType voreType) {
        this.animals = animals;
        this.voreType = voreType;
    }

    public boolean add(Animal animal){
        if ((voreType.equals(VoreType.CARNIVORE) &&
                (animal instanceof Lion || animal instanceof Tiger)) ||
            (voreType.equals(VoreType.OMNIVORE) &&
                (animal instanceof Bear))) {
            animals.add(animal);
            return true;
        }
        return false;
    }
}
