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

/**
 * Määrittelee tetriksen kuvion käyttäytymisen.
 * @author kmietola
 */
public class Kuvio {

    private int tyyppi;
    private int x;
    private int y;
    private Palikka ekapalikka;
    private Palikka tokapalikka;
    private Palikka kolmaspalikka;
    private Palikka neljaspalikka;
    private Tetrimino tetrimino;
    private ArrayList<Palikka> palikat;
    private int kierto;
    /**
     * Konstruktori arpoo, millainen kuvio luodaan.
     */

    public Kuvio() {
        Random arpa = new Random();
        tyyppi = arpa.nextInt(7);
        this.palikat = new ArrayList<Palikka>();
        kierto = 0;

        if (tyyppi == 0) { //neliö
            this.tetrimino = new Nelio();

        } else if (tyyppi == 1) { //pitkä
            this.tetrimino = new Pitka();

        } else if (tyyppi == 2) { //l oikealle
            this.tetrimino = new LOikealle();

        } else if (tyyppi == 3) { //l vasemmalle
            this.tetrimino = new LVasemmalle();

        } else if (tyyppi == 4) { //suunnikas oikealle
            this.tetrimino = new SuunnikasOikealle();

        } else if (tyyppi == 5) { //suunnikas vasemmalle
            this.tetrimino = new SuunnikasVasemmalle();

        } else if (tyyppi == 6) { //kolmipiikki
            this.tetrimino = new Kolmipiikki();
        }

    }
    /**
     * Plauttaa tetriminon tyypin.
     * @return numero, joka arvotaan konstruktorissa.
     */

    public int getTyyppi() {
        return tyyppi;
    }
    /**
     * Palayuttaa yhden tetriminon palikan.
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
            if (this.sijaintiOikealla().getX() < 10) {
                int arvo = this.tetrimino.getPalikka(i).getX();
                arvo++;
                this.tetrimino.getPalikka(i).setX(arvo);
            }
        }
    }
    /**
     * Kuvio liikkuu vasemmalle yhden yksikön verran.
     */

    public void liikutaVasemmalle() {
        for (int i = 0; i < 4; i++) {
            if (this.sijaintiVasemmalla().getX() > 0) {
                int arvo = this.tetrimino.getPalikka(i).getX();
                arvo--;
                this.tetrimino.getPalikka(i).setX(arvo);
            }
        }
    }
    /**
     * Palauttaa tetriminon palikat.
     * @return lista palikoista.
     */

    public ArrayList<Palikka> kuviotesti() {
        this.palikat = this.tetrimino.palautaKuvio();
        return palikat;
    }
    /**
     * Palauttaa pisteen, missä tetrimino on oikealta katsottuna.
     * @return x-kordinaatti.
     */

    public Palikka sijaintiOikealla() {
        Palikka oikealla = this.tetrimino.getPalikka(0); //palikat.get(0);
        for (int i = 1; i < 4; i++) {
            if (this.tetrimino.getPalikka(i).getX() > oikealla.getX()) {
                oikealla = this.tetrimino.getPalikka(i);
            }
        }
        return oikealla;
    }
    /**
     * Palauttaa pisteen, missä tetrimino on vasemmalta katsottuna.
     * @return x-kordinaatti.
     */

    public Palikka sijaintiVasemmalla() {
        Palikka vasemmalla = this.tetrimino.getPalikka(0);
        for (int i = 1; i < 4; i++) {
            if (this.tetrimino.getPalikka(i).getX() > vasemmalla.getX()) {
                vasemmalla = this.tetrimino.getPalikka(i);
            }
        }
        return vasemmalla;
    }
    /**
     * Palauttaa tetriminon alimman pisteen.
     * @return y-kordinaatti.
     */

    public Palikka sijaintiAlhaalla() {
        Palikka alhaalla = this.tetrimino.getPalikka(0);
        for (int i = 1; i < 4; i++) {
            if (this.tetrimino.getPalikka(i).getY() > alhaalla.getY()) {
                alhaalla = this.tetrimino.getPalikka(i);
            }
        }
        return alhaalla;
    }
    /**
     * Palauttaa tetriminon korkeuden.
     * @return korkeus palikoina.
     */

    public int kuvionKorkeus() {
        int korkeus = 0;
        int alin = this.sijaintiAlhaalla().getY() + 1;
        int ylin = this.sijaintiAlhaalla().getY();

        for (int i = 0; i < 4; i++) {
            if (this.tetrimino.getPalikka(i).getY() < ylin) {
                ylin = this.tetrimino.getPalikka(i).getY();
            }
        }
        korkeus = alin - ylin;
        return korkeus;
    }
    /**
     * Kiertää tetriminon.
     */

    public void kierra() {
        if (this.tyyppi == 1) {
            this.tetrimino.kierra();
            this.testaaRajat();

        }
        if (this.tyyppi == 2) {
            this.tetrimino.kierra();
            this.testaaRajat();

        }
        if (this.tyyppi == 3) {
            this.tetrimino.kierra();
            this.testaaRajat();

        }
        if (this.tyyppi == 4) {
            this.tetrimino.kierra();
            this.testaaRajat();

        }
        if (this.tyyppi == 5) {
            this.tetrimino.kierra();
            this.testaaRajat();

        }
        if (this.tyyppi == 6) {
            this.tetrimino.kierra();
            this.testaaRajat();

        }
    }
    /**
     * Pitää tetriminon kentän rajoissa.
     */

    public void testaaRajat() {
        while (this.sijaintiOikealla().getX() > 9) {
            this.liikutaVasemmalle();
        }
        while (this.sijaintiVasemmalla().getX() < 1) {
            this.liikutaOikealle();
        }
    }
    /**
     * Kertoo tetriminon leveyden tietyssä sijainnissa.
     * @param kohta mistä kohtaa leveys katsotaan.
     * @return leveys palikoina.
     */

    public int leveys(int kohta) {
        int leveys = 0;
        kohta--;
        kohta=this.sijaintiAlhaalla().getY()-kohta;
        for (int i = 0; i < 4; i++) {
            if (this.tetrimino.getPalikka(i).getY() == kohta) {
                leveys++;
            }
        }
        return leveys;
    }
    /**
     * Tarkistaa kuvion sijainnin tietyssä kohtaa.
     * @param kohta mistä katsotaan.
     * @return x-kordinaatti.
     */

    public int rivinLaita(int kohta) {
        int paikka = 30;
        kohta += this.sijaintiAlhaalla().getY();
        for (int i = 1; i < 4; i++) {
            if (this.tetrimino.getPalikka(i).getY() == kohta && this.tetrimino.getPalikka(i).getX() < paikka) {
                paikka = this.tetrimino.getPalikka(i).getX();
            }
        }
        return paikka;

    }
    /**
     * Liikuttaa tetriminoa alaspäin.
     */

    public void liiku() {
        for (int i = 0; i < 4; i++) {
            this.tetrimino.getPalikka(i).yksiAlaspain();

        }
    }

}
