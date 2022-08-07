package joedayz.java17.design.clases.inmutables;

import java.util.ArrayList;
import java.util.List;

public final class AnimalInmutable {//An inmutable object declaration
    private final List<String> favoriteFoods;

    public AnimalInmutable() {
        this.favoriteFoods = new ArrayList<>();
        this.favoriteFoods.add("Apples");
    }

    public int getFavoriteFoodsCount(){
        return favoriteFoods.size();
    }

    public String getFavoriteFoodsItem(int index){
        return favoriteFoods.get(index);
    }
}
