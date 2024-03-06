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
public class Ejercicio_7_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // ATRIBUTOS
          Scanner leer= new Scanner(System.in);
          int varOpcion,numero1, numero2,resultado;
          boolean bolsalir= false;
         do {
        // MENU       
        System.out.println("********** MENU ********");
        System.out.println("1. SUMAR ");
        System.out.println("2. RESTAR ");
        System.out.println("3. MULTIPLICAR ");
        System.out.println("4. DIVIDIR");
        System.out.println("5 SALIR");
       // LEE OPCION
       do{
        System.out.println("digite el # de su opcion");
       varOpcion= leer.nextInt();
       }while(varOpcion<0);
              switch (varOpcion) {
                  case 1:
                      System.out.println("Digite el  1er numero ");
                      numero1=leer.nextInt();
                      System.out.println("Digite el  2do numero ");
                      numero2=leer.nextInt();
                      resultado=numero1+numero2;
                      System.out.println("el resultado es:"+resultado);
                      break;
                  case 2:
                      System.out.println("Digite el  1er numero ");
                      numero1=leer.nextInt();
                      System.out.println("Digite el  2do numero ");
                      numero2=leer.nextInt();
                      resultado=numero1-numero2;
                      System.out.println("el resultado es:"+resultado);
                      break;
                  case 3:
                      System.out.println("Digite el  1er numero ");
                      numero1=leer.nextInt();
                      System.out.println("Digite el  2do numero  ");
                      numero2=leer.nextInt();
                       resultado=numero1*numero2;
                       System.out.println("el resultado es:"+resultado);
                      break;
                  case 4:
                      System.out.println("Digite el  1er numero  ");
                      numero1=leer.nextInt();
                      System.out.println("Digite el  2do numero ");
                      numero2=leer.nextInt();
                       resultado=numero1/numero2;
                       System.out.println("el resultado es:"+resultado);
                      break;
                  case 5:
                       System.out.println("gracias");
                      bolsalir=false;
                  default:
                     
                      break;
              }
               
       
    }while(bolsalir=true);
    }
}

