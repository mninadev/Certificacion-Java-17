package joedayz.java17.design.clases.avanzado.interfaces;

public interface HasTail {
    public int getTailLenght();
}

interface HasWhiskers{
    public int getNumberOfWhiskers();
}

abstract class HarborSeal implements HasTail, HasWhiskers{

}

class CommonSeal extends HarborSeal{

    @Override
    public int getTailLenght() {
        return 0;
    }

    @Override
    public int getNumberOfWhiskers() {
        return 0;
    }
}