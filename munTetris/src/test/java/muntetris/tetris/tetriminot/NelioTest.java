/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.tetris.tetriminot;

import java.util.ArrayList;
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
public class NelioTest {
    Tetrimino tetrimino;
    
    public NelioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tetrimino=new Nelio();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void nelioMuodostuu() {
    ArrayList lista=this.tetrimino.palautaKuvio();
    assertEquals(lista.size(), 4);
    
    }
    @Test
    public void palikanHaku()
    {
        ArrayList lista=this.tetrimino.palautaKuvio();
        assertEquals(this.tetrimino.getPalikka(3), lista.get(3));
        assertEquals(this.tetrimino.getPalikka(0), lista.get(0));
    }
}
