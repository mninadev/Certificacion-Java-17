package joedayz.java17.f18072022;

public abstract class Animal2 {
    abstract String getName();
}

abstract class BigCat2 extends Animal2{
    protected abstract void roar();
}

class Lion3 extends BigCat2{

    @Override
    String getName() {
        return "Lion";
    }

    @Override
    protected void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }
}

