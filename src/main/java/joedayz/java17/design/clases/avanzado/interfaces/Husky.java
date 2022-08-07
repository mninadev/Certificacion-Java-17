package joedayz.java17.design.clases.avanzado.interfaces;

public abstract class Husky {
    abstract void play();
}

interface Poodle{
    void play();
}

class Webby extends Husky implements Poodle{

    @Override
    public void play() {

    }
}
