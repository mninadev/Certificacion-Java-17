package joedayz.java17.f13062022;

public class DataTypes {
    public static void main(String[] args) {
        String  textBlock = """
                "Java Study Guide"
                   by pepito
                """;

        System.out.println(textBlock);

        String piramide = """
                  *
                 *  *
                *  *  *
                """;
        System.out.println(piramide);

        //String block = """  """; //En la misma linea no compila, se requiere el break de linea

        String block = """
                abc \
                bear"""; //Con el \ se imprime en la misma linea
        System.out.println(block); //1 linea

        String block2 = """
                abc \n
                bear""";
        System.out.println(block2); //4 Lineas

        String block3 = """
                "abc \"\"\"
                \"bear""\"
                """;
        System.out.println(block3); //4 Lineas


    }
}
