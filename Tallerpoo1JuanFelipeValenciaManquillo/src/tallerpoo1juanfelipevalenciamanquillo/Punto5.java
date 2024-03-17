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
public class Punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // Pedir al usuario que ingrese su edad y sus ingresos mensuales
        try (// Crear un objeto Scanner para la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Pedir al usuario que ingrese su edad y sus ingresos mensuales
            System.out.print("Ingrese su edad: ");
            int varedad = scanner.nextInt();
            System.out.print("digite sus ingresos mensuales: ");
            double varingresosMensuales = scanner.nextDouble();
            // Verificar si el usuario cumple con los requisitos para tributar
            if (varedad > 16 && varingresosMensuales >= 1000) {
                System.out.println("Debe tributar.");
            } else {
                System.out.println("No debe tributar.");
            }
            // Cerrar el Scanner

    }
    
}
}