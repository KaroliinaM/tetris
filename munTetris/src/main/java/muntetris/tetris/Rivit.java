/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.tetris;

import muntetris.tetris.tetriminot.Kuvio;
import java.util.ArrayList;
import muntetris.tetris.tetriminot.Palikka;

/**
 *Luokka kokoaa Rivi-oliot matriisiksi.
 * @author kmietola
 */
public class Rivit {

    private ArrayList<Palikka> palikat;
    private boolean voidaanLaskea;
    /**
     * Taulukko luodaan konstruktorissa.
     */

    public Rivit() {
        this.palikat= new ArrayList<Palikka>();
    }
    /**
     * Lisää rivin taulukkoon.
     * @param x lisättävä rivi.
     */

    public void lisaaPalikka(Palikka x) {
        this.palikat.add(x);
    }
    /**
     * palauttaa tietyn rivin taulukosta.
     * @param mones mikä listallaoleva rivi haetaan.
     * @return rivi.
     */

    public Palikka getPalikka(int mones) {
        return this.palikat.get(mones);
    }

    /**
     * Palauttaa listassa olevan rivien määrän.
     * @return listan koon.
     */
    public int PalikoidenMaara() {
        return this.palikat.size();
    }

    /**
     * Poistaa rivin.
     * @param i poistettavan rivin numero.
     */
    public void poistaPalikka(int i) {
        this.palikat.remove(i);
    }
    public int vaakaRivienMaara()
    {
        int suurin=18;
        for(int i=0; i<this.palikat.size(); i++)
        {
            if(this.palikat.get(i).getY()<suurin)
            {
                suurin=this.palikat.get(i).getY();
            }
        }
        return suurin;
    }
    /**
     * Tätä pitää vielä miettiä.
     * @param kuvio kuvio.
     */

//    public void lisaaKuvio(Kuvio kuvio) {
//
//    }

    /**
     * Metodi testaa, että onko tietylle kuviolle tilaa liikkua alaspäin.
     *
     * @param kuvio tähän paikkaan tuleva kuvio.
     * @param k kenttä.
     *
     * @return palauttaa totuusarvon.
     */
//    public boolean onkoTilaa(Kuvio kuvio, Kentta k) {
//        boolean palautettava;
//
//        int kierros = kuvio.sijaintiAlhaalla().getY() - k.getAlin();
//        palautettava = true;
//        for (int i = 0; i < kierros + 1; i++) {
//            Rivi r = rivit.get(rivit.size() - (1 + kierros));
//            int tila = kuvio.leveys(i);
//            int kohta = kuvio.rivinLaita(i);
//
//            for (int j = 0; j < tila; j++) {
//                if (r.annaPalikka(kohta + i) == false) {
//                    palautettava = false;
//                }
//            }
//        }
//        return palautettava;
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
