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
 * Tetriksen alareunan rivit luokkana. 
 */
public class Rivi {

    private ArrayList<Boolean> rivi;

    public Rivi() {
        this.rivi = new ArrayList<Boolean>();
        for (int i = 0; i < 12; i++) {
            this.rivi.add(false);
        }
        System.out.println(this.rivi.size());
        for (boolean i : rivi) {
            System.out.println(i);
        }

    }
    /*
    asettaa arvon arraylistiin
    */

    public void asetaPalikka(int x) {
        this.rivi.set(x, Boolean.TRUE);
    }
    /*
    Palauttaa arraylistin
    */

    public ArrayList annaRivi() {
        return this.rivi;
    }
    /*
    palauttaa arraylistin koon(testiluokkaa varten)
    */

    public int annaRivinkoko() {
        return 12;
    }
    /*
    Palauttaa Arraylistin yksikön arvon
    */

    public boolean annaPalikka(int x) {
        return this.rivi.get(x);
    }
    /*
    Testaa onko rivi täynnä
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
