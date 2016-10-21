/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.kayttis;

import java.awt.*;
import javax.swing.*;
import muntetris.tetris.Kentta;
import muntetris.tetris.Rivit;
import muntetris.tetris.tetriminot.Kuvio;

/**
 * Pelin käyttöliittymä, hallitsee käyttöliittymäkomponentteja.
 *
 * @author Karoliina
 */
public class Kayttoliittyma {

    private Kentta kentta;
    private JFrame frame;
    private Alusta a;
    private Alusta b;
    private int kumpiPaneeli;
    private Kuvio kuvio;
    private Kuvio seuraavaKuvio;
    private NappaimistonKuuntelija kuuntelija;
    private JLabel pisteNaytto;
    private Rivit rivit;

    /**
     * Olio saa luonnissa parametrinaan pelin kentän.
     *
     * @param kentta pelin kenttä.
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
     *
     * @param container jpanel olio
     */
    public void luoKomponentit(Container container) {
        GridLayout layout = new GridLayout(0, 2);
        container.setLayout(layout);

        this.a = new Alusta(this);
        a.setPuoli(1);
        container.add(a);
        container.add(luoSivupaneeli());
        this.kuuntelija = new NappaimistonKuuntelija(a);
        frame.addKeyListener(kuuntelija);
    }

    /**
     * Luo paneelin, johon tulevat näkyviin seuraava kuvio, ohjeet ja pisteet
     *
     * @return paneeli.
     */
    private JPanel luoSivupaneeli() {
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.setBorder(BorderFactory.createLineBorder(Color.white));
        //panel.add(new JPanel());
        this.b = new Alusta(this);
        b.setPuoli(2);
        panel.add(b);
        this.pisteNaytto = new JLabel("Pisteitä on " + this.kentta.getPisteet(), JLabel.CENTER);
        panel.add(pisteNaytto);
        panel.add(new JLabel("<html><body><div style='text-align: center;'>Peli toimii nuolinäppäimillä.<br> nuoli ylöspäin kääntää kuvion, nuoli alaspäin nopeuttaa sen laskeutumista. Nuolet sivuille liikuttavat kuviota sivusuunnassa</body></html>", JLabel.CENTER));
        return panel;
    }

    /**
     * Kutsuu kenttää, joka päivittää pelin näkymän.
     */
    public void paivita() {
        this.piirraUudelleen(a);
        this.piirraUudelleen(b);
        this.pisteNaytto.setText("Pisteitä on " + this.kentta.getPisteet());
    }

    /**
     * ilmoittaa näppäimistömnkuuntelijalle kuvion, käytetään uuden kuvion
     * luonnin jälkeen.
     *
     * @param kuvio liikuteltava kuvio.
     */
    public void tetriminoKuuntelijaan(Kuvio kuvio) {
        kuuntelija.haeKuvio(kuvio);
    }

    /**
     * Poistaa kuvion yhteyden näppäimistönkuuntelijaan, yritin rataista tällä
     * bugia.
     */
    public void tetriminoKuuntelijasta() {
        kuuntelija.poistaKuvio();
    }

    /**
     * tuo kuvion piirtämistä varten.
     *
     * @param kuvio parhaillaan pelattava kuvio
     */
    public void setKuvio(Kuvio kuvio) {
        this.kuvio = kuvio;
    }

    /**
     * tuo kuvion piirtämistä varten.
     *
     * @param kuvio seuraavaksi pelattava kuvio
     */
    public void setSeuraavaKuvio(Kuvio kuvio) {
        this.seuraavaKuvio = kuvio;
    }

    /**
     * tuo rivit piirtämistä varten.
     *
     * @param rivit alareunassa olevat palikat.
     */
    public void setRivit(Rivit rivit) {
        this.rivit = rivit;
    }

    /**
     * hakee tiedon, kumpaan paneeliin piirretään.
     *
     * @param kumpi paneelin numero.
     */
    public void setPiirtoalusta(int kumpi) {
        this.kumpiPaneeli = kumpi;
    }

    /**
     * piirtää molempiin paneeleihin.
     *
     * @param graphics jpanelin graphics-olio.
     */
    public void piirra(Graphics graphics) {
        if (this.kumpiPaneeli == 1) {
            if (kuvio != null) {
                for (int i = 0; i < 4; i++) {
                    graphics.fillRect(kuvio.palikanSijainti(i).getX() * 40, kuvio.palikanSijainti(i).getY() * 40, 40, 40);
                }
            }
            if (rivit.palikoidenMaara() > 0) {
                for (int i = 0; i < rivit.palikoidenMaara(); i++) {
                    graphics.fillRect(rivit.getPalikka(i).getX() * 40, rivit.getPalikka(i).getY() * 40, 40, 40);
                }
            }
        }
        if (this.kumpiPaneeli == 2) {
            if (this.seuraavaKuvio != null) {
                for (int i = 0; i < 4; i++) {
                    graphics.fillRect(this.seuraavaKuvio.palikanSijainti(i).getX() * 40 - 80, this.seuraavaKuvio.palikanSijainti(i).getY() * 40 + 80, 40, 40);
                }
            }
        }
    }

    /**
     * Päivittää graafisen näkymän.
     *
     * @param component piirtoalusta.
     */
    public void piirraUudelleen(Component component) {
        component.repaint();
    }

    /**
     * tulostaa ilmoituksen pelin loppumisesta.
     */
    public void lopetus() {
        this.pisteNaytto.setText("Peli loppui! Pisteitä " + this.kentta.getPisteet());
    }
}
