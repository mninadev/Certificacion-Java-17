package joedayz.java17.design.clases.avanzado.interfaces.privado;

//Metodos en una interface
public interface Schedule {
    default void wakeUp(){checkTime(7);}
    private void haveBreakFast(){checkTime(9);}
    static void workOut(){checkTime(18);}
    private static void checkTime(int hour){
        if (hour > 17){
            System.out.println("Llegaste tarde!");
        }else{
            System.out.println("Tienes "+(17-hour)+" horas extras");
        }
    }
}
