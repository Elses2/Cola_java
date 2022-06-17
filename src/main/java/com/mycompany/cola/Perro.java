/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cola;

/**
 *
 * @author elses
 */
public class Perro {
    
    private int id;
    private String name;
    private String color;
    private String raza;
    private int edad;
    
    public Perro(String color, String raza,int edad,String name){
    
    this.color=color;
    this.edad=edad;
    this.raza=raza;
    this.name=name;
    
    }
    
    public void ladrar(){
    
    System.out.println("ladra xd");
    
    }
    public void mostrar(){
        System.out.println("ID:"+id);
        System.out.println("NOMBRE:"+name);
        System.out.println("EDAD:"+edad);
        System.out.println("RAZA:"+raza);
        System.out.println("COLOR:"+color);
    }
    
    public String getRaza(){
        return raza;
    }
    public String getColor(){
        return color;
    }
    public int getEdad(){
        return edad;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setRaza(String raza){
        this.raza=raza;
    }
    @Override
    public String toString(){
        return "perro eliminado: "+ name ;
    }
}
