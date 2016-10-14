/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.muntetris.tetriminot;

import java.util.ArrayList;

/**
 * Yksi tetriminoista
 *
 * @author kape
 */
public class SuunnikasVasemmalle extends Tetrimino {

    private ArrayList<Palikka> palikat;
    private int x;
    private int y;
    private Palikka ekapalikka;
    private Palikka tokapalikka;
    private Palikka kolmaspalikka;
    private Palikka neljaspalikka;
    private int kierto;

    public SuunnikasVasemmalle() {
        this.kierto = 0;
        this.palikat = new ArrayList<Palikka>();
        this.ekapalikka = new Palikka(6, 0);
        palikat.add(ekapalikka);
        this.tokapalikka = new Palikka(7, 0);
        palikat.add(tokapalikka);
        this.kolmaspalikka = new Palikka(7, 1);
        palikat.add(kolmaspalikka);
        this.neljaspalikka = new Palikka(8, 1);
        palikat.add(neljaspalikka);
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
