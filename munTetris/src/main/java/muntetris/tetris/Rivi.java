/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.tetris;

import java.util.ArrayList;

/**
 * Tähän luokkaan on tarkoitus tulla pelin alareunaan kasautuvat palikat.
 * @author kmietola
 */
public class Rivi {

    private ArrayList<Boolean> rivi;
    /**
     * Konstruktori luo listan, johon merkitään palikat boolean-arvoina.
     */

    public Rivi() {
        this.rivi = new ArrayList<Boolean>();
        for (int i = 0; i < 10; i++) {
            this.rivi.add(false);
        }
        System.out.println(this.rivi.size());
        for (boolean i : rivi) {
            System.out.println(i);
        }

    }
    /**
     * Asettaa palikan riville.
     * @param x kohta mihin palikka tulee.
     */

    public void asetaPalikka(int x) {
        this.rivi.set(x, Boolean.TRUE);
    }
    /**
     * Palauttaa listan.
     * @return lista, mitkä kohdat rivissä ovat varattuja.
     */

    public ArrayList annaRivi() {
        return this.rivi;
    }
    /**
     * epäonnistunut testi.
     * @return vakion.
     */

    public int annaRivinkoko() {
       return this.rivi.size();
    }
    /**
     * Palauttaa tiedon, ono yksittäinen paikka varattu.
     * @param x paikan sijainti.
     * @return totuusarvon.
     */

    public boolean annaPalikka(int x) {
        return this.rivi.get(x);
    }
    /**
     * Testaa, onko rivi täynnä.
     * @return totuusarvon.
     */

    public boolean onkoTaynna() {
        boolean palautettava = true;
        for (Boolean b : rivi) {
            if (b == false) {
                palautettava = false;
            }
        }
        return palautettava;
    }

}
