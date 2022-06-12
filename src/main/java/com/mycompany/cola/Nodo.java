/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cola;

/**
 *
 * @author elses
 */
public class Nodo {
    
    private Object info;///Los datos que va a almacenar el nodo
 //al ser tipo object puede almacenar cualquier tipo de objeto
    
    private Nodo siguiente;///Creamos una variaable del mismo tipo de la clase que la contiene

    public Nodo(Object info, Nodo siguiente){
        setInfo(info);
        setSiguiente(siguiente);
    }
    public Nodo(Object info){
        setInfo(info);
        setSiguiente(null);
    }
    public Nodo(){
    setInfo(null);
    setSiguiente(null);
    }

    public void setInfo(Object info) {
        this.info = info;
    }

 
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    } 
    
}
