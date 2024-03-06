/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_clase;

import java.util.Scanner;

/**
 *
 * @author JuanFe
 */
public class EjercicioClaseRepositorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresare nombre");
        Scanner teclado = new Scanner(System.in);
        String nombre= teclado.nextLine();
       System.out.println("Su nombre es: "+ nombre);
        // TODO code application logic here
    }
    
}
