package joedayz.java17.design.clases.avanzado.records;

public record Crane3(int numberEggs, String name) {
    /**
     *  El compilador no va insertar un constructor si ya se tiene uno con la misma lista de parámetros en el mismo orden,
     *  el constructor debe establecer un valor para cada campo.
     * */
    /*public Crane3(int numberEggs, String name) {
        if(numberEggs >= 0)
            throw new IllegalArgumentException();
        this.numberEggs = numberEggs;
        this.name = name;
    }*/

    //public Crane3(int numberEggs, String name){} //DOES NOT COMPILE, porque todos sus parametros deben ser inicializados dentro del constructor.


    /**Constructor compacto:
     * Este es un constructor especial usado para procesar validaciones y transformaciones.
     * Este NO toma parámetros e implícitamente establece todos los campos
     */
    public Crane3{
        if (numberEggs < 0) throw new IllegalArgumentException();
        name = name.toUpperCase();
    }
}


