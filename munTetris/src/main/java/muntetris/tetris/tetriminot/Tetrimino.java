/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.tetris.tetriminot;

import java.util.ArrayList;

/**
 * Ei toimi niin kuin pitäisi tällä hetkellä. Korjaan viikonloppuna.
 *
 * @author Karoliina
 */
public abstract class Tetrimino {

    protected ArrayList<Palikka> palikat;
    /**
     * varsinaisten tetriminoluokkien pitäisi yliajaa tämä.
     */

    public Tetrimino() {
        this.palikat = new ArrayList<Palikka>();
    }

    /**
     * Palauttaa tietyn palikan.
     * @param x palikan kohta.
     * @return palikka.
     */
    public Palikka getPalikka(int x) {
        Palikka palautettava = this.palikat.get(x);

        return palautettava;
    }
    /**
     * Palauttaa kaikki palikat.
     * @return lista palikoista.
     */

    public ArrayList palautaKuvio() {
        return this.palikat;
    }
    /**
     * Kiertää tetriminon.
     */

    public abstract void kierra();

}
