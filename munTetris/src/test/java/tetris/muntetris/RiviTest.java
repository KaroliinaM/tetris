/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tetris.muntetris;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author kmietola
 */
public class RiviTest {
    Rivi rivi;
    
    public RiviTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       Rivi rivi=new Rivi();
    }
    
  /**  @After
    public void tearDown() {
    }**/

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
   public void hello() {}
   
  
    
   @Test
    public void riviMuodostuu()
    {
    Rivi rivi=new Rivi();
        boolean testi=true;
        //System.out.println(this.rivi.getRivinKoko());
        ArrayList<Boolean> testirivi=rivi.annaRivi();
        if(testirivi.size()!=12)
        {
            testi=false;
        }
        for(int i=0; i<testirivi.size(); i++)
        {
            if(testirivi.get(i)!=false)
            {
                testi=false;
            }
        }
        
        assertEquals(testi, true);
    }
    
    @Test
    public void pituudenHakeminen()
    {
        Rivi rivi=new Rivi();
        
        assertEquals(12, rivi.annaRivinkoko());
    }
    
    
    @Test
    public void palikanAsetus()
    {
        Rivi rivi=new Rivi();
        boolean t=false;
        rivi.asetaPalikka(5);
        for(int i=0; i<rivi.annaRivinkoko(); i++)
        {
            if(rivi.annaPalikka(i)==true)
            {
                t=true;
            }
        }
        assertEquals(t, true);
        
        
    }    
    
    @Test
    public void riviTaynna()
    {
        Rivi rivi=new Rivi();
        for(int i=0; i<3; i++)
        {
            rivi.asetaPalikka(i);
        }
        
        assertEquals(false, rivi.onkoTaynna());
        
       for(int i=0; i<rivi.annaRivinkoko(); i++)
        {
            rivi.asetaPalikka(i);
        }
        
        assertEquals(true, rivi.onkoTaynna());
        
    }
            
    
    
    /** @Test
    
    public void rivinMuuttaminen()
    {
        boolean testi=false;
        int j=3;
        this.rivi.asetaPalikka(j);
        ArrayList<Boolean> testirivi=this.rivi.annaRivi();
        
        for(int i=0;i<testirivi.size(); i++)
        {
            if(testirivi.get(i)!=false)
            {
                testi=true;
            }
        }
        
        assertEquals(testi, true);
    }**/
}
