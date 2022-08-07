package joedayz.java17.f18072022;

public class Duck {
    private String color;
    private int height;
    private int lenght;

    public void setData(int lenght, int newHeight){
        lenght = this.lenght;
        height = newHeight;
        this.color = "white";
    }

    public static void main(String[] args) {
        var b = new Duck();
        b.setData(10, 20);
        System.out.println(b.lenght+", "+b.height+", "+b.color);
    }
}
