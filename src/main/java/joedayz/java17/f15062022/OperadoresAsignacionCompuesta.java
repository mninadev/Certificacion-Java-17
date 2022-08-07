package joedayz.java17.f15062022;

public class OperadoresAsignacionCompuesta {
    public static void main(String[] args) {
        int camel = 2, giraffe = 3;
        camel = camel*giraffe;//operacion de asignacion simple
        camel *= giraffe;  //operacion de asignacion compuesta

        long goat = 10;
        int sheep = 5;
        //sheep = sheep * goat;//no compila
        sheep *= goat;//primero castea sheep a long y luego opera los dos valores long y al final de manera interna castea a int para asignar al izquierdo.

    }
}
