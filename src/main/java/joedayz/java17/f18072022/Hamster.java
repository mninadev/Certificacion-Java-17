package joedayz.java17.f18072022;

public class Hamster {
    public Hamster(int weight) {
        System.out.println("chew");
        //this(weight,"brown");//NO COMPILA, porque tiene que ser la primera linea
    }

    public Hamster(int weight, String name) {
        this(weight);//SI COMPILA
        System.out.println(weight);
    }
}
