/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.tetris;

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
public class NopeusTest {
    Nopeus nopeus;
    public NopeusTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        nopeus=new Nopeus(1000, 5);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void napeudenLaskeminen() {
         int pisteet=4;
         nopeus.laskeNopeus(pisteet);
         assertEquals(1000, nopeus.getNopeus());
         pisteet++;
         nopeus.laskeNopeus(pisteet);
         assertEquals(750, nopeus.getNopeus());
         nopeus.laskeNopeus(pisteet);
         assertEquals(750, nopeus.getNopeus());
         
     }
    
}
