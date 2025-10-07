/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.reservaMesa;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author 3430
 */
public class turno_Mesa {

//    public static void main(String[] args) {
//        
//        showMenu();
//        
//    }
    
    public static void showMenu(String personas){
        int option = 0;
        Cola queue = new Cola();
        
        do {
            try {
                option = Integer.parseInt( JOptionPane.showInputDialog(null, ""
                                + "1.- Enqueue(element)\n2.- dequeue()\n"
                                + "3.- Is Empty?\n4.- front()\n"
                                + "5.- size()\n"
                                + "6.- displayQueue()\n"
                                + "7.- Exit\n"
                                + "Input one option:\n") );
                switch (option) {
                    case 1 -> {
                        String numero = JOptionPane.showInputDialog(null, "Ingresa el numero:");
                        String nombre = JOptionPane.showInputDialog(null, "Ingresa el numero:");
                        queue.enqueue(new Turno(numero, nombre, personas));
                    }
                    case 2 -> {
                        if(!queue.isEmpty()){
                            String elementRemove = queue.dequeue().getNumero();
                            JOptionPane.showMessageDialog(null, "Element removed from the queue: " + elementRemove);
                        }else{
                            JOptionPane.showMessageDialog(null, "The stack is empty");
                        }
                    }
                    case 3 -> {
                        if(queue.isEmpty()){
                            JOptionPane.showMessageDialog(null, "The queue IS EMPTY");
                        }else{
                            JOptionPane.showMessageDialog(null, "The queue IS NOT EMPTY");
                        }
                    }
                    case 4 -> {
                        if(!queue.isEmpty()){
                            Turno elementFront = queue.front();
                            JOptionPane.showMessageDialog(null, "The front element is: " + elementFront.getNumero()+"-"+elementFront.getCliente());
                        }else{
                            JOptionPane.showMessageDialog(null, "The queue is empty");
                        }
                    }
                    case 5 -> {
                        int total = queue.size();
                        JOptionPane.showMessageDialog(null, "The total items in the queue is: " + total);
                    }
                    case 6 -> {
                        if(queue.isEmpty()){
                            JOptionPane.showMessageDialog(null, "The queue is empty");
                        }else{
                            queue.displayQueue();
                        }
                    }
                    case 7 -> JOptionPane.showMessageDialog(null, "Program finished.");
                }
            }catch(HeadlessException | NumberFormatException e){
                System.out.println("Error. Ingrese un entero: " + e.getMessage());
            }
        }while(option != 7);
        
    }
}
