/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.muntetris.tetriminot;

import java.util.ArrayList;

/**
 *Yksi tetriminoista
 * 
 * @author Karoliina
 */
public class LVasemmalle extends Tetrimino {

    private ArrayList<Palikka> palikat;
    private int x;
    private int y;
    private Palikka ekapalikka;
    private Palikka tokapalikka;
    private Palikka kolmaspalikka;
    private Palikka neljaspalikka;
    private int kierto;

    public LVasemmalle() {
        this.kierto = 0;
        this.palikat = new ArrayList<Palikka>();
        this.ekapalikka = new Palikka(6, 0);
        palikat.add(ekapalikka);
        this.tokapalikka = new Palikka(7, 0);
        palikat.add(tokapalikka);
        this.kolmaspalikka = new Palikka(7, 1);
        palikat.add(kolmaspalikka);
        this.neljaspalikka = new Palikka(7, 2);
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
            this.palikat.get(0).setX(this.palikat.get(0).getX()+2);
            this.palikat.get(0).setY(this.palikat.get(0).getY());

            this.palikat.get(1).setX(this.palikat.get(1).getX());
            this.palikat.get(1).setY(this.palikat.get(1).getY()+1);

            this.palikat.get(2).setX(this.palikat.get(2).getX()+1);
            this.palikat.get(2).setY(this.palikat.get(2).getY()+2);

            this.palikat.get(3).setX(this.palikat.get(3).getX()+2);
            this.palikat.get(3).setY(this.palikat.get(3).getY()+1);
            kierto++;
        } else if (kierto == 1) {
            this.palikat.get(0).setX(this.palikat.get(0).getX()-2);
            this.palikat.get(0).setY(this.palikat.get(0).getY());

            this.palikat.get(1).setX(this.palikat.get(1).getX()-1);
            this.palikat.get(1).setY(this.palikat.get(1).getY()+1);

            this.palikat.get(2).setX(this.palikat.get(2).getX());
            this.palikat.get(2).setY(this.palikat.get(2).getY());

            this.palikat.get(3).setX(this.palikat.get(3).getX()+1);
            this.palikat.get(3).setY(this.palikat.get(3).getY()-1);
            kierto++;
        } else if (kierto == 2) {
            this.palikat.get(0).setX(this.palikat.get(0).getX());
            this.palikat.get(0).setY(this.palikat.get(0).getY()-1);

            this.palikat.get(1).setX(this.palikat.get(1).getX()-1);
            this.palikat.get(1).setY(this.palikat.get(1).getY());

            this.palikat.get(2).setX(this.palikat.get(2).getX());
            this.palikat.get(2).setY(this.palikat.get(2).getY()+1);

            this.palikat.get(3).setX(this.palikat.get(3).getX()+1);
            this.palikat.get(3).setY(this.palikat.get(3).getY()+2);
            kierto++;
        } else if (kierto == 3) {
            this.palikat.get(0).setX(this.palikat.get(0).getX()+1);
            this.palikat.get(0).setY(this.palikat.get(0).getY()-1);

            this.palikat.get(1).setX(this.palikat.get(1).getX());
            this.palikat.get(1).setY(this.palikat.get(1).getY()-2);

            this.palikat.get(2).setX(this.palikat.get(2).getX()-1);
            this.palikat.get(2).setY(this.palikat.get(2).getY()-1);

            this.palikat.get(3).setX(this.palikat.get(3).getX()-2);
            this.palikat.get(3).setY(this.palikat.get(3).getY());

            kierto = 0;
        }
    }

}
