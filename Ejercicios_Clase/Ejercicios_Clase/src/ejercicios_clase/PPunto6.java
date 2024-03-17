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
public class PPunto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Numero1;
        int Numero2;
        int Resultado;
        //Scanner leer = new Scanner(System.in);
        
        Scanner leer= new Scanner(System.in);
        System.out.println("Escriba el primer numero");
        Numero1= leer.nextInt();
        System.out.println("Escriba el Segundo numero");
        Numero2= leer.nextInt();
        if(Numero1==Numero2){
            Resultado=(Numero1*Numero2);
            System.out.println("Los numeros son iguales la multiplicacion es: "+Resultado);
        }else if(Numero1>Numero2){
             Resultado=(Numero1-Numero2);
            System.out.println("El primer numero es el mayor: "+Numero1+" y su resta es:"+Resultado);
        }else if(Numero1<Numero2){
             Resultado=(Numero1+Numero2);
            System.out.println("El primer numero es el menor: "+Numero1+" y su suma es:"+Resultado);
        }
    }
    
}
