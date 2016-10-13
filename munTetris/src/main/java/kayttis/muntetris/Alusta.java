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
 *
 * @author kape
 */
public class Alusta extends JPanel{
    
    private Kentta kentta;
    
    public Alusta(Kentta kentta)
    {
       super.setBackground(Color.BLACK);
       this.kentta=kentta;
    }
    @Override
    protected void paintComponent(Graphics graphics) {
    super.paintComponent(graphics);
    kentta.piirra(graphics);
    }
    

    
}
