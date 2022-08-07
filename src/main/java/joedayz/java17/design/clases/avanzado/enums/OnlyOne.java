package joedayz.java17.design.clases.avanzado.enums;

public enum OnlyOne {
    ONCE(true);
    private OnlyOne(boolean b){
        System.out.println("Constructing, ");
    }
}

class PrintTheOne{
    public static void main(String[] args) {
        System.out.println("Begin, ");
        OnlyOne firstCall = OnlyOne.ONCE; //Imprimir Constructing
        OnlyOne secondCall = OnlyOne.ONCE; //No imprime nada, solo se inicializa y se usa una sola vez
        System.out.println("End");
    }
}
