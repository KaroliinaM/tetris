/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package muntetris.tetris;

import muntetris.tetris.Rivi;
import muntetris.tetris.Rivit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kmietola
 */
public class RivitTest {
    Rivit rivit;
            
    public RivitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        rivit=new Rivit();

    }
    
  /**  @After
    public void tearDown() {
    }
**/
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
  //  @Test
    //public void hello() {}
    @Test
    public void listanKoko()
    {
        //Rivit rivit=new Rivit();
        assertEquals(rivit.rivienMaara(), 0);
        rivit.lisaaRivi(new Rivi());
        rivit.lisaaRivi(new Rivi());
        assertEquals(rivit.rivienMaara(), 2);
    }
    
    
    
    @Test
     
    public void rivitLisays()
    {
      //Rivit rivit=new Rivit();
        Rivi rivi=new Rivi();
        Rivi toinenRivi=new Rivi();
        rivit.lisaaRivi(rivi);
        rivit.lisaaRivi(toinenRivi);
        assertEquals(2, rivit.rivienMaara());       
        
    }
    
   @Test
    
    public void rivinPoisto()
    {
       //Rivit rivit=new Rivit();
       Rivi rivi=new Rivi();
       Rivi toinenRivi=new Rivi();
       rivit.lisaaRivi(rivi);
       rivit.lisaaRivi(toinenRivi);
       rivit.getRivi(1).asetaPalikka(4);
       rivit.poistaRivi(0);
       assertEquals(1, rivit.rivienMaara());
       assertEquals(true, rivit.getRivi(0).annaPalikka(4));   
        
    }
    
   
}
