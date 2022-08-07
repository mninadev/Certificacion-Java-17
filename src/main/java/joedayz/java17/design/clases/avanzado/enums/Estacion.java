package joedayz.java17.design.clases.avanzado.enums;

public enum Estacion {
    WINTER("Low"), SPRING("Medium"), SUMMER("Hight"), FALL("Medium");
    private final String expectedVisitors;//Es una buena practica poner las variables de esta manera.
    private Estacion(String expectedVisitors){
        this.expectedVisitors = expectedVisitors;
    }
    public void printExpectedVisitors(){
        System.out.println(expectedVisitors);
    }
    /**
     * Es una mala practica, permitir que se cambien las variables de instancia de un Enum.
     * Cuando diseñes un enum, los valores deben ser inmutables.
     * Todos los constructores de un Enum son implicitamente private. Así que es opcional ponerlo.
     * */
}
