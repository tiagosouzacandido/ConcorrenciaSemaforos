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
        Juiz juiz = new Juiz();
        juiz.start();
        
        for(int i=0;i<90;i++){
            Jogador jogadorVerde = new Jogador("Jogador Verde "+i,salaDeJogo);
            Jogador jogadorAzul = new Jogador("Jogador Azul "+i,salaDeJogo);
            jogadorVerde.start();
            jogadorAzul.start();
        }      
    }
}
