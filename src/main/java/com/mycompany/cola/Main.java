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
public class Main {



    public static void main(String[] args) {
        
        /////Tabla donde se almacenara todo los registros
        Cola colita=new Cola();
        String nombre, color, raza;
        int edad;
        /////
        Scanner input=new Scanner(System.in);
        int n=2;
        int boton;
        System.out.println("##############################################################");
        System.out.println("Bienvenido, aqui puedes ingresar y vender perros");
        
        while(n==2){
            intro();
            boton=input.nextInt();
            input.nextLine();
            switch(boton){
                case 1:
                System.out.println("Dame raza");
                raza=input.nextLine();
                System.out.println("color");
                color=input.nextLine();
                System.out.println("nombre");
                nombre=input.nextLine();
                System.out.println("edad");
                edad=input.nextInt();
                input.nextLine();
                colita.insert(new Perro(color,raza,edad,nombre));
                
                
                
                
                    
                    break;
                case 2:
                    System.out.println(colita.eliminate());
                    break;
                case 3:
                    colita.mostrar();
                    break;
                case 4:
                      System.out.println("Gracias por usarnos");
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
        System.out.println("2:Eliminar");
        System.out.println("3:Mostrar");
        System.out.println("4:Cerrar");
        System.out.println("##############################################################");
}
    }

