public abstract class AsciiArtDecorator extends AsciiArt {
    @Override
    public int getAncho() {
        return getLineas()[0].length();
    }

    @Override
    public int getAlto() {
        return getLineas().length;
    }
}
