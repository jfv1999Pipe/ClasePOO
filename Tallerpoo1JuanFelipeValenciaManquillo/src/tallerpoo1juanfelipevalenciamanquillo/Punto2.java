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
public class Punto2 {


    public static void main(String[] args) {

   // Contraseña almacenada
        String contra1;
        contra1 = "CONTRASEÑA1";

        // Pedir al usuario que ingrese la contraseña
        try ( // Crear un objeto Scanner para la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Pedir al usuario que ingrese la contraseña
            System.out.print("Ingrese la contraseña: ");
            String contraseñaIn = scanner.nextLine();
            // Comparar las contraseñas sin importar mayúsculas y minúsculas
            if (contraseñaIn.equalsIgnoreCase(contra1)) {
                System.out.println("La contraseña es la misma");
            } else {
                System.out.println("La contraseña no concide");
            }
            // Cerrar el Scanner
            }


    }
    
}
