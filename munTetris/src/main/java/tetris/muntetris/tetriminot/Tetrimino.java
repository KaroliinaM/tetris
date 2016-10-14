/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.muntetris.tetriminot;

import java.util.ArrayList;

/**
 *Ei toimi niin kuin pitäisi tällä hetkellä, annan sen kuitenkin olla tämn päivän, jotta on jotain esiteltävää koodikatselmoinnissa.
 *Hion loppuun sit viikonloppuna :) 
 * 
 * @author Karoliina
 */
public abstract class Tetrimino {
    private ArrayList<Palikka> palikat;
    public Tetrimino()
    {
        this.palikat=new ArrayList<Palikka>();
    }
    
       /*
    Palauttaa tietyn palikan 
     */
    public Palikka getPalikka(int x) {
        Palikka palautettava = this.palikat.get(x);

        return palautettava;
    }
    /*
    Palauttaa tetriminon palikat
     */
    public ArrayList palautaKuvio() {
        return this.palikat;
    }
   public void kierra() {

    }

    
}
