package joedayz.java17.design.clases.avanzado.enums;

public interface Weather {
    int getAverageTemperature();
}

enum Season3 implements Weather{
    WINTER, SPRING, SUMMER, FALL;

    @Override
    public int getAverageTemperature() {
        return 30;
    }
}

class Test04{
    public static void main(String[] args) {
        System.out.println(Season3.WINTER.getAverageTemperature());
        System.out.println(Season3.SPRING.getAverageTemperature());

    }
}
