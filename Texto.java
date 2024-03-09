public class Texto {

    public static void main(String[] args) {
        String texto = "Debo ser agradecido con Dios con mi familia y con la vida; por darme la oportunidad de es estudiar una carrera universitaria.\n"
                + "Debo aprovechar esa oportunidad, de la siguiente manera:\n"
                + //
                "Prestando atención en clase .\n" + //
                "Estudiando fuera de clase .\n" + //
                "Practicando fuera de clase .\n" + //
                "Investigando en todo momento.\n" + //
                "De esa manera tan fácil puedo ser un excelente profesional y poder triunfar en la vida devolviendo el favor a Dios y a los que me apoyaron.";

                buscarAndContar(texto, "Arrieta");
                buscarAndContar(texto, "clase");
    }

    public static void numeroLineas(String text) {
        int n = 0;
        String bucar = ".";
        String bucar2 = ":";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == bucar.charAt(0) || text.charAt(i) == bucar2.charAt(0)) {
                n++;
            }
        }
        System.out.println("El texto tiene " + n + " lineas");
    }

    public static void convertirMayuscula(String text) {
        System.out.println("Texto en Mayúscula");
        System.out.println(text.toUpperCase());
    }

    public static void convertirMinuscula(String text) {
        System.out.println("Texto en minúscula");
        System.out.println(text.toLowerCase());
    }

    public static void capitalizar(String texto) {
        String palabrasCapitalizadas = CapitalizarPalabras.capitalizarPalabra(texto);
        System.out.println("Texto capitalizo");
        System.out.println(palabrasCapitalizadas);
    }

    public static void contarPalabras(String texto) {        
        int n = texto.length();
        String buscar = " ";
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == buscar.charAt(0)) {
                n--;
            }
        }
        System.out.println("El texto tiene " +  n + " palabras contando signos de puntuación");        
    }
    public static void contarVocales(String texto) {        
        int n = 0;
        String vocales = "aeiouAEIOUáéíóú";
        
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (vocales.indexOf(caracter) != -1) {
                n++;
            }
        }       
        System.out.println("El texto tiene " +  n + " vocales");        
    }

    public static void remplazarPalabras(String texto) {
        String[] word = texto.split("\\s+");

        StringBuilder union = new StringBuilder();
        String palabra  = "Dios";
        for (int i = 0; i < word.length; i++) {
            if (word[i].equalsIgnoreCase(palabra)) {
                word[i] = "Mi creador";
            }
            union.append(word[i]).append(" ");
        }
        System.out.println("Remplazando 'Dios' por 'Mi creador' ");
        System.out.println(union);
    }

    public static void buscarAndContar(String texto, String palabra) {
        String[] words = texto.split("\\s+");
        int n = 0;
        StringBuilder union = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(palabra)) {
                n++;
            }
            union.append(words[i]).append(" ");
        }
        System.out.println("La palabra " + palabra + " aparece un total de " + n  + " veces.");
    }
}