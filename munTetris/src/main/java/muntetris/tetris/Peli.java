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
    private Rivit rivit;
    private boolean uusiKuvio;
    int pisteet;

    /**
     * Käynnistää pelin.
     */

    public Peli() {
        int pisteet=0;
        this.loppu = false;
        this.kentta = new Kentta();
        this.rivit = new Rivit();
        kentta.asetaRivit(rivit);
        Kayttoliittyma kayttis = new Kayttoliittyma(kentta);
        kayttis.run();

        while (loppu == false) {
            uusiKuvio=false;
            this.kuvio = new Kuvio();
            this.kuvio.haeKentta(kentta);
            System.out.println("tyyppi on " + kuvio.getTyyppi());
            //this.kuvio.liiku();
            kentta.asetaKuvio(kuvio);
            kayttis.tetriminoKuuntelijaan(kuvio);

            while (uusiKuvio==false) {

                uusiKuvio=this.kuvio.liiku();
                if(!kentta.onkoTilaa())
                {
                    this.kuvio.takaisin();
                    uusiKuvio=true;
                    break;
                }
                if(this.kuvio.sijaintiAlhaalla().getY() == this.kentta.getAlin())
                {
                    uusiKuvio=true;
                    break;
                }
                kayttis.paivita();

                    
                try {
                    Thread.sleep(1024);

                } catch (Exception e) {
                    System.out.println("virhe palikan liikkumisessa");
                }
            }
            for (int i = 0; i < 4; i++) {
                rivit.lisaaPalikka(new Palikka(kuvio.palikanSijainti(i).getX(), kuvio.palikanSijainti(i).getY()));
            }

            /**
             * boolean mahtuu=this.rivit.onkoTilaa(kuvio, kentta);
             * while(mahtuu==true&&this.kuvio.sijaintiAlhaalla().getY()<17) {
             * this.kuvio.liiku(); mahtuu=this.rivit.onkoTilaa(kuvio, kentta);
             * }*
             */
        }

    }

}
