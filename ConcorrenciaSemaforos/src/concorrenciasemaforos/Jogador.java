/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concorrenciasemaforos;

import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Tiago
 */
public class Jogador extends Thread {
    private Semaphore sala;
    
    public Jogador(String nome, Semaphore s){
        this.setName(nome);
        this.sala = s;
    }
    
    @Override
    public void run() {
        try {
            sala.acquire();
            
            sala.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Jogador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
