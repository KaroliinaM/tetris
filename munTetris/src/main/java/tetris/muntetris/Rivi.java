/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.muntetris;

import java.util.ArrayList;

/**
 *
 * @author kmietola
 */
public class Rivi {

    private ArrayList<Boolean> rivi;

    public Rivi() {
        this.rivi = new ArrayList<Boolean>();
        for (int i = 0; i < 12; i++) {
            this.rivi.add(false);
        }
        System.out.println(this.rivi.size());
        for(boolean i:rivi)
        {
            System.out.println(i);
        }
        
    }

    public void asetaPalikka(int x) {
        this.rivi.set(x, Boolean.TRUE);
    }

    public ArrayList annaRivi() {
        return this.rivi;
    }
    
    public int annaRivinkoko()
    {
        return 12;
    }
    public boolean annaPalikka(int x)
    {
        return this.rivi.get(x);
    }

    
    public boolean onkoTaynna()
    {
        boolean palautettava=true;
        for(Boolean b:rivi)
        {
            if(b==false)
            {
               palautettava=false; 
            }
        }
        return palautettava;
    }
    
    

}
