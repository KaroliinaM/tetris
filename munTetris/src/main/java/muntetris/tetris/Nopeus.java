/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.tetris;

/**
 * Ohjaa pelin nopeutta. Olisi ehkä toiminut metodinakin.
 *
 * @author Karoliina
 */
public class Nopeus {

    private int nopeus;
    private boolean laskettu;
    private int kierrokset;

    /**
     * asettaa muuttujan alkuarvon.
     *
     * @param alkunopeus nopeus millisekunteina.
     * @param kierrokset kuinka monen kierroksen jälkeen vauhtia nopeutetaan.
     */

    public Nopeus(int alkunopeus, int kierrokset) {
        this.nopeus = alkunopeus;
        this.laskettu = true;
        this.kierrokset = kierrokset;

    }

    /**
     * Kertoo nopeuden.
     *
     * @return pelin nopeus millisekunteina.
     */
    public int getNopeus() {
        return nopeus;
    }

    /**
     * leikkaa millisekunneista neljsosan ja merkitsee että nopeutta on
     * nostettu.
     *
     * @param pisteet pelin pisteet.
     */
    public void laskeNopeus(int pisteet) {
        if (laskettu) {
            if (pisteet % this.kierrokset != 0) {
                this.laskettu = false;
            }
        } else if (pisteet % this.kierrokset == 0) {
            this.nopeus *= 0.75;
            this.laskettu = true;
        }

    }

}
