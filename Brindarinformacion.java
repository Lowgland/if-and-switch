/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.brindarinformacion;
import java.util.Scanner;
/**
 *
 * @author al-ro
 */
public class Brindarinformacion {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione alguna de las siguientes opciones: ");
        System.out.println("1. Luis Miguel");
        System.out.println("2. Soda Stereo");
        System.out.println("3. Radiohead");
        System.out.println("4. Mos Def");
        System.out.println("5. Peso Pluma");
        System.out.println("6. Alejandro Sanz");
        int artista = scanner.nextInt();

        switch (artista) {
            case 1:
                System.out.println("Cantante mexicano conocido como El Sol de Mexico, famoso por su versatilidad en boleros, baladas y pop. Uno de los artistas mas exitosos de America Latina.");
                break;
            case 2:
                System.out.println("Banda de rock argentina formada en 1982, considerada una de las mas influyentes del rock en espanol. Liderada por Gustavo Cerati.");
                break;
            case 3:
                System.out.println("Banda britanica de rock alternativo, famosa por su sonido experimental y letras introspectivas. Conocidos por albumes como OK Computer y Kid A.");
                break;
            case 4:
                System.out.println("Rapero, actor y activista estadounidense. Conocido por sus letras inteligentes y fusion de rap con otros generos. Album destacado: Black on Both Sides.");
                break;
            case 5:
                System.out.println("Cantante mexicano de corrido tumbado y trap latino. Mezcla regional mexicano con hip-hop, creando un sonido contemporaneo.");
                break;
            case 6:
                System.out.println("Cantante y compositor español, conocido por fusionar flamenco, pop y rock. Exitos como Corazon Partio y Amiga Mia.");
                break;
            default:
                System.out.println("ERROR.");
                break;
        }
        scanner.close();
    }
}
