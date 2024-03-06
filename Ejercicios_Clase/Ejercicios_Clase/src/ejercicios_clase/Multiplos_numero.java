/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_clase;

import java.util.Scanner;//

/**
 *
 * @author JuanFe
 */
public class Multiplos_numero {

    public static void main(String[] args) {
        int varNum; //variable numero entero a multiplicar
        int varIter;//variable enterea que sirvira para multiplicar
        int varMul;//variable de que hace y guarda la multiplicacion
        Scanner leer= new Scanner(System.in);//constructor de Scanner
        
        System.out.println("Digite el numero a saber sus multiplos");// Se pied el numero de para miltiplicar
        varNum=leer.nextInt();// captura el numero a multiplicar
        for(varIter=1;varIter<=10;varIter++){// itera y va aumentando el multiplicador
        varMul=(varNum*varIter);// hace la multiplicacion y la va guardando 
        System.out.println("El multipilo de "+varNum+" por"+varIter+" es :"+varMul);//Escribe ne pnatalla el resultado y sus multiplicandos 
        }
        // TODO code application logic here
        
    }
    
}
