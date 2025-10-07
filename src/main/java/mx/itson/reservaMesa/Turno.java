/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.reservaMesa;

/**
 *
 * @author 3430
 */
public class Turno {
    private String numero;  // Hora de reservación o número de turno
    private String cliente;
    private String personas;
    
    // Constructor principal (único, con los tres campos)
    public Turno(String numero, String cliente, String personas) {
        this.numero = numero;
        this.cliente = cliente;
        this.personas = personas;
    }
    
    // Constructor sobrecargado: Sin personas (por defecto vacío)
    public Turno(String numero, String cliente) {
        this(numero, cliente, "");  // Llama al principal con personas vacía
    }
    
    // Getters y Setters
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getCliente() {
        return cliente;
    }
    
}