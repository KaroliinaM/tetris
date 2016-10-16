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
public class PitkaTest {
    Tetrimino tetrimino;
    
    public PitkaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tetrimino=new Pitka();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void pitkaMuodostuu() {
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
    @Test
    public void kierto()
    {
        boolean testi=true;
        int x=this.tetrimino.getPalikka(0).getX();
        int y=this.tetrimino.getPalikka(0).getY();
        tetrimino.kierra();
        if(x==this.tetrimino.getPalikka(0).getX()&& y==this.tetrimino.getPalikka(0).getY())
        {
            testi=false;
        }
        assertEquals(testi, true);
        tetrimino.kierra();
        if(x!=this.tetrimino.getPalikka(0).getX()&& y!=this.tetrimino.getPalikka(0).getY())
        {
            testi=false;
        }
        assertEquals(testi, true);
    }
}
