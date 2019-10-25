public class Cuadrado extends AsciiArt {

    public Cuadrado(int longitud, char c) {
        lineas = new String[longitud];
        StringBuilder s = new StringBuilder();
        s.append(String.valueOf(c).repeat(longitud));

        for (int i=0;i<longitud;i++)
            lineas[i] = s.toString();

    }
}
