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
 *Keylistener-luokka.
 * @author kmietola
 */
public class NappaimistonKuuntelija implements KeyListener {

    private Component component;
    private Kuvio kuvio;
    /**
     * Konstruktori saa parametrina pelialustan, jolle peli piirtyy. 
     * @param component 
     */

    public NappaimistonKuuntelija(Component component) {
        this.component = component;
    }
    /**
     * Kuvio päivitetään, jotta sitä voidaan ohjailla näppäimistöstä.
     * @param kuvio 
     */

    public void haeKuvio(Kuvio kuvio) {
        this.kuvio = kuvio;
    }
    public void poistaKuvio()
    {
        this.kuvio=null;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(this.kuvio!=null)
        {

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
            boolean b=this.kuvio.liiku();
        }
        component.repaint();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

}
