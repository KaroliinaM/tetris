/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.tetris.tetriminot;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kape
 */
public class PalikkaTest {
    Palikka palikka;
    
    public PalikkaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        palikka=new Palikka(3, 4);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void xHaku() {
        assertEquals(palikka.getX(), 3);
    }
    
    @Test
    public void yHaku() {
        assertEquals(palikka.getY(), 4);
    }
    
    @Test
    public void alaspain() {
        int y=palikka.getY();
        palikka.yksiAlaspain();
        palikka.yksiAlaspain();
        assertEquals(palikka.getY(), y+2);
    }
    @Test
    
   public void vasemmalle()
   {
       int x=palikka.getX();
       palikka.yksiVasemmalle();
       palikka.yksiVasemmalle();
       palikka.yksiVasemmalle();
       assertEquals(x-3, palikka.getX());
   }
   @Test
   public void oikealle()
   {
       int x=palikka.getX();
       palikka.yksiOikealle();
       palikka.yksiOikealle();
       assertEquals(x+2, palikka.getX());
       
   }
   @Test
   public void ylospain()
   {
       int y=palikka.getY();
       palikka.yksiYlospain();
       assertEquals(y-1, palikka.getY());
   }
}
