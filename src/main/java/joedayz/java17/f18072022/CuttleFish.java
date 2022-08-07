package joedayz.java17.f18072022;

public class CuttleFish {
    private String name = "swimmy";
    {
        System.out.println(name);
    }

    private static int COUNT = 0;
    static {
        System.out.println(COUNT);
    }
    {
        COUNT++;
        System.out.println(COUNT);
    }

    public CuttleFish(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Ready");//0 ready
        new CuttleFish();//swimmy, 1, constructor
    }
}
