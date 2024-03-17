/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo1juanfelipevalenciamanquillo;

import java.util.Scanner;


public class Punto7 {


    public static void main(String[] args) {
         try (// Crear un objeto Scanner para la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Pedir al usuario la cantidad de números a introducir
            System.out.print("Ingrese la cantidad de números a introducir: ");
            int varcantNum = scanner.nextInt();
            // Variables para contar los números mayores que 0, menores que 0 e iguales a 0
            int varmayorQCero = 0;
            int varmenorQCero = 0;
            int varigualACero = 0;
            // Pedir al usuario que introduzca los números y contarlos según su valor
            for (int i = 0; i < varcantNum; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                int varnum = scanner.nextInt();
                
                if (varnum > 0) {
                    varmayorQCero++;
                } else if (varnum < 0) {
                    varmenorQCero++;
                } else {
                    varigualACero++;
                }
            }   // Mostrar el resultado
            System.out.println("Cantidad de números mayores que 0: " + varmayorQCero);
            System.out.println("Cantidad de números menores que 0: " + varmenorQCero);
            System.out.println("Cantidad de números iguales a 0: " + varigualACero);
            // Cerrar el Scanner
        }

    }
    
}
