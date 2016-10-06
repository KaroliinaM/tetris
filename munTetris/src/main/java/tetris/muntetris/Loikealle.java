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
public class Loikealle implements Tetrimino {

    private ArrayList<Palikka> palikat;
    private int x;
    private int y;
    private Palikka ekapalikka;
    private Palikka tokapalikka;
    private Palikka kolmaspalikka;
    private Palikka neljaspalikka;
    private int kierto;

    public Loikealle() {
        this.kierto = 0;
        this.palikat = new ArrayList<Palikka>();
        this.ekapalikka = new Palikka(6, 26);
        palikat.add(ekapalikka);
        this.tokapalikka = new Palikka(7, 26);
        palikat.add(tokapalikka);
        this.kolmaspalikka = new Palikka(6, 27);
        palikat.add(kolmaspalikka);
        this.neljaspalikka = new Palikka(6, 28);
        palikat.add(neljaspalikka);
    }

    public Palikka getPalikka(int x) {
        Palikka palautettava = this.palikat.get(x);

        return palautettava;
    }

    public ArrayList palautaKuvio() {
        return this.palikat;
    }

    public void kierra() {
        if (kierto == 0) {
            this.palikat.get(0).setX(5);
            this.palikat.get(0).setY(0);

            this.palikat.get(1).setX(6);
            this.palikat.get(1).setY(0);

            this.palikat.get(2).setX(7);
            this.palikat.get(2).setY(0);

            this.palikat.get(3).setX(7);
            this.palikat.get(3).setY(1);
            kierto++;
        } else if (kierto == 1) {
            this.palikat.get(0).setX(7);
            this.palikat.get(0).setY(0);

            this.palikat.get(1).setX(7);
            this.palikat.get(1).setY(1);

            this.palikat.get(2).setX(7);
            this.palikat.get(2).setY(2);

            this.palikat.get(3).setX(6);
            this.palikat.get(3).setY(2);
            kierto++;
        } else if (kierto == 2) {
            this.palikat.get(0).setX(6);
            this.palikat.get(0).setY(0);

            this.palikat.get(1).setX(6);
            this.palikat.get(1).setY(1);

            this.palikat.get(2).setX(7);
            this.palikat.get(2).setY(1);

            this.palikat.get(3).setX(1);
            this.palikat.get(3).setY(8);
            kierto++;
        } else if (kierto == 3) {
            this.palikat.get(0).setX(6);
            this.palikat.get(0).setY(0);

            this.palikat.get(1).setX(7);
            this.palikat.get(1).setY(0);

            this.palikat.get(2).setX(6);
            this.palikat.get(2).setY(1);

            this.palikat.get(3).setX(6);
            this.palikat.get(3).setY(2);
            
            kierto = 0;
        }

    }

}
