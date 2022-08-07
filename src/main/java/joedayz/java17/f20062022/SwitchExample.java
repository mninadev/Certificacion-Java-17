package joedayz.java17.f20062022;

public class SwitchExample {
    public static void main(String[] args) {
        int animal = 0;
        //Java >= 14
        switch (animal){
            case 1, 2:
                System.out.println("Lion");
            case 3:
                System.out.println("Tiger");
        }

        //Java < 14
        switch (animal){
            case 1:
            case 2:
                System.out.println("Lion");
            case 3:
                System.out.println("Tiger");
        }

        SwitchExample e = new SwitchExample();
        e.printDayOfWeek(0);
    }

    public void printDayOfWeek(int day){
        switch (day){
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
                //...
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid value");
                break;
        }

    }
}
