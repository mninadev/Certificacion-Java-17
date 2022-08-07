package joedayz.java17.design.clases.avanzado.interfaces;

public interface Herbivore {
    public void eatPlants();
}

interface Omnivore{
    public void eatPlants();
}

class Bear implements Herbivore, Omnivore{

    @Override
    public void eatPlants() {

    }
}
