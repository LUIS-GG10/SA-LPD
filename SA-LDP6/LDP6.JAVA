import java.util.Scanner;

public class InvertirPalabra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase: ");
        String entradaUsuario = scanner.nextLine();

        String invertida = invertirTexto(entradaUsuario);

        System.out.println("Texto invertido: " + invertida);
    }

    public static String invertirTexto(String texto) {
        StringBuilder resultado = new StringBuilder();

        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado.append(texto.charAt(i));
        }

        return resultado.toString();
    }
}
