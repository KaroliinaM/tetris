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
 */
public class Rivi {

    private ArrayList<Boolean> rivi;

    public Rivi() {
        this.rivi = new ArrayList<Boolean>();
        for (int i = 0; i < 12; i++) {
            this.rivi.add(i, Boolean.FALSE);
        }
    }

    public void asetaPalikka(int x) {
        this.rivi.add(x, Boolean.TRUE);
    }

    public ArrayList annaRivi() {
        return this.rivi;
    }

}
