/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calificacionesletras;
import java.util.Scanner;
/**
 *
 * @author al-ro
 */
public class Calificacionesletras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su calificacion (1-100): ");
        double cal = scanner.nextDouble();
        
        if (cal>= 90 && cal<= 100) {
            System.out.println("Tu calificacion es A");
        } else if (cal>= 80 && cal<= 89) {
            System.out.println("Tu calificacion es B");
        } else if (cal>= 70 && cal<= 79) {
            System.out.println("Tu calificacion es C");
        } else if (cal>= 60 && cal<= 69) {
            System.out.println("Tu calificacion es D");
        } else if (cal<60) {
            System.out.println("Tu calificacion es F");
        }
    }
}
