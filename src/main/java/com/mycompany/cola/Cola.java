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
	
	public Cola() //Constructor sin parametros de la clase Cola
	{ 
		this.primero=null;
		this.ultimo =null;
	}

	public void Insertar (Object info) //coloca al final
	{
		Nodo nuevo = new Nodo(info);
		if (this.primero==null)
		{
			this.primero=nuevo;
			this.ultimo=nuevo;
		}
		else
		{
			this.ultimo.setSiguiente(nuevo);
			this.ultimo=nuevo;
		}
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
