/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttis.muntetris;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author kape
 */
public class Alusta extends JPanel{
    
    public Alusta()
    {
       super.setBackground(Color.BLACK);
       super.setSize(300, 300);
    }
    @Override
    protected void paintComponent(Graphics graphics) {
    super.paintComponent(graphics);
    }
    
}
