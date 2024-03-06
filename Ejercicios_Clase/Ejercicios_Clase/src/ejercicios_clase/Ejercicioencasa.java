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
public class Ejercicioencasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int varNum; //variable numero entero a
        int varIter;//variable enterea que sirvira para verificar si es par
        int varMul=0;//variable de que hace y suma los pares
        int varContador=0;
        Scanner leer= new Scanner(System.in);//constructor de Scanner
        
        System.out.println("Digite los numero que se desea saber cuanto pares tiene y el resultado de la suma de los pares");// Se pied el numero de para miltiplicar
        varNum=leer.nextInt();// captura el numero 
        for(varIter=0;varIter<=varNum;varIter++){// itera y va aumentando 
         if(varIter%2==0){// verifica si el numero es impar
         }else{// si es par entra aqui
            varContador=varIter++;// aumenta el contador en 1
            varMul+=varIter; // va sumando el el par 
        System.out.println("el "+varNum+" tiene el numero par "+ varIter+ " en contador "+varContador+" y la suma de los pares es "+varMul);//Escribe en pantalla el resultado 
         // 
         }
         }
    }
    
}
