/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttis.muntetris;

import java.awt.*;
import javax.swing.*;
import tetris.muntetris.Kentta;

/**
 * paneeli, johon itse peli piirtyy.
 * @author Karoliina
 */
public class Alusta extends JPanel {

    private Kentta kentta;
    /**
     * Luokka saa arvonaan kentän, jonka kauttaa määrittyy piirrettävien elementtien sijainti.
     * @param kentta 
     */

    public Alusta(Kentta kentta) {
        super.setBackground(Color.BLACK);
        this.kentta = kentta;
    }
    /**
     * Metodi piirtää elementit kentälle.
     * @param graphics 
     */

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        kentta.piirra(graphics);
    }

}
