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
    

    public Peli() {
        this.loppu = false;
        this.kentta = new Kentta();
        
        
        while(loppu==false)
        {
            this.kuvio=new Kuvio();
            while(this.kuvio.sijaintiAlhaalla().getY()<0)
            {
                this.kuvio.liiku();
                try{
                Thread.sleep(1024);
                }catch(Exception e)
                {
                    System.out.println("virhe palikan liikkumisessa");
                }
            }
            
            
            
            
            
            
        }
        

    }

}
