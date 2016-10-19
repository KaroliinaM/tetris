/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package muntetris.tetris;

import muntetris.tetris.Rivit;
import muntetris.tetris.tetriminot.Palikka;
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
    public void rivinPoisto()
    {
        this.rivit.lisaaPalikka(new Palikka(1, 2));
        this.rivit.lisaaPalikka(new Palikka(1, 1));
        this.rivit.lisaaPalikka(new Palikka(1, 3));
        this.rivit.lisaaPalikka(new Palikka(2, 2));
        this.rivit.lisaaPalikka(new Palikka(2, 1));
        this.rivit.poistaRivi(2);
        for(int i=0;i<this.rivit.PalikoidenMaara(); i++)
        {
            System.out.println("palikka arvolla " + rivit.getPalikka(i).getY()+ "jäljellä");
        }
        
        
    }
    
   
}
