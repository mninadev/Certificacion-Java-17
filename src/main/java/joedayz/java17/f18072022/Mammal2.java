package joedayz.java17.f18072022;

public abstract class Mammal2 {
    abstract void showHorn();
    abstract void eatLeaf();
}

abstract class RhinoAbstract extends Mammal2{
    //Puedo implementar un solo método
    void showHorn() {

    }

}

class BlackRhino extends RhinoAbstract{

    //Mi hijo puede implementar el método que falta implementar
    void eatLeaf() {

    }


}