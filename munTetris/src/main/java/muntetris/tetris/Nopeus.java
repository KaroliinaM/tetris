/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.tetris;

/**
 *
 * @author kape
 */
public class Nopeus {

    private int nopeus;
    private boolean laskettu;
    private int kierrokset;

    public Nopeus(int alkunopeus, int kierrokset) {
        this.nopeus = alkunopeus;
        this.laskettu=true;
        this.kierrokset=kierrokset;

    }
    public int getNopeus()
    {
        return nopeus;
    }
    public void laskeNopeus(int pisteet)
    {
        if(laskettu)
        {
            if(pisteet%this.kierrokset!=0)
            {
               this.laskettu=false;
            }
        }
        else
        {
            if(pisteet%this.kierrokset==0)
            {
                this.nopeus*=0.75;
               this.laskettu=true; 
            }
        }
        
    }

}
