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
public class Punto3 {

    public static void main(String[] args) {

                // Pedir al usuario que ingrese un número entre 0 y 9999
        try ( // Crear un objeto Scanner para la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Pedir al usuario que ingrese un número entre 0 y 9999
            System.out.print("Ingrese un número entre 0 y 9999: ");
            int varnum = scanner.nextInt();
            // Verificar si el número está en el rango especificado
            if (varnum >= 0 && varnum <= 9999) {
                // Contar la cantidad de dígitos del número
                int varcont = 0;
                int vartemp = varnum;
                while (vartemp != 0) {
                    vartemp /= 10;
                    varcont++;
                }
                System.out.println("El número ingresado tiene " + varcont + " cifras.");
            } else {
                System.out.println("El número ingresado no está en el rango especificado.");
            }
            
        }

    }
    
}
