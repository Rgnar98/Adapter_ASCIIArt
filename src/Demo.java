import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<StringArt> animales = new ArrayList<StringArt>();
        animales.add(new Rana());animales.add(new Murcielago());
        for (StringArt animal : animales) {
            dibuja(new Marco(new StringArt2AsciiArt(animal), '#'));
        }

    }

    private static void dibuja(AsciiArt art) {
        for (String linea : art.getLineas()) System.out.println(linea);
    }
}
