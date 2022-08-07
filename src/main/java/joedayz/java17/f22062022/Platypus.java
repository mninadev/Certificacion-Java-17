package joedayz.java17.f22062022;

abstract class Mammal {
    abstract CharSequence chew();
    public Mammal(){
        System.out.println(chew());
    }
}

public class Platypus extends Mammal{

    @Override
    CharSequence chew() {
        return "Yummy!";
    }

    public static void main(String[] args) {
        new Platypus();
    }
}
