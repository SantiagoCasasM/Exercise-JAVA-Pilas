/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapilas;
import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class JcPila {
    
    Scanner teclado = new Scanner(System.in);
    int pilaNumerica[]=new int[5];
    int tope=-1;
    //Método para ingresar elementos a la pila:
    
    public void push() // tope = 0
    {
        if (tope>=pilaNumerica.length-1)
        {
            System.out.println("La pila está llena");
        }
        else
        {
            tope+=1; // tope = 1
            System.out.println("Ingrese el dato: ");
            pilaNumerica[tope]=teclado.nextInt();
        }
    }
    public void pop()
    {
        if (tope==-1)
        {
            System.out.println("La pila está vacia.");
        }
        else
        {
            System.out.println("Se ha eliminado un elemento de la pila");
            pilaNumerica[tope]=0;
        }
    }
    public void mostrarPila()
    {
        for (int tope = 4; tope >= 0; tope--)
        {
            System.out.println("Los datos de la pila son: "+pilaNumerica[tope]);
        }
    }
}
