/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pc1.poo012312210;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class PC1POO012312210 {

    /**
     * @param args the command line arguments
     */
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
