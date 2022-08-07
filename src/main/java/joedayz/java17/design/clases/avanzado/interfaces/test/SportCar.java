package joedayz.java17.design.clases.avanzado.interfaces.test;

public class SportCar extends Car{
    public int gearRatio = 9;
    public String accelerate(){
        return "Accelerate: SportCar";
    }

    public static void main(String[] args) {
        Car c =  new SportCar();
        System.out.println(c.gearRatio+" "+c.accelerate());
    }
}

class Car{
    public int gearRatio = 8;
    public String accelerate(){
        return "Accelerate : Car";
    }
}
