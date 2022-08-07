package joedayz.java17.f18072022;

public class Insect {
    protected int numberOfLegs = 4;
    String label = "Buggy";
}

class Beetle extends Insect{
    protected int numberOfLegs = 6;
    short age = 3;

    public void printData(){
        System.out.println(this.label);
        System.out.println(super.label);
    }

    public static void main(String[] args) {
        new Beetle().printData();
    }
}
