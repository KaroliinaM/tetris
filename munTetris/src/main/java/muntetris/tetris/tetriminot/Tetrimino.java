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
     *
     * @param x palikan kohta.
     * @return palikka.
     */
    public Palikka getPalikka(int x) {
        Palikka palautettava = this.palikat.get(x);

        return palautettava;
    }

    /**
     * Palauttaa kaikki palikat.
     *
     * @return lista palikoista.
     */
    public ArrayList palautaKuvio() {
        return this.palikat;
    }

    /**
     * palauttaa oikeanpuolimmaisen palikan.
     *
     * @return palikka.
     */
    public Palikka oikealla() {
        Palikka oikealla = this.getPalikka(0); //palikat.get(0);
        for (int i = 1; i < 4; i++) {
            if (this.getPalikka(i).getX() > oikealla.getX()) {
                oikealla = this.getPalikka(i);
            }
        }
        return oikealla;
    }

    /**
     * palauttaa vasemmanpuolimmaisen palikan.
     *
     * @return palikka.
     */
    public Palikka vasemmalla() {
        Palikka vasemmalla = this.getPalikka(0);
        for (int i = 1; i < 4; i++) {
            if (this.getPalikka(i).getX() < vasemmalla.getX()) {
                vasemmalla = this.getPalikka(i);
            }
        }
        return vasemmalla;
    }

    /**
     * palauttaa alimmaisen palikan.
     *
     * @return palikka.
     */
    public Palikka alhaalla() {
        Palikka alhaalla = this.getPalikka(0);
        for (int i = 1; i < 4; i++) {
            if (this.getPalikka(i).getY() > alhaalla.getY()) {
                alhaalla = this.getPalikka(i);
            }
        }
        return alhaalla;
    }

    /**
     * palauttaa kuvion korkeuden.
     *
     * @return korkeus.
     */
    public int korkeus() {
        int korkeus = 0;
        int alin = this.alhaalla().getY() + 1;
        int ylin = this.alhaalla().getY();

        for (int i = 0; i < 4; i++) {
            if (this.getPalikka(i).getY() < ylin) {
                ylin = this.getPalikka(i).getY();
            }
        }
        korkeus = alin - ylin;
        return korkeus;
    }

    /**
     * liikuttaa tetriminoa vasemmalle.
     */
    public void vasemmalle() {
        for (int i = 0; i < 4; i++) {
            this.getPalikka(i).yksiVasemmalle();
        }

    }

    /**
     * liikuttaa tetriminoa oikealle.
     */
    public void oikealle() {
        for (int i = 0; i < 4; i++) {
            this.getPalikka(i).yksiOikealle();
        }

    }

    /**
     * liikuttaa tetriminoa ylös.
     */
    public void ylos() {
        for (int i = 0; i < 4; i++) {
            this.getPalikka(i).yksiYlospain();
        }
    }

    /**
     * liikuttaa tetriminoa alas.
     */
    public void alas() {
        for (int i = 0; i < 4; i++) {
            this.getPalikka(i).yksiAlaspain();
        }
    }

    /**
     * Kiertää tetriminon.
     */
    public abstract void kierra();

    /**
     * Kiertää tetriminon takaisin, esim tilanteesa jossa kierto ei onnistu
     * tilanpuutteen takia.
     */

    public abstract void kierraTakaisin();

}
