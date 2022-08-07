package joedayz.java17.design.clases.avanzado.interfaces.abstracto;

public class Proyecto implements ZooRenovation{
    public String projectName() { return "Site renovation";  }
    public String status() {return "En proceso";}
    private void printMessage(){ ZooRenovation.super.printStatus();    }
    public static void main(String[] args) {
        var p = new Proyecto();
        p.printMessage();
    }
}
