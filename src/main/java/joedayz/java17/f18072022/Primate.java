package joedayz.java17.f18072022;

public class Primate {
    public Primate() {
        System.out.println("Primate-");
    }

    public Primate(int bag) {
        System.out.println("Primate2-");
    }
}

class Ape extends Primate{
    public Ape(int fur) {
        System.out.println("Ape1-");
    }

    public Ape() {
        System.out.println("Ape2-");
    }
}

class Chimpanzee extends Ape{
    public Chimpanzee() {
        super(2);
        System.out.println("Chimpanzee");
    }

    public Chimpanzee(String h){
        System.out.println("Chimpanzee2");
    }

    public static void main(String[] args) {
        new Chimpanzee();
    }
}
