/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salmans;

import java.util.ArrayList;
import javax.swing.JProgressBar;

/**
 *
 * @author Ricardo
 */
public class Cocinero extends Thread{
    private ArrayList<Orden> ordenes = new ArrayList();
    private ArrayList<ArrayList<Orden>> ordenesCamion;
    private JProgressBar bar;
    boolean finishedOrder;
    final boolean active = true;

    public Cocinero(JProgressBar bar, ArrayList<Orden> ordenes, ArrayList<ArrayList<Orden>>ordenesCamion) {
        this.bar = bar;
        this.ordenes = ordenes;
        this.ordenesCamion = ordenesCamion;
    }

    public Cocinero(JProgressBar bar, ArrayList<ArrayList<Orden>> ordenesCamion) {
        this.ordenesCamion = ordenesCamion;
        this.bar = bar;
    }
    
    
    
    public ArrayList<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Orden> ordenes) {
        this.ordenes = ordenes;
    }

    public JProgressBar getBar() {
        return bar;
    }

    public void setBar(JProgressBar bar) {
        this.bar = bar;
    }

    public boolean isActive() {
        return finishedOrder;
    }

    public void setActive(boolean active) {
        this.finishedOrder = active;
    }

    public ArrayList<ArrayList<Orden>> getOrdenesCamion() {
        return ordenesCamion;
    }

    public void setOrdenesCamion(ArrayList<ArrayList<Orden>> ordenesCamion) {
        this.ordenesCamion = ordenesCamion;
    }

    public boolean isFinishedOrder() {
        return finishedOrder;
    }

    public void setFinishedOrder(boolean finishedOrder) {
        this.finishedOrder = finishedOrder;
    }
    
    @Override
    public void run() {
        boolean tieneOrdenes;
        int tiempo;
        int sleepTime;
        
        while(active){
            if(!this.getOrdenes().isEmpty()){
                tieneOrdenes = true;
            }else{
                tieneOrdenes = false;
            }
            try {
                Orden temp = this.ordenes.get(0);
                tiempo = temp.getTiempoTotal();
                finishedOrder = false;
                this.bar.setValue(0);
                sleepTime = tiempo*10/100;
                sleepTime*=100;
                while(!finishedOrder){
                    if(bar.getValue()!=100){
                        bar.setValue(bar.getValue()+1);
                        try {
                            Thread.sleep(sleepTime);
                        } catch (Exception e) {
                        }
                    }else{
                        finishedOrder=true;
                        break;
                    }
                }
                this.ordenes.remove(0);
                int menor=Integer.MAX_VALUE;
                
                int index=0;
                for (int i = 0; i < this.ordenesCamion.size(); i++) {
                    if(menor>ordenesCamion.get(i).size() && ordenesCamion.get(i).size()!=10){
                        menor = ordenesCamion.get(i).size();
                        index = i;    
                    }
                }
                ordenesCamion.get(index).add(temp);
                this.bar.setValue(0);
                
            } catch (Exception e) {
            }
                
            
        }        
    }
    
    
    
    
}
