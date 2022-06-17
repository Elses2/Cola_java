/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cola;

/**
 *
 * @author elses
 */
public class Cola {
    private Nodo primero;
    private Nodo  ultimo;
    private int tam;  
	
	public Cola() //Constructor sin parametros de la clase Cola
	{ 
		this.primero=null;
		this.ultimo =null;
	}
        public boolean isEmty(){
        
            if(primero==null && ultimo==null){
                return true;
            }
            else{
                return false;
            }
        }
        public void insert(Object dato){
            Nodo nuevo= new Nodo(dato);
            if(isEmty()){
                nuevo=primero=ultimo;
            }
            else{
            
                ultimo.setSiguiente(nuevo);
            }
            ultimo=nuevo;
            tam ++;
            
        }
        public String eliminate(){
            
            if(primero==null){
                return "vacio";
            }
                
               
            return "";
        }

	
	
	public boolean colaVacia() //Devuelve true si la cola esta vacia y false en caso contrario
	{
		return (this.primero == null);
	}
	
	public Object primero() //Devuelve el dato correspondiente al primer elemento de la cola, y si este no existe, devuelve null
	{
		if (this.primero!=null) return this.primero.getInfo();
		else return null;
	}
	
	public Object  Eliminar() //elimina el elemento mas antiguo y lo devuelve
	{ 
		if (this.primero == null)   return null;
		if (this.primero == this.ultimo)  this.ultimo=null;

		Object aux = this.primero.getInfo();
		this.primero = this.primero.getSiguiente();
		return aux;
	}
        ///retorna el numero de elementos que tiene la cola
        public int tamano(){
        int tam=0;
        return tam;
        }
        ///Muestra los elementos de la lista
        public void Mostrar(){
                Nodo recorrido=primero;
            for(int i=0;i<tamano();i++){
                    
                
            
            }
            
        
        }
}
