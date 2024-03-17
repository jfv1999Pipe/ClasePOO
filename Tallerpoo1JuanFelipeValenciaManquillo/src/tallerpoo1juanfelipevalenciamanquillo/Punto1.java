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
public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int varPeso;
        float varAltura;
       double varImc; 
        System.out.println("Programa para calcular IMC");
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba su altura");
        varAltura= leer.nextFloat();
        System.out.println("escriba su Peso");
        varPeso = leer.nextInt();
        
        varImc=varPeso/(varAltura*varAltura);
if(varImc<=16){
    System.out.println("Tu IMC es: "+varImc+" y tienes Delgadez Severa");             
        }else if(varImc>16.00||varImc<=17.00){
        System.out.println("Tu IMC es: "+varImc+" y tienes Delgadez Moderada");    
        }else if(varImc>17.00||varImc<=18.50){
        System.out.println("Tu IMC es: "+varImc+" y tienes Delgadez Leve");    
        }else if(varImc>18.50||varImc<=25.00){
        System.out.println("Tu IMC es: "+varImc+" y tienes Peso Normal");    
        }else if(varImc>25.00||varImc<=30.00){
        System.out.println("Tu IMC es: "+varImc+" y tienes SobrePeso");    
        }else if(varImc>30.00||varImc<=35.00){
        System.out.println("Tu IMC es: "+varImc+" y tienes Obesidad Leve");    
        } else if(varImc>35.00||varImc<=40.00){
        System.out.println("Tu IMC es: "+varImc+" y tienes Obesidad Moderado");   
        }else if(varImc>40){
        System.out.println("Tu IMC es: "+varImc+" y tienes Obesidad Morbida");    
        } 
        
        
        
        
    }
    
}
