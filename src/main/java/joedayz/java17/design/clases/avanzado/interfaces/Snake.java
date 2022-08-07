package joedayz.java17.design.clases.avanzado.interfaces;

public class Snake implements IsColdBlooded {
    public boolean hasScales() { //Required override
        return false;
    }

    public double getTemperature() {//Optional override
        return 12;
    }
}

