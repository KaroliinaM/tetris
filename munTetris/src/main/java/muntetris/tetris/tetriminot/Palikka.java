/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.tetris.tetriminot;

/**
 *Tetriminojen rakennusosa.
 * @author kmietola
 */
public class Palikka {

    private int x;
    private int y;
    /**
     * Palikka saa kordinaatit konstruktorissa.
     * @param x x-kordinaatti.
     * @param y y-kordinaatti.
     */

    public Palikka(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Palauttaa y-kordinaatin.
     * @return y.
     */

    public int getY() {
        return y;
    }
    /**
     * Palauttaa x-kordinaatin.
     * @return x.
     */

    public int getX() {
        return x;
    }
    /**
     * Asettaa y-kordinaatin.
     * @param y asetettava kordinaatti.
     */

    public void setY(int y) {
        this.y = y;
    }
    /**
     * Asettaa x-kordinaatin.
     * @param x asetettava kordinaatti.
     */

    public void setX(int x) {
        this.x = x;
    }
    /**
     * Vähentää yhden arvon y-kordinaatista.
     */

    public void yksiAlaspain() {
        this.y++;
    }
    public void yksiYlospain()
    {
        this.y--;
    }
    public void yksiVasemmalle()
    {
        this.x--;
    }
    public void yksiOikealle()
    {
        this.x++;
    }

}
