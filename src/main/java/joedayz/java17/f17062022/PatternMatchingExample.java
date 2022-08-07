package joedayz.java17.f17062022;

import java.util.List;

public class PatternMatchingExample {
    public static void main(String[] args) {
        PatternMatchingExample e = new PatternMatchingExample();
        e.compareIntegers(Integer.valueOf(5));
        e.compareIntegers(Integer.valueOf(3));
        e.compareIntegers(Integer.valueOf(8));
    }

    void compareIntegers(Number number){
        if(number instanceof Integer data){ //Aqui se traslada data y se comvierte como la variable pattern
            //Integer data = (Integer) number; //Ya no necesitas este casteo
            System.out.println(data.compareTo(5));
        }
    }

    void compareIntegers2(){
        Integer value = 123;

        if(value instanceof Integer){}//SI COMPILA

        /*if(value instanceof Integer data){ //No compila
            System.out.println(data.compareTo(5));
        }*/
    }

    void compareIntegers3(){
        Number value = 123;

        if(value instanceof List){}//Number y List no tienen nada en comun, y hay una limitación del compilador
        if (value instanceof List data){}

    }

    void printIntegersGreaterThan5(Number number){
        if (number instanceof Integer data && data.compareTo(5) > 0){ //En la misma linea se utiliza la variable pattern
            System.out.println(data);
        }
    }
}
