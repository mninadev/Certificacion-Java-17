package joedayz.java17.design.clases.inmutables;

import java.util.ArrayList;

public final class AnimalMutable {//Not an inmutable object declaration
    private final ArrayList<String> favoriteFoods;

    public AnimalMutable(ArrayList<String> favoriteFoods) {
        if(favoriteFoods == null || favoriteFoods.size() == 0){
            throw new RuntimeException("Favorite Foods is required");
        }
        //this.favoriteFoods = favoriteFoods;//Con esto trabajaremos sobre la lista original
        this.favoriteFoods = new ArrayList<String>(favoriteFoods);//En esta linea estamos pasamos el original y se genera la copia, entonces es mucho mas seguro porque no va permitir modificar la lista original
    }

    public int getFavoriteFoodsCount(){
        return favoriteFoods.size();
    }

    public String getFavoriteFoodsItem(int index){
        return favoriteFoods.get(index);
    }
}

class Test2{
    public static void main(String[] args) {
        var favorites = new ArrayList<String>();
        favorites.add("Apples");

        var zebra = new AnimalMutable(favorites);//caller still has access to favorites
        System.out.println(zebra.getFavoriteFoodsItem(0));//Apples

        favorites.clear();
        favorites.add("Chocolate chip coookies");
        System.out.println(zebra.getFavoriteFoodsItem(0));
    }
}