/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kayttis.muntetris;

import java.awt.*;
import java.awt.event.*;
import tetris.muntetris.Kuvio;

/**
 *
 * @author kmietola
 */
public class NappaimistonKuuntelija implements KeyListener{
    private Component component;
    private Kuvio kuvio;
    
    public NappaimistonKuuntelija(Component component)
    {
        this.component=component;
    }
    public void haeKuvio(Kuvio kuvio)
    {
        this.kuvio=kuvio;
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        
        if(e.getKeyCode()==KeyEvent.VK_LEFT)
        {
            kuvio.liikutaVasemmalle();
        }
        if(e.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            kuvio.liikutaOikealle();
        }
        if(e.getKeyCode()==KeyEvent.VK_UP)
        {
            this.kuvio.kierra();
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN)
        {
            this.kuvio.liiku();
        }
        component.repaint();
        
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
    }
     
    @Override
    public void keyTyped(KeyEvent ke) {
    }
    
}
