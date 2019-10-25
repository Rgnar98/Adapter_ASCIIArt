public class Marco extends AsciiArtDecorator {
    private AsciiArt art;
    private char c;


    public Marco(AsciiArt art, char c) {
        this.art = art;
        this.c = c;
    }

    @Override
    public String[] getLineas() {
        StringBuilder s = new StringBuilder();
        String extremo = s.append(String.valueOf(c).repeat(art.getAncho()+2)).toString();
        String central = c + art.getLineas()[0] + c;
        String[] nueva = new String[art.getAlto()+2];
        nueva[0] = extremo;
        for (int i=1; i<nueva.length-2;i++){
            nueva[i] = central;
            central = c + art.getLineas()[i] + c;
        }
        nueva[nueva.length-2] = c + art.getLineas()[art.getAlto()-1] + c;
        nueva[nueva.length-1] = extremo;

        return nueva;
    }

}
