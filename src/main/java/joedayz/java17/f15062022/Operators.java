package joedayz.java17.f15062022;

public class Operators {
    public static void main(String[] args) {
        int cookies = 4;
        double reward = 3 + 2 * --cookies;
        System.out.println(reward);

        int value = 3;
        int complement = ~value;
        System.out.println(value); //0011
        System.out.println(complement);//1100

        System.out.println(-1*value - 1);
        System.out.println(-1*complement -1);

    }
}
