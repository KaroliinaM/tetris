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
public class SuunnikasOikealleTest {
    Tetrimino tetrimino;
    
    public SuunnikasOikealleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tetrimino=new SuunnikasOikealle();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
@Test
    public void suunnikasOikealleMuodostuu() {
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
    public void korkeus()
    {
        assertEquals(2, this.tetrimino.korkeus());
        
    }
    @Test
    public void alhaalla()
    {
        assertEquals(1, this.tetrimino.alhaalla().getY());
    }
    public void sivuilla()
    {
        assertEquals(6, this.tetrimino.vasemmalla().getX());
        assertEquals(8, this.tetrimino.oikealla().getX());
    }
    
    @Test
    public void kierto()
    {
        boolean testi=true;
        int x1=this.tetrimino.getPalikka(0).getX();
        int y1=this.tetrimino.getPalikka(0).getY();
        int x2=this.tetrimino.getPalikka(1).getX();
        int y2=this.tetrimino.getPalikka(1).getY();
        int x3=this.tetrimino.getPalikka(2).getX();
        int y3=this.tetrimino.getPalikka(2).getY();
        int x4=this.tetrimino.getPalikka(3).getX();
        int y4=this.tetrimino.getPalikka(3).getY();
        
        tetrimino.kierra();
        if(x1==this.tetrimino.getPalikka(0).getX()&& y1==this.tetrimino.getPalikka(0).getY())
        {
            testi=false;
        }
        if(x4==this.tetrimino.getPalikka(3).getX()&& y4==this.tetrimino.getPalikka(3).getY())
        {
            testi=false;
        }
        assertEquals(testi, true);
        assertEquals(3, this.tetrimino.korkeus());
        tetrimino.kierra();
        if(x1!=this.tetrimino.getPalikka(0).getX()|| y1!=this.tetrimino.getPalikka(0).getY())
        {
            testi=false;
        }
        if(x2!=this.tetrimino.getPalikka(1).getX()|| y2!=this.tetrimino.getPalikka(1).getY())
        {
            testi=false;
        }
        if(x3!=this.tetrimino.getPalikka(2).getX()|| y3!=this.tetrimino.getPalikka(2).getY())
        {
            testi=false;
        }
        if(x4!=this.tetrimino.getPalikka(3).getX()|| y4!=this.tetrimino.getPalikka(3).getY())
        {
            testi=false;
        }
        assertEquals(testi, true);
        assertEquals(2, this.tetrimino.korkeus());
    }
}
