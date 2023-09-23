import java.util.Scanner;

public class CalculoPuntosTemporada {
    public static void main(String[] args) {
        int puntosOb = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de juegos realizados: ");
        int numJuegos = scanner.nextInt();

        for (int juego = 1; juego <= numJuegos; juego++) {
            System.out.print("Puntos obtenidos en el juego " + juego + ": ");
            int puntosJuego = scanner.nextInt();

            if (puntosJuego == -1) {
                break;
            }

            puntosOb += puntosJuego;
        }

        System.out.println("Puntos totales de la temporada: " + puntosOb);
    }
}
