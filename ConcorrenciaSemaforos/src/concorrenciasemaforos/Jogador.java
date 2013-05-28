/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concorrenciasemaforos;

import java.util.Random;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Tiago
 */
public class Jogador extends Thread {
    private int time;
    private Semaphore sala;
    private Mesas mesas;
    private int mesa;
    
    public Jogador(int time, String nome, Semaphore s, Mesas mesas){
        this.time = time;
        this.setName(nome);
        this.sala = s;
        this.mesas = mesas;
    }
    
    @Override
    public void run() {
        try {
            sala.acquire();
            mesas.getMesa(mesa).set(time,this.getEscolha());
            this.wait();
            sala.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Jogador.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
    
    public int getEscolha(){
        Random random = new Random();
        int num = random.nextInt(3);
        return num;
    }
}
