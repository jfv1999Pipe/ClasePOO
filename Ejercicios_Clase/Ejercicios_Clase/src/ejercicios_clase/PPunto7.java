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
public class PPunto7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               // TODO code application logic here
        int a;
         int b;
          int c;
        //Scanner leer = new Scanner(System.in);
        
        Scanner leer= new Scanner(System.in);
        System.out.println("Escriba el primer numero");
        a= leer.nextInt();
        System.out.println("Escriba el Segundo numero");
        b= leer.nextInt();
        System.out.println("Escriba el tercero numero");
        c= leer.nextInt();
        if(a>b&&b>c){
           
            System.out.println("El Primer numero es el mayor:"+a);
        }else if(b>a&&b>a){
             
            System.out.println("El Segundo numero es el mayor:"+b);
        }else if(c>b&&c>a){
             
            System.out.println("El Tercero numero es el mayor:"+c);
            
        }
    }
    }
    

