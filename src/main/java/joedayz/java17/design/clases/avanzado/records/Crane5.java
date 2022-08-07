package joedayz.java17.design.clases.avanzado.records;

public record Crane5(int numberEggs, String name) {
    private static final int type = 10;
    private static String country = "London";
    //public int size; //DOES NOT COMPILE
    //private boolean friendly; //DOES NOT COMPILE
    private void getSize(){}
    protected static boolean getFriendly(){return true;}
}
