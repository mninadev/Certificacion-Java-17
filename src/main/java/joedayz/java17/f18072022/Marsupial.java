package joedayz.java17.f18072022;

public class Marsupial {
    public String name = "marsupial";
    public double getAverageWeight(){
        return 50;
    }

    public String printName(){
        return name;
    }
}

class Kangaroo extends Marsupial{

    @Override
    public double getAverageWeight() {
        //return getAverageWeight()+50;//Sin el super no dará error StackOverflowError
        System.out.println(printName());
        return super.getAverageWeight()+50;
    }



    public static void main(String[] args) {
        System.out.println(new Marsupial().getAverageWeight());
        System.out.println(new Kangaroo().getAverageWeight());
        System.out.println(new Kangaroo().printName());
    }
}
