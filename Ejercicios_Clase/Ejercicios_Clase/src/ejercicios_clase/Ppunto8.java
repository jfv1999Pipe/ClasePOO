/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_clase;

import java.util.Scanner;


public class Ppunto8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numF;
       try ( // TODO code application logic here
         Scanner sc = new Scanner(System.in)) {
          System.out.print("Introduzca numero de filas: ");
           numF = sc.nextInt();
       }
        System.out.println();
        for(int al = 1; al<=numF; al++){
            //Espacios en blanco
            for(int bl = 1; bl<=numF-al; bl++){
                System.out.print(" ");
            }
            //Asteriscos
            for(int as=1; as<=(al*2)-1; as++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


