package joedayz.java17.f18072022;

public class Camel {
    public int getNumberOfHumps(){
        return 1;
    }
}

class BactrianCamel extends Camel{
    /*@Override
    private int getNumberOfHumps() {//NO COMPILA, porque es menos accesible que el de la clase padre
        return super.getNumberOfHumps();
    }*/

    @Override
    public int getNumberOfHumps() {
        return super.getNumberOfHumps();
    }
}

class Rider{
    public static void main(String[] args) {
        Camel camel = new BactrianCamel(); //Esto es polimorfismo (Izquierda Clase Padre = Clase Hija lado derecho)
        System.out.println(camel.getNumberOfHumps());
    }
}
