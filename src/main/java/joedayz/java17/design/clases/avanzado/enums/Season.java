package joedayz.java17.design.clases.avanzado.enums;

public enum Season {
    WINTER, SPRING, SUMMER, FALL
}

class Test{
    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.println(Season.SUMMER); //Imprimirá SUMMER
        System.out.println(s==Season.SUMMER);//Imprimirá TRUE

        for(Season season : Season.values()){
            System.out.println(season.name()+", "+season.ordinal());
        }

        Season s1 = Season.valueOf("SUMMER");//SUMMER
        Season s2 = Season.valueOf("summer"); //Throws an exception IllegalArgumentException at runtime

        Season summer = Season.SUMMER;
        switch (summer){
            case WINTER:
                System.out.println("It's Winter"); break;
            case SUMMER:
                System.out.println("It's Summer"); break;
            default:
                System.out.println("Default");
        }
    }
}