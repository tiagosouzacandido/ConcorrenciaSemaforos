/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concorrenciasemaforos;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 *
 * @author Tiago
 */
public class Mesas {
    
    private AtomicIntegerArray[] mesas;

    public Mesas() {
        this.mesas = new AtomicIntegerArray[]{
            new AtomicIntegerArray(2), 
            new AtomicIntegerArray(2), 
            new AtomicIntegerArray(2)
        };
    }
    
    public AtomicIntegerArray getMesa(int num){
        return mesas[num];
    }
}
