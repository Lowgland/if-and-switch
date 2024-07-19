/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estaciones;
import java.util.Scanner;
/**
 *
 * @author al-ro
 */
public class Estaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un mes (1-12): ");
        int mes = scanner.nextInt();

        String estacion;
        switch (mes) {
            case 12:
            case 1:
            case 2:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otono";
                break;
            default:
                estacion = "Mes invalido";
                break;
        }

        System.out.println("La estacion correspondiente es: " + estacion);

        scanner.close();
    }
}