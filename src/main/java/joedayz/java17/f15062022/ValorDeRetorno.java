package joedayz.java17.f15062022;

public class ValorDeRetorno {
    public static void main(String[] args) {
        long wolf = 5;
        long coyote = wolf = 3;//primero asigna el valor de 3 a wolf y retorna el valor de 3 a la asignacion.
        System.out.println(wolf);
        System.out.println(coyote);

        boolean healthy = false;
        if (healthy=true){
            System.out.println("Good");
        }

        int stripes = 7;
        System.out.println((stripes < 5) ? 21: "Zebra");
    }
}
