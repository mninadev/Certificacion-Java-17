package joedayz.java17.f18072022;

public class Turtle {
    private String name;

    public Turtle() {
        this.name = "John Roe";
    }

    public Turtle(int age){}
    public Turtle(long age){}
    public Turtle(String newName, String... favoriteFoods){
        name = newName;
    }

    public static void main(String[] args) {
        new Turtle(15);
        new Turtle(20L);
        new Turtle();
        new Turtle("pepe", new String[]{"Coliflor","pez","planton"});
        new Turtle("hugo");
    }
}
