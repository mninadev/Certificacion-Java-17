package joedayz.java17.design.clases.inmutables;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase es Mutable porque se puede instanciar y modificar sus variables privadas.
 * */
public final class Animal {
    private final ArrayList<String> favoriteFoods;
    public Animal(){
        this.favoriteFoods = new ArrayList<String>();
        this.favoriteFoods.add("Apples");
    }

    public List<String> getFavoriteFoods(){
        return favoriteFoods;
    }
}

class Test{
    public static void main(String[] args) {
        var zebra = new Animal();
        System.out.println(zebra.getFavoriteFoods());

        zebra.getFavoriteFoods().clear();
        zebra.getFavoriteFoods().add("Chocolate chip coookies");
        System.out.println(zebra.getFavoriteFoods());
    }
}
