package joedayz.java17.f18072022;

public abstract class Canine {
    public abstract String getSound();

    //public abstract int hand = 4;//NO COMPILA

    /*public abstract Canine(int hand) {//NO COMPILA
        this.hand = hand;
    }*/

    //public abstract static void eat();//NO COMPILA

    public void bark(){
        System.out.println(getSound());
    }

    public static void main(String[] args) {
        Canine f = new Fox();//Ya cuando se ejecuta Canine se transforma en Fox y llama al metodo getSound() de Fox.
        f.bark();
    }
}

class Wolf extends Canine{

    @Override
    public String getSound() {
        return "Wooolf";
    }
}

class Fox extends Canine{

    @Override
    public String getSound() {
        return "AUh...";
    }
}


