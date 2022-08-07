package joedayz.java17.f18072022;

public class BigCat {
    protected double size;

    static class Nested{

    }
}

class Jaguar extends BigCat{
    public Jaguar() {
        size = 10.2;
    }

    public void printDetails(){
        System.out.println(size);
    }
}

class Spider{
    public void printDetails(){
        //System.out.println(size);//NO COMPILA
    }
}
