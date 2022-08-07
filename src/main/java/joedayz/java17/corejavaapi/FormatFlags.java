package joedayz.java17.corejavaapi;

public class FormatFlags {
    public static void main(String[] args) {
        var pi = 3.14159265359;
        System.out.format("[%f]", pi);//Por defecto te muestra 6 digitos
        System.out.format("[%.1f]", pi);
        System.out.format("[%12.8f]", pi);
        System.out.format("[%012f]", pi);
    }
}
