package hermes.ws.pattern_matching.stream;

import java.util.Set;
import java.util.stream.Collectors;

public class Shelter {

    private Set<Animal> animals;

    // example of instanceOf use with stream API
    public void removeAggressiveAnimalsFromShelter(){
        this.animals = this.animals.stream().filter(a -> !(a instanceof Dog d && d.isAggressive())).collect(Collectors.toSet());
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }
}
