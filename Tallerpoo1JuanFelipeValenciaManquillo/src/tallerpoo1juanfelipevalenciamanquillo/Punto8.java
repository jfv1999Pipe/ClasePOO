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
public class Punto8 {

    public static void main(String[] args) {
        try ( // Crear un objeto Scanner para la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Bucle para pedir caracteres al usuario hasta que se introduzca un espacio
            while (true) {
                System.out.print("Ingrese un caracter (o un . para salir): ");
                char varcaracter = scanner.next().charAt(0); // Leer el primer carácter de la entrada
                
                // Verificar si el carácter es un espacio
                if (varcaracter == '.') {
                    System.out.println("¡Espacio ingresado! Saliendo del programa.");
                    break; // Salir del bucle si se introduce un espacio
                }
                
                // Verificar si el carácter es una vocal
                if (esVocal(varcaracter)) {
                    System.out.println("VOCAL");
                } else {
                    System.out.println("NO VOCAL");
                }
            }
            // Cerrar el Scanner
        }
    }

    // Método para verificar si un carácter es una vocal
    public static boolean esVocal(char letra) {
        letra = Character.toUpperCase(letra); // Convertir el carácter a mayúscula para simplificar la comparación
        return letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U';
    }
}


    
    

