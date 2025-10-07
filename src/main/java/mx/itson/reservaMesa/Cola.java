package mx.itson.reservaMesa;


import mx.itson.reservaMesa.Nodo;
import mx.itson.reservaMesa.Turno;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 3430
 */
public class Cola {
    
    /*
    First element on the queue
    */
    public Nodo inicio;
    /*
    Last element on the queue
    */
    public Nodo fin;
    
    /*
    Empty constructor
    */
    public Cola() {
        this.inicio = null;
        this.fin = null;
    }
    
    /*
    The queue is empty return true or false
    */
    public boolean isEmpty () {
        return this.inicio == null;
    }
    
     /*
    Show the real structure of the current queue
    */
    public void displayQueue() {
        
        int amountElements = size();
        
        for(int i = 0; i < amountElements; i++){
            System.out.print("-------");
        }
        System.out.println();
        
        Nodo aux = this.inicio;
        while(aux != null){
            System.out.print("   "+ aux.valor.getNumero()+"-"+aux.valor.getCliente()  +"   ");
            aux = aux.siguiente;
        }
        System.out.println();
        
        for(int i = 0; i < amountElements; i++){
            System.out.print("-------");
        }
        
        System.out.println();
        
    }
    
    public void enqueue(Turno val) {
        if(isEmpty()){
            inicio = new Nodo(val);
            fin = inicio;
        }else{
            fin.siguiente = new Nodo(val);
            fin = fin.siguiente;
        }
    }
    
    public Turno dequeue() {
        Turno eliminado = inicio.valor; //inicio.valor.getNumero() + " - " + inicio.valor.getCliente();
        
        int contador = size();
        if(contador == 1){
            inicio = null;
            fin = inicio;
        }else{
            inicio = inicio.siguiente; //inicio.siguiente Accedemos al siguiente del nodo del cual apunta inicio.
        }
        
        return eliminado;
    }
    
    public Turno front() {
        if(inicio != null) {
            return inicio.valor;
        }else{
            return null;
        }
    }
    
    /*
    Return how many elements are on the queue
    */
    public int size() {
        Nodo aux = this.inicio;
        int contador = 0;
        while(aux != null){
            contador++;
            aux = aux.siguiente;
        }
        return contador;
    }
    
    
    
}
