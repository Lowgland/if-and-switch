/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.preciocondescuento;

import java.util.Scanner;

/**
 *
 * @author al-ro
 */
public class Preciocondescuento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        
        if (precio<= 100) {
            System.out.print("El producto no tiene descuento.");
        } else if (precio>100 && precio<= 200) {
            double desc = precio * 0.9;
            System.out.print("El precio del producto con descuento es: " + desc);
        } else if (precio>200 && precio<=500) {
            double desc = precio * 0.8;
            System.out.print("El precio del producto con descuento es: " + desc);
        } else if (precio>500) {
            double desc = precio * 0.75;
            System.out.print("El precio del producto con descuento es: " + desc);
        }
    }
}
