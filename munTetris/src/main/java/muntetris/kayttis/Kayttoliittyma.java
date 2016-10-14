/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.kayttis;

import java.awt.*;
import javax.swing.*;
import muntetris.tetris.Kentta;
import muntetris.tetris.tetriminot.Kuvio;

/**
 * Pelin käyttöliittymä, hallitsee käyttöliittymäkomponentteja.
 * @author Karoliina
 */
public class Kayttoliittyma {

    private Kentta kentta;
    private JFrame frame;
    private Alusta a;
    private NappaimistonKuuntelija kuuntelija;

    /**
     * Olio saa luonnissa parametrinaan pelin kentän.
     * @param kentta 
     */
    public Kayttoliittyma(Kentta kentta) {
        this.kentta = kentta;
    }
    /**
     * Metodi käynnistää käyttöliittymän luonnin.
     */

    public void run() {
        this.frame = new JFrame();
        frame.setPreferredSize(new Dimension(800, 800));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoKomponentit(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);

    }
    /**
     * Luo käyttöliittymässä tarvittavat osaset ja kiinnittää ne ikkunaan.
     * @param container 
     */

    public void luoKomponentit(Container container) {
        GridLayout layout = new GridLayout(0, 2);
        container.setLayout(layout);

        this.a = new Alusta(kentta);
        container.add(a);
        this.kuuntelija = new NappaimistonKuuntelija(a);
        frame.addKeyListener(kuuntelija);
    }
    /**
     * Kutsuu kenttää, joka päivittää pelin näkymän.
     */

    public void paivita() {
        kentta.piirraUudelleen(a);
    }
    /**
     * ilmoittaa näppäimistömnkuuntelijalle kuvion, käytetään uuden kuvion luonnin jälkeen.
     * @param kuvio 
     */

    public void tetriminoKuuntelijaan(Kuvio kuvio) {
        kuuntelija.haeKuvio(kuvio);
    }

}
