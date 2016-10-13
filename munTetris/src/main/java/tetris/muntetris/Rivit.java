/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.muntetris;

import java.util.ArrayList;

/**
 *
 * @author kmietola
 *
 * Tetriksen alareunan rivit arraylistina.
 */
public class Rivit {

    private ArrayList<Rivi> rivit;
    private boolean voidaanLaskea;

    public Rivit() {
        this.rivit = new ArrayList<Rivi>();
    }

    public void lisaaRivi(Rivi x) {
        this.rivit.add(x);
    }

    public Rivi getRivi(int mones) {
        return this.rivit.get(mones);
    }

    /*
    Palauttaa, montako riviä listassa on
     */

    public int rivienMaara() {
        return this.rivit.size();
    }

    /*
    Poistaa rivin
     */

    public void poistaRivi(int i) {
        this.rivit.remove(i);
    }
    public void lisaaKuvio(Kuvio kuvio)
    {
        
    }

    /**
     * Metodi testaa, että onko tietylle kuviolle tilaa liikkua alaspäin.
     *
     * @param kuvio, tähän paikkaan tuleva kuvio.
     * @param k, kenttä.
     *
     * @return palauttaa totuusarvon.
     */
    public boolean onkoTilaa(Kuvio kuvio, Kentta k) {
        boolean palautettava;

        int kierros = kuvio.sijaintiAlhaalla().getY() - k.getAlin();
        palautettava = true;
        for (int i = 0; i < kierros + 1; i++) {
            Rivi r = rivit.get(rivit.size() - (1 + kierros));
            int tila = kuvio.leveys(i);
            int kohta = kuvio.rivinLaita(i);

            for (int j = 0; j < tila; j++) {
                if (r.annaPalikka(kohta + i) == false) {
                    palautettava = false;
                }
            }
        }
        return palautettava;
        /**
         * if (kierros == 0) { Rivi r = rivit.get(rivit.size() - 1);
         *
         * int tila = kuvio.leveys(0); int kohta =
         * kuvio.sijaintiAlhaalla().getX();
         *
         * for (int i = 0; i < tila; i++) { if (r.annaPalikka(kohta + i) ==
         * false) { palautettava = false; } } return palautettava; } else {
         * return false;
        }*
         */
    }

}
