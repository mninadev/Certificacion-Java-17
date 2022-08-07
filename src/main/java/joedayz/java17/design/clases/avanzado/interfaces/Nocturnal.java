package joedayz.java17.design.clases.avanzado.interfaces;

public interface Nocturnal {
    public int hunt();
}

interface CanFly{
    public void flap();
}

interface HasBigEyes extends Nocturnal, CanFly{

}

class Owl implements HasBigEyes{

    @Override
    public int hunt() {
        return 0;
    }

    @Override
    public void flap() {

    }
}