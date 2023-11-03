import java.util.Scanner;

public class TiempoHastaFinDeSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un día de la semana (lunes a viernes): ");
            String diaSemana = scanner.nextLine().toLowerCase();

            if (esDiaValido(diaSemana)) {
                System.out.print("Ingrese la hora (en formato 24 horas): ");
                int hora = scanner.nextInt();

                System.out.print("Ingrese los minutos: ");
                int minutos = scanner.nextInt();

                if (esHoraValida(hora) && sonMinutosValidos(minutos)) {
                    calcularMinutosHastaFinDeSemana(diaSemana, hora, minutos);
                    break;
                } else {
                    System.out.println("Error: Hora o minutos no válidos. Vuelva a intentarlo.");
                    scanner.nextLine();  // Limpiar el buffer del scanner
                }
            } else {
                System.out.println("Error: Día de la semana no válido. Vuelva a intentarlo.");
            }
        }
    }

    private static boolean esDiaValido(String dia) {
        return dia.equals("lunes") || dia.equals("martes") || dia.equals("miércoles") ||
               dia.equals("jueves") || dia.equals("viernes");
    }

    private static boolean esHoraValida(int hora) {
        return hora >= 0 && hora < 24;
    }

    private static boolean sonMinutosValidos(int minutos) {
        return minutos >= 0 && minutos < 60;
    }

    private static void calcularMinutosHastaFinDeSemana(String dia, int hora, int minutos) {
        int minutosHastaFinDeSemana = 0;

        switch (dia) {
            case "lunes":
            case "martes":
            case "miércoles":
                minutosHastaFinDeSemana = ((4 - obtenerNumeroDia(dia)) * 24 * 60) + ((15 - hora) * 60) + (60 - minutos);
                break;
            case "jueves":
            case "viernes":
                minutosHastaFinDeSemana = ((6 - obtenerNumeroDia(dia)) * 24 * 60) + ((15 - hora) * 60) + (60 - minutos);
                break;
        }

        System.out.println("Minutos hasta el fin de semana: " + minutosHastaFinDeSemana);
    }

    private static int obtenerNumeroDia(String dia) {
        switch (dia) {
            case "lunes":
                return 1;
            case "martes":
                return 2;
            case "miércoles":
                return 3;
            case "jueves":
                return 4;
            case "viernes":
                return 5;
            default:
                return 0;
        }
    }
}
