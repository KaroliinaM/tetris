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
public class Kolmipiikki extends Tetrimino {

    //private ArrayList<Palikka> palikat;
//    private int x;
//    private int y;
//    private Palikka ekapalikka;
//    private Palikka tokapalikka;
//    private Palikka kolmaspalikka;
//    private Palikka neljaspalikka;
    private int kierto;

    /**
     * Kuvio luodaan arraylistina konstruktorissa.
     */

    public Kolmipiikki() {
        super();
        this.kierto = 0;
        super.palikat.add(new Palikka(6, 0));
        super.palikat.add(new Palikka(7, 0));
        super.palikat.add(new Palikka(8, 0));
        super.palikat.add(new Palikka(7, 1));
    }
//    /**
//     * Palauttaa tietyn palikan kuviosta.
//     * @param x palikan numero.
//     * @return palikka.
//     */
//
//    public Palikka getPalikka(int x) {
//        Palikka palautettava = this.palikat.get(x);
//
//        return palautettava;
//    }
//    /**
//     * Palauttaa koko listan.
//     * @return lista palikoista.
//     */
//
//    public ArrayList palautaKuvio() {
//        return this.palikat;
//    }

    /**
     * Kääntää kuvion(vaiheessa).
     */

    @Override
    public void kierra() {

        if (kierto == 0) {
            this.palikat.get(0).setX(this.palikat.get(0).getX() + 1);
            this.palikat.get(0).setY(this.palikat.get(0).getY() - 1);

            this.palikat.get(1).setX(this.palikat.get(1).getX());
            this.palikat.get(1).setY(this.palikat.get(1).getY());

            this.palikat.get(2).setX(this.palikat.get(2).getX() - 1);
            this.palikat.get(2).setY(this.palikat.get(2).getY() + 1);

            this.palikat.get(3).setX(this.palikat.get(3).getX() - 1);
            this.palikat.get(3).setY(this.palikat.get(3).getY() - 1);
            kierto++;
        } else if (kierto == 1) {
            this.palikat.get(0).setX(this.palikat.get(0).getX() + 1);
            this.palikat.get(0).setY(this.palikat.get(0).getY() + 2);

            this.palikat.get(1).setX(this.palikat.get(1).getX());
            this.palikat.get(1).setY(this.palikat.get(1).getY() + 1);

            this.palikat.get(2).setX(this.palikat.get(2).getX() - 1);
            this.palikat.get(2).setY(this.palikat.get(2).getY());

            this.palikat.get(3).setX(this.palikat.get(3).getX() + 1);
            this.palikat.get(3).setY(this.palikat.get(3).getY());
            kierto++;
        } else if (kierto == 2) {
            this.palikat.get(0).setX(this.palikat.get(0).getX() - 2);
            this.palikat.get(0).setY(this.palikat.get(0).getY());

            this.palikat.get(1).setX(this.palikat.get(1).getX() - 1);
            this.palikat.get(1).setY(this.palikat.get(1).getY() - 1);

            this.palikat.get(2).setX(this.palikat.get(2).getX());
            this.palikat.get(2).setY(this.palikat.get(2).getY() - 2);

            this.palikat.get(3).setX(this.palikat.get(3).getX());
            this.palikat.get(3).setY(this.palikat.get(3).getY());
            kierto++;
        } else if (kierto == 3) {
            this.palikat.get(0).setX(this.palikat.get(0).getX());
            this.palikat.get(0).setY(this.palikat.get(0).getY() - 1);

            this.palikat.get(1).setX(this.palikat.get(1).getX() + 1);
            this.palikat.get(1).setY(this.palikat.get(1).getY());

            this.palikat.get(2).setX(this.palikat.get(2).getX() + 2);
            this.palikat.get(2).setY(this.palikat.get(2).getY() + 1);

            this.palikat.get(3).setX(this.palikat.get(3).getX());
            this.palikat.get(3).setY(this.palikat.get(3).getY() + 1);

            kierto = 0;
        }

    }

    /**
     * kiertää tetriminon takaisin alkuasentoon.
     */
    @Override
    public void kierraTakaisin() {
        for (int i = 0; i < 3; i++) {
            this.kierra();
        }
    }

}
