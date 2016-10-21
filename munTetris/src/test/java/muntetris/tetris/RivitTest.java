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
        rivit.lisaaPalikka(new Palikka(4, 4));
        rivit.lisaaPalikka(new Palikka(4, 2));
        rivit.lisaaPalikka(new Palikka(4, 5));
        rivit.lisaaPalikka(new Palikka(3, 4));
        rivit.lisaaPalikka(new Palikka(2, 5));
        rivit.lisaaPalikka(new Palikka(4, 2));
        rivit.lisaaPalikka(new Palikka(5, 4));

    }
    
  /**  @After
    public void tearDown() {
    }
**/
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void lisaaminenJaHakeminen() {
 
    assertEquals(7, rivit.palikoidenMaara());
    assertEquals(4, rivit.getPalikka(2).getX());
    assertEquals(2, rivit.getPalikka(5).getY());
    
    
    
    }
    
    @Test
    public void rivinPoisto()
    {

        this.rivit.poistaRivi(4);
        assertEquals(4, rivit.palikoidenMaara());
        boolean testi=true;
        for(int i=0; i<rivit.palikoidenMaara(); i++)
        {
            if(rivit.getPalikka(i).getY()==4)
            {
                testi=false;
            }
           
        }
        assertEquals(true, testi);
        assertEquals(3, rivit.getPalikka(0).getY());
        
        
        
    }
    @Test
    public void rivitTayttyminen()
    {
        rivit.lisaaPalikka(new Palikka(0, 4));
        rivit.lisaaPalikka(new Palikka(1, 4));
        rivit.lisaaPalikka(new Palikka(2, 4));
        rivit.lisaaPalikka(new Palikka(6, 4));
        rivit.lisaaPalikka(new Palikka(7, 4));
        rivit.lisaaPalikka(new Palikka(8, 4));
        assertEquals(0, rivit.riviTaysi());
        rivit.lisaaPalikka(new Palikka(9, 4));
        assertEquals(4, rivit.riviTaysi());

    }
    
    @Test
    public void suurinY()
    {

       assertEquals(5, rivit.suurinY());
    }

   
}
