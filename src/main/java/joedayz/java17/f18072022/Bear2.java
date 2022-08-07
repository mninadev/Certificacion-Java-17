package joedayz.java17.f18072022;

public class Bear2 {
    public static void eat(){
        System.out.println("Bear is eating");
    }
}

class Panda extends Bear2{

    //Este método oculta al método eat() de la clase padre.
    public static void eat(){
        System.out.println("Panda is cheawing");
    }

    public static void main(String[] args) {
        eat();
    }
}
