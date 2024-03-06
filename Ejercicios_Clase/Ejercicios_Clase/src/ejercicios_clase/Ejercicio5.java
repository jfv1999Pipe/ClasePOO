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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int tabla = 10;
     int cont=1;  
     int Mul=0;
       Scanner leer= new Scanner(System.in);//constructor de Scanner
System.out.println("escribe el numeron                                                                                                                                                                                       ");
tabla =leer.nextInt();
        while(cont<=10){
        // Mul=(tabla*cont);// hace la multiplicacion y la va guardando 
        System.out.println(" "+tabla+" * "+cont+" = :"+(tabla*cont));//Escribe ne pnatalla el resultado y sus multiplicandos 
            cont++;
        }
        // TODO code application logic here
    }
    
}
