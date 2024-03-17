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
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir al usuario que ingrese el día, mes y año
        try ( // Crear un objeto Scanner para la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Pedir al usuario que ingrese el día, mes y año
            System.out.print("Ingrese el día: ");
            int vardia = scanner.nextInt();
            System.out.print("Ingrese el mes: ");
            int varmes = scanner.nextInt();
            System.out.print("Ingrese el año: ");
            int varaño = scanner.nextInt();
            // Verificar si el año es bisiesto
            boolean varbisiesto = false;
            // Verificar si el mes es febrero y el año es divisible por 4 pero no por 100
            if (varmes == 2 && varaño % 4 == 0 && varaño % 100 != 0) {
                varbisiesto = true;
            }   // Verificar si el día está dentro del rango válido para el mes
            boolean varfechaCorrecta = false;
            // Verificar el rango de días dependiendo del mes
            if ((varmes == 1 || varmes == 3 || varmes == 5 || varmes == 7 || varmes == 8 || varmes == 10 || varmes == 12) && vardia >= 1 && vardia <= 31) {
                varfechaCorrecta = true;
            } else if ((varmes == 4 || varmes == 6 || varmes == 9 || varmes == 11) && vardia >= 1 && vardia <= 30) {
                varfechaCorrecta = true;
            } else if (varmes == 2 && ((varbisiesto && vardia >= 1 && vardia <= 29) || (!varbisiesto && vardia >= 1 && vardia <= 28))) {
                varfechaCorrecta = true;
            }   // Mostrar el resultado
            if (varfechaCorrecta) {
                System.out.println("La fecha ingresada es correcta.");
            } else {
                System.out.println("La fecha ingresada no es válida.");
            }
            // Cerrar el Scanner
        }

    }
    
}
