/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.tetris;

import muntetris.tetris.tetriminot.Kuvio;
import java.util.ArrayList;
import muntetris.kayttis.Kayttoliittyma;

/**
 * Luokka, joka vie peliä eteenpäin.
 * @author kmietola
 */
public class Peli {

    private Kentta kentta;
    private boolean loppu;
    private Kuvio kuvio;
    private Rivit rivit;
    /**
     * Käynnistää pelin.
     */

    public Peli() {
        this.loppu = false;
        this.kentta = new Kentta();
        this.rivit = new Rivit();
        Kayttoliittyma kayttis = new Kayttoliittyma(kentta);
        kayttis.run();

        while (loppu == false) {
            this.kuvio = new Kuvio();
            System.out.println("tyyppi on " + kuvio.getTyyppi());
            //this.kuvio.liiku();
            kentta.asetaKuvio(kuvio);
            kayttis.tetriminoKuuntelijaan(kuvio);

            while (this.kuvio.sijaintiAlhaalla().getY() < this.kentta.getAlin()) {
                // for(int i=0; i<5; i++){
                this.kuvio.liiku();
                kayttis.paivita();
                System.out.println("hei");
                try {
                    Thread.sleep(1024);

                } catch (Exception e) {
                    System.out.println("virhe palikan liikkumisessa");
                }
            }
            /**
             * boolean mahtuu=this.rivit.onkoTilaa(kuvio, kentta);
             * while(mahtuu==true&&this.kuvio.sijaintiAlhaalla().getY()<17) {
             * this.kuvio.liiku(); mahtuu=this.rivit.onkoTilaa(kuvio, kentta);
          }*
             */

        }

    }

}
