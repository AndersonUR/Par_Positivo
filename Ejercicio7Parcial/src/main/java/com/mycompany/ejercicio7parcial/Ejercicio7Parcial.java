package com.mycompany.ejercicio7parcial;

/**
 *
 * @author Josué
 */

import java.util.Scanner;
public class Ejercicio7Parcial {
     public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
       
        int numero; //declarando variable
       
        System.out.print("Por favor ingrese un número: "); //mensaje en pantalla pidiendo un numero
        numero = teclado.nextInt(); //asignando el valor del numero ingresado a nuesta variable
        //Se hace la comprobación de que el numero ingresado sea dividible en 2 con residuo 0 y que a la vez sea mayor a 0
        if(numero % 2 == 0 && numero>0) { 
            System.out.println(numero+" El número ingresado es par positivo");//si se cumple la condicion es un numero par y positivo
        }else {
        //si no se cumple la condicion automaticamente da a entender que el numero ingresado es negativo o no es numero par
            System.out.println(numero+" El numero ingresado no es positivo o no es par");
        }
     }
}