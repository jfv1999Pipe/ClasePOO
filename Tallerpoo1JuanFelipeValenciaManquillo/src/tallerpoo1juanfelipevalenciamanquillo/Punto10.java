/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo1juanfelipevalenciamanquillo;

import java.util.Scanner;

/**
 *
 * @author JuanFe
 */
public class Punto10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables para almacenar la suma total y el número actual
        try ( Scanner scanner = new Scanner(System.in)) {
            // Variables para almacenar la suma total y el número actual
            int varsumaT = 0;
            int varnumero;
            // Pide al usuario que ingrese 15 números y sumarlos
            for (int i = 0; i < 15; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                varnumero = scanner.nextInt();
                varsumaT += varnumero;
            }   // Mostrar la suma total
            System.out.println("La suma total de los 15 números es: " + varsumaT);
            // Cerrar el Scanner
        }
    }
}

 
    

