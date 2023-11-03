import java.util.Scanner;

public class OrdenarPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Solicitar al usuario 10 números y almacenarlos en un array
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar array original
        System.out.println("Array original:");
        mostrarArray(numeros);

        // Mover números primos al principio del array
        moverPrimosAlPrincipio(numeros);

        // Mostrar array con primos al principio
        System.out.println("Array con primos al principio:");
        mostrarArray(numeros);
    }

    private static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice " + i + ": " + array[i]);
        }
        System.out.println();
    }

    private static void moverPrimosAlPrincipio(int[] array) {
        int[] newArray = new int[array.length];
        int indiceNuevoArray = 0;

        // Mover números primos al principio
        for (int i = 0; i < array.length; i++) {
            if (esPrimo(array[i])) {
                newArray[indiceNuevoArray++] = array[i];
            }
        }

        // Mover los demás números al final
        for (int i = 0; i < array.length; i++) {
            if (!esPrimo(array[i])) {
                newArray[indiceNuevoArray++] = array[i];
            }
        }

        // Copiar el nuevo array al array original
        System.arraycopy(newArray, 0, array, 0, array.length);
    }

    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
