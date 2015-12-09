/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salmans;

import javax.swing.JProgressBar;

/**
 *
 * @author Ricardo
 */
public class Hilo extends Thread {
    JProgressBar bar = new JProgressBar();

    public Hilo(JProgressBar bar) {
        this.bar = bar;
    }

    public JProgressBar getBar() {
        return bar;
    }

    public void setBar(JProgressBar bar) {
        this.bar = bar;
    }
    
    @Override
    public void run() {
        bar.setValue(0);
        while(true){
            bar.setValue(bar.getValue()+1);
            try {
                Thread.sleep(1000L);
            } catch (Exception e) {
            }
            
        }
    }
    
    
}
