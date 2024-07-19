/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calificacionesfinales;
import java.util.Scanner;
/**
 *
 * @author al-ro
 */
public class Calificacionesfinales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su calificacion de los parciales: ");
        double parcial = scanner.nextDouble();

        System.out.print("Ingrese su calificacion de su proyecto: ");
        double proyecto = scanner.nextDouble();

        System.out.print("Ingrese su calificacion de su examen final: ");
        double exFinal = scanner.nextDouble();

        double calPar = parcial * 40 / 100;
        double calProyecto = proyecto * 30 / 100;
        double calExFinal = exFinal * 30 / 100;
        double calFINAL = calPar + calProyecto + calExFinal;
            System.out.println("Tu calificacion final es: " + calFINAL);

        scanner.close();
    }
}