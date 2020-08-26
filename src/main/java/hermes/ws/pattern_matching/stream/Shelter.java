package hermes.ws.pattern_matching.stream;

import java.util.Set;

public class Shelter {

    private Set<Animal> animals;

    // example of instanceOf use with stream API
    public void removeAggressiveAnimals(){
        this.animals.stream().filter(a -> !(a instanceof Dog d && d.isAggressive()));
    }

}