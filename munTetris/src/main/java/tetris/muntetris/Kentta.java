/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.muntetris;

import tetris.muntetris.tetriminot.Kuvio;
import java.awt.*;
import kayttis.muntetris.Kayttoliittyma;

/**
 *
 * @author kmietola
 *
 * Tetriksen kenttä.
 */
public class Kentta {

    private int leveys;
    private int korkeus;
    private int alin;
    private Kuvio kuvio;
    private Rivit rivit;

    public Kentta() {
        this.leveys = 10;
        this.korkeus = 18;
        this.alin = 18;

    }

    public int getAlin() {
        return alin;
    }

    public void setAlin(int x) {
        this.alin = x;
    }

    public void asetaKuvio(Kuvio kuvio) {
        this.kuvio = kuvio;
    }

    public void piirra(Graphics graphics) {
        if (kuvio != null) {
            for (int i = 0; i < 4; i++) {
                graphics.fillRect(kuvio.palikanSijainti(i).getX() * 40, kuvio.palikanSijainti(i).getY() * 40, 40, 40);
            }
        }

    }

    public void piirraUudelleen(Component component) {
        component.repaint();
    }

}
