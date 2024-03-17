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
public class Punto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try (// Crear un objeto Scanner para la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Pedir al usuario que elija el tipo de pizza
            System.out.println("La pizzería Bella Napoli ofrece Pizza vegetariana o no vegetariana");
            System.out.println("¿Qué tipo de pizza desea?");
            System.out.println("1. Pizza vegetariana");
            System.out.println("2. Pizza no vegetariana");
            System.out.print("Ingrese su elección (1 o 2): ");
            int varopcion = scanner.nextInt();
            // Verificar la elección del usuario y mostrar los ingredientes disponibles
            switch (varopcion) {
                case 1:
                    System.out.println("Ingredientes disponibles para la pizza vegetariana:");
                    System.out.println("1. Pimiento");
                    System.out.println("2. Tofu");
                    break;
                case 2:
                    System.out.println("Ingredientes disponibles para la pizza no vegetariana:");
                    System.out.println("1. Peperoni");
                    System.out.println("2. Jamón");
                    System.out.println("3. Salmón");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    // Salir del programa si la opción no es válida
                    System.exit(0); // Pedir al usuario que elija un ingrediente
            }
            System.out.print("Ingrese el número del ingrediente que desea agregar a su pizza: ");
            int varingelegido = scanner.nextInt();
            // Mostrar los ingredientes de la pizza elegida
            System.out.println("\nSu pizza es:");
            if (varopcion == 1) {
                System.out.println("Pizza vegetariana");
                switch (varingelegido ) {
                    case 1:
                        System.out.println("Ingredientes: Mozzarella, Tomate, Pimiento");
                        break;
                    case 2:
                        System.out.println("Ingredientes: Mozzarella, Tomate, Tofu");
                        break;
                    default:
                        System.out.println("Ingrediente no válido.");
                }
            } else if (varopcion == 2) {
                System.out.println("Pizza no vegetariana");
                switch (varingelegido ) {
                    case 1:
                        System.out.println("Ingredientes: Mozzarella, Tomate, Peperoni");
                        break;
                    case 2:
                        System.out.println("Ingredientes: Mozzarella, Tomate, Jamón");
                        break;
                    case 3:
                        System.out.println("Ingredientes: Mozzarella, Tomate, Salmón");
                        break;
                    default:
                        System.out.println("Ingrediente no válido.");
                }
            }
            // Cerrar el Scanner
        }
    }

    }

    
    

