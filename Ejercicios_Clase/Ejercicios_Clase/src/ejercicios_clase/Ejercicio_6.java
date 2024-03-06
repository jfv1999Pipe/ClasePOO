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
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int tabla = 10;
     int cont=1;  
     
       Scanner leer= new Scanner(System.in);//constructor de Scanner
System.out.println("escribe el numeron                                                                                                                                                                                       ");
tabla =leer.nextInt();
        do{
       cont++;
        System.out.println(" "+tabla+" * "+cont+" = "+(tabla*cont));    
        }while(cont<=10);
        // TODO code application logic here
    }
    
}
