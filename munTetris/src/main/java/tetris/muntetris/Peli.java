/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.muntetris;

import java.util.ArrayList;

/**
 *
 * @author kmietola
 */
public class Peli {

    private Kentta kentta;
    private boolean loppu;
    private Kuvio kuvio;
    private ArrayList<ArrayList> rivit;

    public Peli() {
        this.loppu = false;
        this.kentta = new Kentta();
        this.rivit = new ArrayList<ArrayList>();

        while (this.loppu = false) {
            this.kuvio = new Kuvio();
            while (this.kuvio.sijaintiAlhaalla().getY() > this.kentta.getAlin()) {

                this.kuvio.liiku();
                try {
                    this.kuvio.wait(1000);
                } catch (Exception e) {
                    System.out.println("virhe");
                }
            }
            if (rivit.size() == 0) {
                Rivi rivi = new Rivi();
            }

        }

    }

}
