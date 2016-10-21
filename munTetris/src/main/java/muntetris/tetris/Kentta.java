/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.tetris;

import muntetris.tetris.tetriminot.Kuvio;
import java.awt.*;
import muntetris.kayttis.Kayttoliittyma;
import muntetris.tetris.tetriminot.Palikka;

/**
 * Pelin alustan määrittävä luokka.
 *
 * @author kmietola
 */
public class Kentta {

    private int leveys;
    private int korkeus;
    private int alin;
    private Kuvio kuvio;
    private Rivit rivit;
    private int pisteet;

    /**
     * Luonnissa määritetään kentän mitat.
     */
    public Kentta() {
        this.leveys = 10;
        this.korkeus = 18;
        this.alin = 18;

    }

    /**
     * Palauttaa arvon, mihin asti kentälläon vapaata tilaa.
     *
     * @return alin.
     */
    public int getAlin() {
        return alin;
    }

    /**
     * Asettaa arvon, mihin asti kentällä on vapaata tilaa.
     *
     * @param x alin piste.
     */
    public void setAlin(int x) {
        this.alin = x;
    }

    /**
     * Päivittää kuvio-muuttujan kentälle.
     *
     * @param kuvio kentällä oleva kuvio.
     */
    public void asetaKuvio(Kuvio kuvio) {
        this.kuvio = kuvio;
    }

    /**
     * tuo rivit-muuttujan.
     *
     * @param rivit kentällä olevat palikat.
     */
    public void asetaRivit(Rivit rivit) {
        this.rivit = rivit;
    }

    /**
     * testaa, onko kuvion palikka kentän palikoiden päällä.
     *
     * @return totuusarvon onko päällekkäisyyksiä.
     */

    public boolean onkoTilaa() {
        boolean palautettava = true;
        for (int i = 0; i < 4; i++) {
            Palikka p1 = this.kuvio.palikanSijainti(i);
            for (int j = 0; j < this.rivit.palikoidenMaara(); j++) {
                if (this.rivit.getPalikka(j).getX() == p1.getX() && this.rivit.getPalikka(j).getY() == p1.getY()) {
                    palautettava = false;
                }
            }
        }
        return palautettava;
    }

    /**
     * asettaa pisteiden arvon.
     *
     * @param pisteet pelin pisteet.
     */
    public void setPisteet(int pisteet) {
        this.pisteet = pisteet;
    }

    /**
     * kertoo pisteiden arvon.
     *
     * @return pelin pisteet.
     */
    public int getPisteet() {
        return this.pisteet;
    }

}
