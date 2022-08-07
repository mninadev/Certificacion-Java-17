package joedayz.java17.design.clases.avanzado.enums;

public enum DocumentType {
    DNI("dni"){
        public void printDescription(){
            System.out.println("Print DNI");
        }
    },
    CE("Carnet de extranjeria"){
        public void printDescription(){
            System.out.println("Print CE");
        }
    },
    PASS("Pasaporte"){
        public void printDescription(){
            System.out.println("Print PASS");
        }
    };
    private final String description;

    private DocumentType(String description) {
        this.description = description;
    }
    public abstract void printDescription();//Método abstracto, todos los valores estan obligados a implementarlo
    public void sayHello(){
        System.out.println("Hello");
    }
}

class Test2{
    public static void main(String[] args) {
        DocumentType.DNI.sayHello();//Hello
        DocumentType.PASS.printDescription();
    }
}
