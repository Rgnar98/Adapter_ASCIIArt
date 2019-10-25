import java.util.ArrayList;

public class StringArt2AsciiArt extends AsciiArt {
    private StringArt animal;

    public StringArt2AsciiArt(StringArt animal) {
        this.animal = animal;
    }

    @Override
    public int getAncho() {
        return getLineas()[0].length();
    }

    @Override
    public int getAlto() {
        return getLineas().length;
    }

    @Override
    public String[] getLineas() {
        String[] n = animal.Dibujo().split("\n");
        int longitud = n[0].length();

        for(String s: n){
            if(s.length() >= longitud)
                longitud = s.length();
        }
        for(int i=0; i<n.length; i++){
            int espacios = longitud-n[i].length();
            n[i] += String.valueOf(' ').repeat(espacios);
        }
        return n;
    }
}
