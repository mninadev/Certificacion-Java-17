package joedayz.java17.f18072022;

public class Reptile {
    protected int speed = 10;
}


class Crocodile extends Reptile{
    protected int speed = 20;
    public int getSpeed(){
        System.out.println("hola");
        return super.speed;
    }

    public static void main(String[] args) {
        var croc = new Crocodile();
        System.out.println(croc.getSpeed());
        System.out.println();
    }
}