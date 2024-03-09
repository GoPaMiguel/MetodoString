public class CapitalizarPalabras {


    public static String capitalizar(String palabra) {
        if (palabra == null || palabra.isEmpty()) {
            return palabra;
        }
        return palabra.substring(0, 1).toUpperCase() + palabra.substring(1);
    }


    public static String capitalizarPalabra(String texto) {
        
        String[] palabras = texto.split("\\s+");

        StringBuilder procesado = new StringBuilder();
        for (String palabra : palabras) {
            procesado.append(capitalizar(palabra)).append(" ");
        }
        return procesado.toString().trim();
    }
}
