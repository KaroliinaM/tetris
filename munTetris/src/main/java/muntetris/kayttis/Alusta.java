/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.kayttis;

import java.awt.*;
import javax.swing.*;
import muntetris.tetris.Kentta;

/**
 * paneeli, johon itse peli piirtyy.
 *
 * @author Karoliina
 */
public class Alusta extends JPanel {

    private Kayttoliittyma kayttis;
    private int palkki;

    /**
     * Luokka saa arvonaan kentän, jonka kauttaa määrittyy piirrettävien elementtien sijainti.
     *
     * @param kayttis käyttöliittymä.
     */
    public Alusta(Kayttoliittyma kayttis) {
        super.setBackground(Color.BLACK);
        this.kayttis = kayttis;

    }

    /**
     * Määrittää kumpaan paneeliin piirretään.
     *
     * @param kumpi paneelin numero.
     */

    public void setPuoli(int kumpi) {
        this.palkki = kumpi;
    }

    /**
     * Metodi piirtää elementit kentälle.
     *
     * @param graphics
     */
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        kayttis.setPiirtoalusta(this.palkki);
        kayttis.piirra(graphics);
    }

}
