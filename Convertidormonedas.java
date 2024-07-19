/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.convertidormonedas;
import java.util.Scanner;
/**
 *
 * @author al-ro
 */
public class Convertidormonedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad en pesos (MXN): ");
        double pM = scanner.nextDouble();

        System.out.println("Seleccione a que desea convertir:");
        System.out.println("1. Dolar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dolar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dolar Canadiense (CAD)");
        System.out.println("9. Bolivar (VES)");
        System.out.println("10. Peso Argentino (ARS)");

        int opcion = scanner.nextInt();

        double cantidadConvertida;

        switch (opcion) {
            case 1:
                cantidadConvertida = pM * 0.054;
                System.out.printf("La cantidad en Dolares es: " + cantidadConvertida);
                break;
            case 2:
                cantidadConvertida = pM * 0.048;
                System.out.printf("La cantidad en Euros (EUR) es: " + cantidadConvertida);
                break;
            case 3:
                cantidadConvertida = pM * 1.89;
                System.out.printf("La cantidad en Baths (THB) es: " + cantidadConvertida);
                break;
            case 4:
                cantidadConvertida = pM * 5.99;
                System.out.printf("La cantidad en Yenes (JPY) es: " + cantidadConvertida);
                break;
            case 5:
                cantidadConvertida = pM * 70.15;
                System.out.printf("La cantidad en Wones (KRW) es: " + cantidadConvertida);
                break;
            case 6:
                cantidadConvertida = pM * 0.082;
                System.out.printf("La cantidad en Dolares Australianos (AUD) es: " + cantidadConvertida);
                break;
            case 7:
                cantidadConvertida = pM * 0.20;
                System.out.printf("La cantidad en Soles (PEN) es: " + cantidadConvertida);
                break;
            case 8:
                cantidadConvertida = pM * 0.072;
                System.out.printf("La cantidad en Dolares Canadienses (CAD) es: " + cantidadConvertida);
                break;
            case 9:
                cantidadConvertida = pM * 1.74;
                System.out.printf("La cantidad en Bolivares (VES) es: " + cantidadConvertida);
                break;
            case 10:
                cantidadConvertida = pM * 24.78;
                System.out.printf("La cantidad en Pesos Argentinos (ARS) es: " + cantidadConvertida);
                break;
            default:
                System.out.println("Opción no valida.");
                break;
        }
        scanner.close();
    }
}
