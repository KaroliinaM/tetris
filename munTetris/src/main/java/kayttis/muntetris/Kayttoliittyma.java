/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttis.muntetris;

import java.awt.*;
import javax.swing.*;
import tetris.muntetris.Kentta;
import tetris.muntetris.tetriminot.Kuvio;

/**
 *
 * @author kape
 */
public class Kayttoliittyma {
    
    private Kentta kentta;
    private JFrame frame;
    private Alusta a;
    private NappaimistonKuuntelija kuuntelija; 
    
    public Kayttoliittyma(Kentta kentta)
    {
        this.kentta=kentta;
    }
    public void run()
    {
        this.frame=new JFrame();
        frame.setPreferredSize(new Dimension(800, 800));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoKomponentit(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
        
        
    }
    public void luoKomponentit(Container container)
    {
       GridLayout layout=new GridLayout(0, 2);
        container.setLayout(layout);
    
    this.a=new Alusta(kentta);
    container.add(a);
    this.kuuntelija=new NappaimistonKuuntelija(a);
    frame.addKeyListener(kuuntelija);
    }
    public void paivita()
    {
       kentta.piirraUudelleen(a);
    }
    public void tetriminoKuuntelijaan(Kuvio kuvio)
    {
        kuuntelija.haeKuvio(kuvio);
    }
    
}
