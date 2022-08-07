package joedayz.java17.design.clases.avanzado.interfaces.estaticos;

public interface Hop {
    static int getJumpHeight(){
        return 8;
    }
}

class Skip implements Hop{
    public int skip(){
        //System.out.println(getJumpHeight());//DOES NOT COMPILE
        return Hop.getJumpHeight(); //Esta es la manera correcta de llamar a un método static de una interface.
    }
}
