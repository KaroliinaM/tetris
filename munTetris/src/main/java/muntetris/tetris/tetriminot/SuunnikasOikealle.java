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
public class SuunnikasOikealle extends Tetrimino {

//    private ArrayList<Palikka> palikat;
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
    public SuunnikasOikealle() {
        super();
        this.kierto = 0;
        palikat.add(new Palikka(6, 1));
        palikat.add(new Palikka(7, 1));
        palikat.add(new Palikka(7, 0));
        palikat.add(new Palikka(8, 0));
    }

    /**
     * Palauttaa tietyn palikan kuviosta.
     *
     * @param x palikan numero.
     * @return palikka.
     */
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
//
//    public ArrayList palautaKuvio() {
//        return this.palikat;
//    }
    /**
     * Kiertää kuvion.
     */
    public void kierra() {
        if (kierto == 0) {

            this.palikat.get(0).setX(this.palikat.get(0).getX() + 1);
            this.palikat.get(0).setY(this.palikat.get(0).getY());

            this.palikat.get(1).setX(this.palikat.get(1).getX());
            this.palikat.get(1).setY(this.palikat.get(1).getY() - 1);

            this.palikat.get(2).setX(this.palikat.get(2).getX() - 1);
            this.palikat.get(2).setY(this.palikat.get(2).getY());

            this.palikat.get(3).setX(this.palikat.get(3).getX() - 2);
            this.palikat.get(3).setY(this.palikat.get(3).getY() - 1);
            kierto++;
        } else if (kierto == 1) {

            this.palikat.get(0).setX(this.palikat.get(0).getX() - 1);
            this.palikat.get(0).setY(this.palikat.get(0).getY());

            this.palikat.get(1).setX(this.palikat.get(1).getX());
            this.palikat.get(1).setY(this.palikat.get(1).getY() + 1);

            this.palikat.get(2).setX(this.palikat.get(2).getX() + 1);
            this.palikat.get(2).setY(this.palikat.get(2).getY());

            this.palikat.get(3).setX(this.palikat.get(3).getX() + 2);
            this.palikat.get(3).setY(this.palikat.get(3).getY() + 1);

            kierto--;
        }

    }

    /**
     * kiertää tetriminon takaisin alkuasentoon.
     */
    @Override
    public void kierraTakaisin() {
        this.kierra();
    }

}
