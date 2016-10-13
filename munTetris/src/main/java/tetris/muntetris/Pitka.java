/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.muntetris;

import java.util.ArrayList;

/**
 *Yksi tetriminoista
 * @author Karoliina
 */
public class Pitka implements Tetrimino {

    private ArrayList<Palikka> palikat;
    private int x;
    private int y;
    private Palikka ekapalikka;
    private Palikka tokapalikka;
    private Palikka kolmaspalikka;
    private Palikka neljaspalikka;
    private int kierto;

    public Pitka() {
        this.kierto = 0;
        this.palikat = new ArrayList<Palikka>();
        this.ekapalikka = new Palikka(6, 0);
        palikat.add(ekapalikka);
        this.tokapalikka = new Palikka(6, 1);
        palikat.add(tokapalikka);
        this.kolmaspalikka = new Palikka(6, 2);
        palikat.add(kolmaspalikka);
        this.neljaspalikka = new Palikka(6, 3);
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
        if (kierto == 0) {

            this.palikat.get(0).setX(6);
            this.palikat.get(0).setY(0);

            this.palikat.get(1).setX(7);
            this.palikat.get(1).setY(0);

            this.palikat.get(2).setX(8);
            this.palikat.get(2).setY(0);

            this.palikat.get(3).setX(9);
            this.palikat.get(3).setY(0);
            kierto++;
        } else if (kierto == 1) {

            this.palikat.get(0).setX(6);
            this.palikat.get(0).setY(0);

            this.palikat.get(1).setX(6);
            this.palikat.get(1).setY(1);

            this.palikat.get(2).setX(6);
            this.palikat.get(2).setY(2);

            this.palikat.get(3).setX(6);
            this.palikat.get(3).setY(3);

            kierto--;
        }
    }

}
