/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.tetris.tetriminot;

import java.util.ArrayList;

/**
 * Yksi tetriminoista.
 *
 * @author Karoliina
 */
public class Nelio extends Tetrimino {

    private ArrayList<Palikka> palikat;
    private int x;
    private int y;
    private Palikka ekapalikka;
    private Palikka tokapalikka;
    private Palikka kolmaspalikka;
    private Palikka neljaspalikka;
    /**
     * Kuvio luodaan arraylistina konstruktorissa.
     */

    public Nelio() {
        this.palikat = new ArrayList<Palikka>();
        this.ekapalikka = new Palikka(6, 0);
        palikat.add(ekapalikka);
        this.tokapalikka = new Palikka(7, 0);
        palikat.add(tokapalikka);
        this.kolmaspalikka = new Palikka(6, 1);
        palikat.add(kolmaspalikka);
        this.neljaspalikka = new Palikka(7, 1);
        palikat.add(neljaspalikka);

    }
    /**
     * Palauttaa tietyn palikan kuviosta.
     * @param x palikan numero.
     * @return palikka.
     */
     

    public Palikka getPalikka(int x) {
        Palikka palautettava = this.palikat.get(x);

        return palautettava;
    }
    /**
     * Palauttaa koko listan.
     * @return lista palikoista.
     */

    public ArrayList palautaKuvio() {
        return this.palikat;
    }
    /**
     * kiertää kuvion.
     */

    public void kierra() {

    }

}
