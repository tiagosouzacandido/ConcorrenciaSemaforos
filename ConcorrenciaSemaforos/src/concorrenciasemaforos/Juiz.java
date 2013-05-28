/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concorrenciasemaforos;

/**
 *
 * @author Tiago
 */
public class Juiz extends Thread {
    
    private Mesas mesas;
    
    public Juiz(Mesas mesas){
        this.mesas = mesas;
    }
    
    @Override
    public void run() {
        for (int i=0;i<3;i++){       
            
        }
    }
    
}
