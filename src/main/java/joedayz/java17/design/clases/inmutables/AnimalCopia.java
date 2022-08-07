package joedayz.java17.design.clases.inmutables;

import java.util.ArrayList;
import java.util.List;

public final class AnimalCopia {
    private final ArrayList<String> favoriteFoods;
    public AnimalCopia(){
        this.favoriteFoods = new ArrayList<String>();
        this.favoriteFoods.add("Apples");
    }

    public ArrayList<String> getFavoriteFoods(){
        return new ArrayList<String>(this.favoriteFoods);//Le pasamos una copia de la lista original favoriteFoods.
    }
}

class Test1{
    public static void main(String[] args) {
        var zebra = new AnimalCopia();
        System.out.println(zebra.getFavoriteFoods());

        zebra.getFavoriteFoods().clear();
        zebra.getFavoriteFoods().add("Chocolate chip coookies");
        System.out.println(zebra.getFavoriteFoods());
    }
}