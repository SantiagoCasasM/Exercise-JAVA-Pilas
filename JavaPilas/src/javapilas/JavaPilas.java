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
public class JavaPilas {

    
    public static void main(String[] args)
    {
        JcPila obj=new JcPila();
        Scanner op=new Scanner(System.in);
        int opcion;
        do {            
            
            System.out.println("Menú de la pila");
            System.out.println("1 - Ingresar elementos (Push)");
            System.out.println("2 - Eliminar elementos (pop)");
            System.out.println("3 - Mostrar la pila completa: ");
            System.out.println("4 - Salir");
            System.out.println("Ingrese una opción: ");
            opcion=op.nextInt();
            switch(opcion)
            {
                case 1: 
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.mostrarPila();
                case 4:
                    break;
                default:
                    System.out.println("\nIngrese una opción válida.");
            }
            
        } while (opcion!=4);
        
    }
    
}
