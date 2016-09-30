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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rivi rivi=new Rivi();
        
        for(int i=0; i<10; i++)
        {
           System.out.println(rivi.annaRivinkoko());
        }
        rivi.asetaPalikka(4);
        
      /**  Peli p=new Peli();
        
        
        for(int i=0; i<5; i++)
            
        {
        try
        {
            Thread.sleep(1024);
            System.out.println("ok");
        }
        catch(Exception e)
        {
         System.out.println("virhe");
        }
        }
        
       // Rivi rivi=new Rivi();
        //int f=rivi.rivinKoko();
        
        // TODO code application logic here**/
    }
    
}
