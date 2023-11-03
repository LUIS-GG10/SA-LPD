import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Diccionario {

    public static void main(String[] args) {
        // Crear diccionario Español-Inglés
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("hola", "hello");
        diccionario.put("adiós", "goodbye");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        // Agrega más palabras según tus necesidades

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese una palabra en español (o 'salir' para terminar): ");
            String palabraEspañol = scanner.nextLine().toLowerCase();

            if (palabraEspañol.equals("salir")) {
                break;
            }

            if (diccionario.containsKey(palabraEspañol)) {
                String palabraIngles = diccionario.get(palabraEspañol);
                System.out.println("La traducción al inglés es: " + palabraIngles);
            } else {
                System.out.println("La palabra no se encuentra en el diccionario.");
            }
        }
    }
}
