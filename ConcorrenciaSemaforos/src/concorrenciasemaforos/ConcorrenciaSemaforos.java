/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concorrenciasemaforos;

import java.util.concurrent.*;
/**
 *
 * @author Tiago
 */
public class ConcorrenciaSemaforos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mesas mesas = new Mesas();   
        Semaphore salaDeJogo = new Semaphore(6, true);
        Juiz juiz = new Juiz(mesas);
        juiz.start();
        
        for(int i=0;i<90;i++){
            Jogador jogadorVerde = new Jogador(0, "Jogador Verde "+i, salaDeJogo, mesas);
            Jogador jogadorAzul = new Jogador(1, "Jogador Azul "+i, salaDeJogo, mesas);
            jogadorVerde.start();
            jogadorAzul.start();
        }      
    }
}
