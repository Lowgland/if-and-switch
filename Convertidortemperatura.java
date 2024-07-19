/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.convertidortemperatura;
import java.util.Scanner;
/**
 *
 * @author al-ro
 */
public class Convertidortemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.println("Seleccione a que sistema convertir:");
        System.out.println("1. Convertir a Fahrenheit");
        System.out.println("2. Convertir a Kelvin");

        int opcion = scanner.nextInt();

        double temperaturafinal;

        switch (opcion) {
            case 1:
                temperaturafinal = (celsius * 1.8) + 32;
                System.out.printf("La temperatura en Fahrenheit es: " + temperaturafinal);
                break;
            case 2:
                temperaturafinal = celsius + 273.15;
                System.out.printf("La temperatura en Kelvin es: " + temperaturafinal);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        scanner.close();
    }
}

