package joedayz.java17.f18072022;

public class Rhino {
    protected CharSequence getName(){
        return "rhino";
    }
    protected String getColor(){
        return "grey, black, or white";
    }
}

class JavaRhino extends Rhino{
    //String es un subtipo de CharSequence, String implementa a CharSequence
    protected String getName() {
        return "rhino";
    }

    /*protected CharSequence getColor() {//NO COMPILA
        return super.getColor();
    }*/
}
