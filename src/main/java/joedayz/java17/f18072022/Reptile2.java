package joedayz.java17.f18072022;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

public class Reptile2 {
    protected void sleep() throws IOException{}
    protected void hide(){}
    protected void exitShell() throws FileNotFoundException{}
}

class GalapagosTortoise extends Reptile2{
    /**sleep() de la clase hija puede o no puede declarar la excepción IOException, si declara solo tiene 2 opciones:
    * puede declarar la misma excepción IOException o uno menor o hija de IOException*/
    //public void sleep() {}
    public void sleep() throws FileNotFoundException{}

    /**Aqui si estoy libre para declarar una UnChecked Exception
     * y si declaro un Checked Expection NO COMPILA, porque en el padre no se ha declarado la Excepcción*/
    //public void hide() throws IOException{}//NO CCOMPILA
    public void hide(){}

    /**exitShell() de la clase hija declara una Excepccion mayor al declarado en la clase padre y por lo tanto no compila
     * Tiene que declarar una excepción igual o menor al declarado en la clase padre*/
    //public void exitShell() throws IOException {} //NO COMPILA
    public void exitShell() throws FileNotFoundException{}

}