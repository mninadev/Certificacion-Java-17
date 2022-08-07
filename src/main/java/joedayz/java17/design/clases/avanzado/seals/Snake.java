package joedayz.java17.design.clases.avanzado.seals;

/*public sealed class Snake permits Cobra{}
final class Cobra extends Snake{}*/

/**
 * Se puede omitir la clausula permits porque estan en el mismo archivo de clase java Snake.java,
 * si no estuvieran en el mismo archivo, no compilarían.
 * */
/*public sealed class Snake {}
final class Cobra extends Snake{}*/

/**
 * La regla de omitir sigue siendo valida, si la subclase es nested.
 * */
/*public sealed class Snake{
    final class Cobra extends Snake{}
}*/

/**
 * Pero que pasa si yo lo declaro permits?
 * */
public sealed class Snake permits Snake.Cobra{
    final class Cobra extends Snake{}
}