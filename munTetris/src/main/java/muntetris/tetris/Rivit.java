/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.tetris;

import muntetris.tetris.tetriminot.Kuvio;
import java.util.ArrayList;
import muntetris.tetris.tetriminot.Palikka;

/**
 *Luokka kokoaa Rivi-oliot matriisiksi.
 * @author kmietola
 */
public class Rivit {

    private ArrayList<Palikka> palikat;
    private boolean voidaanLaskea;
    /**
     * Taulukko luodaan konstruktorissa.
     */

    public Rivit() {
        this.palikat= new ArrayList<Palikka>();
    }
    /**
     * Lisää rivin taulukkoon.
     * @param x lisättävä rivi.
     */

    public void lisaaPalikka(Palikka x) {
        this.palikat.add(x);
    }
    /**
     * palauttaa tietyn rivin taulukosta.
     * @param mones mikä listallaoleva rivi haetaan.
     * @return rivi.
     */

    public Palikka getPalikka(int mones) {
        return this.palikat.get(mones);
    }

    /**
     * Palauttaa listassa olevan rivien määrän.
     * @return listan koon.
     */
    public int PalikoidenMaara() {
        return this.palikat.size();
    }

    /**
     * Poistaa rivin.
     * @param i poistettavan rivin numero.
     */
    public void poistaPalikka(int i) {
        this.palikat.remove(i);
    }
    public int suurinY()
    {
        int suurin=this.palikat.get(0).getY();
        for(int i=1; i<this.palikat.size(); i++)
        {
            if(this.palikat.get(i).getY()>suurin)
            {
                suurin=this.palikat.get(i).getY();
            }
        }
        return suurin;
    }
    public int riviTaysi()
    {
        int palautettava=0;
        int y=this.suurinY();
        int laskuri;
        do
        {
            laskuri=0;
            for(Palikka p:palikat)
            {
                if(p.getY()==y)
                {
                    laskuri++;
                }
            }
            //System.out.println("Rivillä " + y + " on " + laskuri + "palikkaa");
            if(laskuri==10)
            {
                palautettava=y;
                break;
            }
            y--;
            
        }while(laskuri>0);
        
        
        return palautettava;
        
    }
    public void poistaRivi(int y)
    {
        ArrayList<Palikka> poistettavat=new ArrayList<Palikka>();
        for(Palikka p: palikat)
        {
            if(p.getY()==y)
            {
                poistettavat.add(p);
                
            }
        }
        palikat.removeAll(poistettavat);
        for(Palikka p: palikat)
        {
            if(p.getY()<y)
            {
                p.yksiAlaspain();
            }
        }
        
    }
    /**
     * tarkistaa, onko peli lopussa, eli löytyykö kentän ylälaidasta tavaraa.
     * @return true, jos Y:n nollakordinaatissa on jotain.
     */

    public boolean onkoLoppu() {
        for(Palikka p:palikat)
        {
            if(p.getY()==0)
            {
                return true;
            }
        }
        return false;

    }

    
    

}
