package joedayz.java17.f11072022;

public class VisitAttractions {
    public void walk1(int... steps){
        System.out.println(steps.length);
    }

    public static void run(int... steps){
        System.out.println(steps[1]);
    }
    public static void main(String[] args) {
        VisitAttractions visitAttractions = new VisitAttractions();
        //pasar como un array
        int[] data = new int[]{1,2,3,4};
        visitAttractions.walk1(data);
        //pasar una lista de valores
        visitAttractions.walk1(1,2,3,4,5);
        //Yo puedo pasar sin argumentos, eso lo hace diferente a varargs
        visitAttractions.walk1();
        //accediendo a los elementos de varargs
        run(11,12);

    }
}
