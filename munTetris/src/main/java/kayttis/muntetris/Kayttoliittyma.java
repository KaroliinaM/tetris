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
public class Kayttoliittyma {
    
    private JFrame frame;
    
    public Kayttoliittyma()
    {
        
    }
    public void run()
    {
        this.frame=new JFrame();
        frame.setPreferredSize(new Dimension(800, 700));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoKomponentit(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
        
        
    }
    public void luoKomponentit(Container container)
    {
       GridLayout layout=new GridLayout(0, 2);
        container.setLayout(layout);
    
    Alusta a=new Alusta();
    a.setSize(300, 300);
    container.add(a);
    }
    
}
