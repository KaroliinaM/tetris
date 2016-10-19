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
    private Alusta b;
    private NappaimistonKuuntelija kuuntelija;
    private JLabel pisteNaytto;

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
        a.setPuoli(1);
        container.add(a);
        container.add(luoSivupaneeli());
        this.kuuntelija = new NappaimistonKuuntelija(a);
        frame.addKeyListener(kuuntelija);
    }
    private JPanel luoSivupaneeli() {
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.setBorder(BorderFactory.createLineBorder(Color.white));
        //panel.add(new JPanel());
        this.b=new Alusta(kentta);
        b.setPuoli(2);
        panel.add(b);
        this.pisteNaytto=new JLabel("Pisteitä on " + this.kentta.getPisteet(), JLabel.CENTER);
        panel.add(pisteNaytto);
        panel.add(new JLabel("<html><body><div style='text-align: center;'>Peli toimii nuolinäppäimillä.<br> nuoli ylöspäin kääntää kuvion, nuoli alaspäin nopeuttaa sen laskeutumista. Nuolet sivuille liikuttavat kuviota sivusuunnassa</body></html>", JLabel.CENTER));
        return panel;
    }
    /**
     * Kutsuu kenttää, joka päivittää pelin näkymän.
     */

    public void paivita() {
        kentta.piirraUudelleen(a);
        kentta.piirraUudelleen(b);
        this.pisteNaytto.setText("Pisteitä on " + this.kentta.getPisteet());
    }
    /**
     * ilmoittaa näppäimistömnkuuntelijalle kuvion, käytetään uuden kuvion luonnin jälkeen.
     * @param kuvio 
     */

    public void tetriminoKuuntelijaan(Kuvio kuvio) {
        kuuntelija.haeKuvio(kuvio);
    }
    public void tetriminoKuuntelijasta()
    {
        kuuntelija.poistaKuvio();
    }
    public void lopetus()
    {
        this.pisteNaytto.setText("Peli loppui! Pisteitä "+ this.kentta.getPisteet());
    }

}
