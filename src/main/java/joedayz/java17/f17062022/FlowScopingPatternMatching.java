package joedayz.java17.f17062022;

public class FlowScopingPatternMatching {

    void printIntegersOrNumbersGreaterThan5(Number number){
        /*if(number instanceof Integer data || data.compareTo(5) > 0){ //NO COMPILA
            System.out.println(data);
        }*/
    }

    void printIntegerTwice(Number number){
        if(number instanceof Integer data){
            System.out.println(data.intValue());
        }
    }
}
