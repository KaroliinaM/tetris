/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.tetris;

import muntetris.tetris.tetriminot.Kuvio;
import java.util.ArrayList;

/**
 *Luokka kokoaa Rivi-oliot matriisiksi.
 * @author kmietola
 */
public class Rivit {

    private ArrayList<Rivi> rivit;
    private boolean voidaanLaskea;
    /**
     * Taulukko luodaan konstruktorissa.
     */

    public Rivit() {
        this.rivit = new ArrayList<Rivi>();
    }
    /**
     * Lisää rivin taulukkoon.
     * @param x lisättävä rivi.
     */

    public void lisaaRivi(Rivi x) {
        this.rivit.add(x);
    }
    /**
     * palauttaa tietyn rivin taulukosta.
     * @param mones mikä listallaoleva rivi haetaan.
     * @return rivi.
     */

    public Rivi getRivi(int mones) {
        return this.rivit.get(mones);
    }

    /**
     * Palauttaa listassa olevan rivien määrän.
     * @return listan koon.
     */
    public int rivienMaara() {
        return this.rivit.size();
    }

    /**
     * Poistaa rivin.
     * @param i poistettavan rivin numero.
     */
    public void poistaRivi(int i) {
        this.rivit.remove(i);
    }
    /**
     * Tätä pitää vielä miettiä.
     * @param kuvio kuvio.
     */

    public void lisaaKuvio(Kuvio kuvio) {

    }

    /**
     * Metodi testaa, että onko tietylle kuviolle tilaa liikkua alaspäin.
     *
     * @param kuvio tähän paikkaan tuleva kuvio.
     * @param k kenttä.
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
         * return false; }*
         */
    }

}
