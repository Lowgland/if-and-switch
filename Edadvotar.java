/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.edadvotar;
import java.util.Scanner;
/**
 *
 * @author al-ro
 */
public class Edadvotar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        double edad = scanner.nextDouble();
        
        if (edad>=18){
            System.out.print("Tienes edad para votar.");
        }
        else {
            System.out.print("No tienes edad suficiente para votar.");
        }
        scanner.close();
    }
}
