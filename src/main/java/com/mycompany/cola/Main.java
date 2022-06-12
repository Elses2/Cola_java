/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cola;

/**
 *
 * @author elses
 */
 import java.util.*;
import java.util.ArrayList;
public class Main {



    public static void main(String[] args) {
        
        /////Tabla donde se almacenara todo los registros
        ArrayList<Perro> registro=new ArrayList<>();
        /////
        Scanner input=new Scanner(System.in);
        int n=2;
        int boton;
        System.out.println("##############################################################");
        System.out.println("Bienvenido al progra para registrar Perros");
        System.out.println("##############################################################");
        
        while(n==2){
            intro();
            boton=input.nextInt();
            input.nextLine();
            switch(boton){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.err.println("Gracias por usarnos");
                    n=3;
                         
                    break;
                default: 
                    System.out.println("opcion incorrecta");
            }
        
        
        }
        
       
    }
    public static void intro(){

        System.out.println("##############################################################");
        System.out.println("1:Ingresar");
        System.out.println("2:Modificar");
        System.out.println("3:Eliminar");
        System.out.println("4:Mostrar");
        System.out.println("5:Cerrar");
        System.out.println("##############################################################");
}
    }

