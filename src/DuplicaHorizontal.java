public class DuplicaHorizontal extends AsciiArtDecorator {
    private AsciiArt art;

    public DuplicaHorizontal(AsciiArt art) {
        this.art = art;
    }


    @Override
    public String[] getLineas() {
        StringBuilder s = new StringBuilder();
        String[] nueva = new String[art.getAlto()];
        for (int i=0;i<art.getAlto();i++){
            s.append(art.getLineas()[i].repeat(2));
            nueva[i] = s.toString();
            s.setLength(0);
        }
        return nueva;
    }
}
