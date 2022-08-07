package joedayz.java17.design.clases.avanzado.interfaces.abstracto;

public interface ZooRenovation {
    public String projectName(); //Abstract
    abstract String status();//Abstract
    default void printStatus(){
        System.out.println("The "+projectName()+" project "+status());
    }
}

