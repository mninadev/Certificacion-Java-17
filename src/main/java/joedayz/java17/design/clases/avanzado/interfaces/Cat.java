package joedayz.java17.design.clases.avanzado.interfaces;

public class Cat implements Walk, Run{
    //Cuando se tiene un método con la misma firma en ambas interfaces se debe implementar OBLIGATORIAMENTE
    public int getSpeed() {
        return 1;
    }

    public int getWalkSpeed(){
        //Llamando al método oculto getSpeed() de la interface
        //return Walk.super.getSpeed();
        return Run.super.getSpeed();
    }
}

interface Walk{
    public default int getSpeed(){
        return 5;
    }
}

interface Run{
    public default int getSpeed(){
        return 10;
    }
}
