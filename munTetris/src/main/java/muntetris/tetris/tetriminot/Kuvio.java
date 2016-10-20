/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.tetris.tetriminot;

import muntetris.tetris.tetriminot.Tetrimino;
import muntetris.tetris.tetriminot.SuunnikasOikealle;
import muntetris.tetris.tetriminot.Kolmipiikki;
import muntetris.tetris.tetriminot.Nelio;
import muntetris.tetris.tetriminot.LOikealle;
import muntetris.tetris.tetriminot.LVasemmalle;
import muntetris.tetris.tetriminot.Pitka;
import muntetris.tetris.tetriminot.SuunnikasVasemmalle;
import java.util.ArrayList;
import java.util.Random;
import muntetris.tetris.Kentta;

/**
 * Määrittelee tetriksen kuvion käyttäytymisen.
 *
 * @author kmietola
 */
public class Kuvio {

    private int tyyppi;
    private Tetrimino tetrimino;
    private Kentta kentta;

    /**
     * Konstruktori arpoo, millainen kuvio luodaan.
     */
    public Kuvio() {
        Random arpa = new Random();
        tyyppi = arpa.nextInt(7);
        switch (tyyppi) {
            case 0:
                this.tetrimino = new Nelio();
                break;
            case 1:
                this.tetrimino = new Pitka();
                break;
            case 2:
                this.tetrimino = new LOikealle();
                break;
            case 3:
                this.tetrimino = new LVasemmalle();
                break;
            case 4:
                this.tetrimino = new SuunnikasOikealle();
                break;
            case 5:
                this.tetrimino = new SuunnikasVasemmalle();
                break;
            case 6:
                this.tetrimino = new Kolmipiikki();
                break;
            default:
                break;
        }
    }

    /**
     * Plauttaa tetriminon tyypin.
     *
     * @return numero, joka arvotaan konstruktorissa.
     */
    public int getTyyppi() {
        return tyyppi;
    }

    /**
     * Palauttaa yhden tetriminon palikan.
     *
     * @param x monesko palikka halutaan.
     * @return Palikka-olio.
     */
    public Palikka palikanSijainti(int x) {
        Palikka palautettava = this.tetrimino.getPalikka(x); //palikat.get(x);
        return palautettava;
    }

    /**
     * Kuvio liikkuu oikealle yhden yksikön verran.
     */
    public void liikutaOikealle() {
        for (int i = 0; i < 4; i++) {
            this.tetrimino.getPalikka(i).yksiOikealle();
        }
        this.testaaRajat();
        if (!this.kentta.onkoTilaa()) {
            for (int i = 0; i < 4; i++) {
               // if (this.sijaintiVasemmalla().getX() > 0) {
                    this.tetrimino.getPalikka(i).yksiVasemmalle();
               // }
            }
        }
    }

    /**
     * Kuvio liikkuu vasemmalle yhden yksikön verran.
     */
    public void liikutaVasemmalle() {
        for (int i = 0; i < 4; i++) {
            this.tetrimino.getPalikka(i).yksiVasemmalle();
        }
        this.testaaRajat();
        if (!this.kentta.onkoTilaa()) {
            for (int i = 0; i < 4; i++) {
                if (this.sijaintiOikealla().getX() < 9) {
                    this.tetrimino.getPalikka(i).yksiOikealle();
                }
            }
        }
    }

    /**
     * Palauttaa pisteen, missä tetrimino on oikealta katsottuna.
     * @return x-kordinaatti.
     */
    public Palikka sijaintiOikealla() {
        return this.tetrimino.oikealla();
    }

    /**
     * Palauttaa pisteen, missä tetrimino on vasemmalta katsottuna.
     * @return x-kordinaatti.
     */
    public Palikka sijaintiVasemmalla() {
        return this.tetrimino.vasemmalla();
    }

    /**
     * Palauttaa tetriminon alimman pisteen.
     * @return y-kordinaatti.
     */
    public Palikka sijaintiAlhaalla() {
        return this.tetrimino.alhaalla();
    }

    /**
     * Palauttaa tetriminon korkeuden.
     * @return korkeus palikoina.
     */
    public int kuvionKorkeus() {
        return this.tetrimino.korkeus();
    }

    /**
     * Kiertää tetriminon.
     */
    public void kierra() {
        if (this.tyyppi == 1) {
            this.tetrimino.kierra();
            this.testaaRajat();
            if (!this.kentta.onkoTilaa()) {
                this.tetrimino.kierra();
            }
        }
        if (this.tyyppi == 2) {
            this.tetrimino.kierra();
            this.testaaRajat();
            if (!this.kentta.onkoTilaa()) {
                this.tetrimino.kierra();
                this.tetrimino.kierra();
                this.tetrimino.kierra();
            }
        }
        if (this.tyyppi == 3) {
            this.tetrimino.kierra();
            this.testaaRajat();
            if (!this.kentta.onkoTilaa()) {
                this.tetrimino.kierra();
                this.tetrimino.kierra();
                this.tetrimino.kierra();
            }
        }
        if (this.tyyppi == 4) {
            this.tetrimino.kierra();
            this.testaaRajat();
            if (!this.kentta.onkoTilaa()) {
                this.tetrimino.kierra();
            }
        }
        if (this.tyyppi == 5) {
            this.tetrimino.kierra();
            this.testaaRajat();
            if (!this.kentta.onkoTilaa()) {
                this.tetrimino.kierra();
            }
        }
        if (this.tyyppi == 6) {
            this.tetrimino.kierra();
            this.testaaRajat();
            if (!this.kentta.onkoTilaa()) {
                this.tetrimino.kierra();
                this.tetrimino.kierra();
                this.tetrimino.kierra();
            }
        }
    }

    /**
     * Pitää tetriminon kentän rajoissa.
     */
    public void testaaRajat() {
        while (this.sijaintiOikealla().getX() > 9) {
            this.liikutaVasemmalle();
        }
        while (this.sijaintiVasemmalla().getX() < 0) {
            this.liikutaOikealle();
        }
    }

    /**
     * Liikuttaa tetriminoa alaspäin.
     */
    public boolean liiku() {
        if (this.sijaintiAlhaalla().getY() < 18) {
            for (int i = 0; i < 4; i++) {
                this.tetrimino.getPalikka(i).yksiAlaspain();
            }
            if (!this.kentta.onkoTilaa()) {
                this.takaisin();
                return true;
            }
        }
        return false;
    }

    public void takaisin() {
        for (int i = 0; i < 4; i++) {
            this.tetrimino.getPalikka(i).yksiYlospain();
        }
    }

    public void haeKentta(Kentta kentta) {
        this.kentta = kentta;
    }
}
