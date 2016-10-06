/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.muntetris;

import java.util.ArrayList;

/**
 *
 * @author kape
 */
public interface Tetrimino {
    
    Palikka getPalikka(int x);
    ArrayList palautaKuvio();
    void kierra();
    
}
