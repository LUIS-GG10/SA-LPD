import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {

    public static void main(String[] args) {
        // Crear diccionario Español-Inglés
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("hola", "hello");
        diccionario.put("adiós", "goodbye");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        // Agrega más palabras según tus necesidades

        // Escoger 5 palabras al azar
        String[] palabrasAleatorias = obtenerPalabrasAleatorias(diccionario, 5);

        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        for (String palabraEspañol : palabrasAleatorias) {
            System.out.print("Traduce '" + palabraEspañol + "' al inglés: ");
            String respuestaUsuario = scanner.nextLine().toLowerCase();

            if (diccionario.containsKey(palabraEspañol) && diccionario.get(palabraEspañol).equalsIgnoreCase(respuestaUsuario)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + diccionario.get(palabraEspañol));
                respuestasIncorrectas++;
            }
        }

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }

    private static String[] obtenerPalabrasAleatorias(Map<String, String> diccionario, int cantidad) {
        String[] palabras = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] palabrasAleatorias = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            palabrasAleatorias[i] = palabras[random.nextInt(palabras.length)];
        }

        return palabrasAleatorias;
    }
}
