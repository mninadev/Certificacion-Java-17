package joedayz.java17.design.clases.avanzado.seals;

//Sealing con interfaces
public sealed interface Swims permits Duck, Swan, Floats{

}

final class Duck implements Swims{}
final class Swan implements Swims{}

non-sealed interface Floats extends Swims{}