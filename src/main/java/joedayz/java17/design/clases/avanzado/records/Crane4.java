package joedayz.java17.design.clases.avanzado.records;

public record Crane4 (int numberEggs, String name){
    /*public Crane4(String name) {
        this(1); //DOES NOT COMPILE
    }
    public Crane4(int numberEggs){
        this(""); //DOES NOT COMPILE, but recursive contructor invocation.
    }*/
}
