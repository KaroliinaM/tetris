/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.muntetris;

/**
 *
 * @author kmietola
 */
public class Kentta {

    private int leveys;
    private int korkeus;
    private int alin;

    public Kentta() {
        this.leveys = 12;
        this.korkeus = 30;
        this.alin = 0;

    }

    public int getAlin() {
        return alin;
    }
    public void setAlin(int x)
    {
        this.alin=x;
    }
    

}
