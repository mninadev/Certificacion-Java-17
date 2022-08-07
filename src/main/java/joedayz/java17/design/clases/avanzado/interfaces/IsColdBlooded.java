package joedayz.java17.design.clases.avanzado.interfaces;

public interface IsColdBlooded {
    boolean hasScales();
    default double getTemperature(){
        return 10.0;
    }
}

