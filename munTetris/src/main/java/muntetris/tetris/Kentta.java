/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.tetris;

import muntetris.tetris.tetriminot.Kuvio;
import java.awt.*;
import muntetris.kayttis.Kayttoliittyma;

/**
 * Pelin alustan määrittävä luokka.
 * @author kmietola
 */
public class Kentta {

    private int leveys;
    private int korkeus;
    private int alin;
    private Kuvio kuvio;
    private Rivit rivit;
    /**
     * Luonnissa määritetään kentäm mitat.
     */

    public Kentta() {
        this.leveys = 10;
        this.korkeus = 18;
        this.alin = 18;

    }
    /**
     * Palauttaa arvon, mihin asti kentälläon vapaata tilaa.
     * @return alin.
     */

    public int getAlin() {
        return alin;
    }
    /**
     * Asettaa arvon, mihin asti kentällä on vapaata tilaa.
     * @param x 
     */

    public void setAlin(int x) {
        this.alin = x;
    }
    /**
     * Päivittää kuvio-muuttujan kentälle.
     * @param kuvio 
     */

    public void asetaKuvio(Kuvio kuvio) {
        this.kuvio = kuvio;
    }
    /**
     * Piirtää kuvio-muuttujan kentälle.
     * @param graphics 
     */

    public void piirra(Graphics graphics) {
        if (kuvio != null) {
            for (int i = 0; i < 4; i++) {
                graphics.fillRect(kuvio.palikanSijainti(i).getX() * 40, kuvio.palikanSijainti(i).getY() * 40, 40, 40);
            }
        }

    }
    /**
     * PÄivittää graafisen näkymän.
     * @param component 
     */

    public void piirraUudelleen(Component component) {
        component.repaint();
    }

}
