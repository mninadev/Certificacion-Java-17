package joedayz.java17.design.clases.avanzado.seals;

public sealed class Wolf permits Timber{

}

non-sealed class Timber extends Wolf{

}

class MyWolf extends Timber{

}