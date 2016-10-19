/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.tetris;

import muntetris.tetris.tetriminot.Kuvio;
import java.util.ArrayList;
import muntetris.kayttis.Kayttoliittyma;
import muntetris.tetris.tetriminot.Palikka;

/**
 * Luokka, joka vie peliä eteenpäin.
 *
 * @author kmietola
 */
public class Peli {

    private Kentta kentta;
    private boolean loppu;
    private Kuvio kuvio;
    private Kuvio seuraavaKuvio;
    private Rivit rivit;
    private boolean uusiKuvio;
    private int pisteet;
    private Nopeus nopeus;
    private Kayttoliittyma kayttis;

    /**
     * Käynnistää pelin.
     */
    public Peli() {
        this.pisteet = 0;
        this.loppu = false;
        this.kentta = new Kentta();
        this.rivit = new Rivit();
        this.seuraavaKuvio = new Kuvio();
        kentta.asetaRivit(rivit);
        this.kentta.setPisteet(pisteet);
        this.nopeus=new Nopeus(1024, 5);
        this.kayttis = new Kayttoliittyma(kentta);
        kayttis.run();

        while (loppu == false) {
            uusiKuvio = false;
            this.kuvio = seuraavaKuvio;
            this.seuraavaKuvio = new Kuvio();
            this.kuvio.haeKentta(kentta);
            System.out.println("tyyppi on " + kuvio.getTyyppi());
            System.out.println("seuraavan tyyppi on " + seuraavaKuvio.getTyyppi());
            //this.kuvio.liiku();
            kentta.asetaKuvio(kuvio);
            kentta.asetaSeuraavaKuvio(this.seuraavaKuvio);
            kayttis.tetriminoKuuntelijaan(kuvio);

            while (uusiKuvio == false) {

                uusiKuvio = this.kuvio.liiku();
                if (uusiKuvio) {
                    //this.kuvio.takaisin();
                    kayttis.tetriminoKuuntelijasta();
                    //uusiKuvio = true;
                    break;
                }
                if (this.kuvio.sijaintiAlhaalla().getY() == this.kentta.getAlin()) {
                    uusiKuvio = true;
                    break;
                }
                kayttis.paivita();

                try {
                    Thread.sleep(this.nopeus.getNopeus());

                } catch (Exception e) {
                    System.out.println("virhe palikan liikkumisessa");
                }
            }
            for (int i = 0; i < 4; i++) {
                rivit.lisaaPalikka(new Palikka(kuvio.palikanSijainti(i).getX(), kuvio.palikanSijainti(i).getY()));
            }
            int rivitaynna = 1;
            while (rivitaynna > 0) {
                rivitaynna = this.rivit.riviTaysi();
                if (rivitaynna > 0) {
                    this.pisteet++;
                    this.nopeus.laskeNopeus(pisteet);
                    this.kentta.setPisteet(pisteet);
                    this.rivit.poistaRivi(rivitaynna);


            }
            kayttis.paivita();
           
            }
            
            System.out.println("pisteitä " + this.pisteet);
            System.out.println("pudotusaika " + this.nopeus.getNopeus());

            loppu = this.rivit.onkoLoppu();
        }
        this.kayttis.lopetus();

    }

}
