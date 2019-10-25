public class Triangulo extends AsciiArt {

    public Triangulo(int longitud, char c) {
        lineas = new String[longitud];
        StringBuilder s = new StringBuilder();
        String espacio = " ";



        for(int i = 0; i<longitud; i++){
            s.append(String.valueOf(c).repeat(i + 1)).append(espacio.repeat(longitud - (i + 1)));
            lineas[i] = s.toString();
            s.setLength(0);
        }


    }
}
