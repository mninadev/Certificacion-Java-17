package joedayz.java17.design.clases.avanzado.seals;

public sealed class Antelope permits Gazelle{

}

final class Gazelle extends Antelope{

}

/*class George extends Gazelle{//DOES NOT COMPILE

}*/
