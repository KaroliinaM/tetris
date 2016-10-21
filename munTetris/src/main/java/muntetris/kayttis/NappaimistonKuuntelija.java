/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.kayttis;

import java.awt.*;
import java.awt.event.*;
import muntetris.tetris.tetriminot.Kuvio;

/**
 * Keylistener-luokka.
 *
 * @author kmietola
 */
public class NappaimistonKuuntelija implements KeyListener {

    private Component component;
    private Kuvio kuvio;

    /**
     * Konstruktori saa parametrina pelialustan, jolle peli piirtyy.
     *
     * @param component piirtoalusta.
     */

    public NappaimistonKuuntelija(Component component) {
        this.component = component;
    }

    /**
     * Kuvio päivitetään, jotta sitä voidaan ohjailla näppäimistöstä.
     *
     * @param kuvio liikuteltava kuvio.
     */

    public void haeKuvio(Kuvio kuvio) {
        this.kuvio = kuvio;
    }

    /**
     * Kuvio poistetaan näppäimistönkuuntelijasta.
     */
    public void poistaKuvio() {
        this.kuvio = null;
    }

    /**
     * kuviooiden ohjailu näppäimistöllä.
     *
     * @param e näppäimistönpainallus.
     */

    @Override
    public void keyPressed(KeyEvent e) {
        if (this.kuvio != null) {

            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                kuvio.liikutaVasemmalle();
            }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                kuvio.liikutaOikealle();
            }
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                this.kuvio.kierra();
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                boolean b = this.kuvio.liiku();
            }
            component.repaint();
        }

    }

    /**
     * Keylisteneriin kuuluva metodi.
     *
     * @param e painettu näppäin
     */

    @Override
    public void keyReleased(KeyEvent e) {
    }

    /**
     * Keylisteneriin kuuluva metodi.
     *
     * @param ke painettu näppäin
     */

    @Override
    public void keyTyped(KeyEvent ke) {
    }

}
