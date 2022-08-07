package joedayz.java17.f15062022;

public class PromocionNumerica {
    public static void main(String[] args) {
        int x = 1;
        long y = 33;
        var z = x*y; //x se promueva a long
        System.out.println("valor de z : "+z);//tipo de z es long

        double x1 = 39.21;
        float y1 = 2.1f;
        var z1 = x1 + y1; //y1 se promueve a double
        System.out.println("z1 = "+z1);//z1 es de tipo double

        short x2 = 10;
        short y2 = 10;
        var z2 = x2*y2; // x2 y y2 se promueven a int
        System.out.println("z2 = "+z2);

        short w = 14;
        float x3 = 13;
        double y3 = 30;
        var z3 = w*x3/y3;////w promueves a int, pero después promueves a double, x3 promueves a double y luego todos estan en double.
    }
}
