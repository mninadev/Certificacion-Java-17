package joedayz.java17.f11072022;

public class DogWalker {
    public static void walkDog(int start, int... steps){
        System.out.println(steps.length);
    }

    public static void main(String[] args) {
        walkDog(1);
        walkDog(1, 2);
        walkDog(1, 1,2);
        walkDog(1, new int[]{4,5,6});

        walkDog(1, null);//Dará NullPointerException
        //walkDog();//Mínimo se tiene que pasar el primer argumento
    }
}
