/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.reservaMesa;

/**
 *
 * @author 3430
 */
public class Nodo {
    
    public Turno valor;
    public Nodo siguiente;

    public Nodo(Turno valor, Nodo siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }

    public Nodo(Turno valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    /**
     * @return the valor
     */
    public Turno getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Turno valor) {
        this.valor = valor;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
