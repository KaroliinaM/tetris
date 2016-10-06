/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.muntetris;

import java.util.ArrayList;

/**
 *
 * @author kape
 */
public class Nelio implements Tetrimino{
    private ArrayList<Palikka> palikat;
        private int x;
    private int y;
    private Palikka ekapalikka;
    private Palikka tokapalikka;
    private Palikka kolmaspalikka;
    private Palikka neljaspalikka;
    
    public Nelio()
    {
        this.palikat=new ArrayList<Palikka>();
        this.ekapalikka = new Palikka(6, 0);
            palikat.add(ekapalikka);
            this.tokapalikka = new Palikka(7, 0);
            palikat.add(tokapalikka);
            this.kolmaspalikka = new Palikka(6, 1);
            palikat.add(kolmaspalikka);
            this.neljaspalikka = new Palikka(7, 1);
            palikat.add(neljaspalikka);
        
    }
    public Palikka getPalikka(int x) {
        Palikka palautettava = this.palikat.get(x);

        return palautettava;
    }
    public ArrayList palautaKuvio()
    {
        return this.palikat;
    }
    public void kierra()
    {
        
    }
    
    
    
}
