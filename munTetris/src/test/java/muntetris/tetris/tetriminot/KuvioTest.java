/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muntetris.tetris.tetriminot;

import java.util.ArrayList;
import muntetris.tetris.Kentta;
import muntetris.tetris.Rivit;
import muntetris.tetris.tetriminot.Kuvio;
import muntetris.tetris.tetriminot.Palikka;
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
public class KuvioTest {

    Kuvio kuvio;
    Rivit rivit;

    public KuvioTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }
    //Metodit alkavat olla riippuvaisia muistakin luokista, sen takia useamman olion luonti tässä, jottei tule nullpointerexceptionia

    @Before
    public void setUp() {
        kuvio = new Kuvio();
        Kentta kentta=new Kentta();
        rivit=new Rivit();
        kentta.asetaRivit(rivit);
       kuvio.haeKentta(kentta);
       kentta.asetaKuvio(kuvio);
    }

    /**
     * @After public void tearDown() { }*
     */
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //


    

    @Test

    public void kuvionArvonta() //testataan ääreisarvoilla että arvonta toimii
    {
        boolean testi = false;
        while (testi == false) {
            if (kuvio.getTyyppi() != 0) {
                this.kuvio = new Kuvio();

            } else {
                testi = true;
            }

        }
        testi = false;

        while (testi == false) {
            if (kuvio.getTyyppi() != 5) {
                this.kuvio = new Kuvio();

            } else {
                testi = true;
            }

        }

        assertEquals(testi, true);
    }

    @Test

    public void kuvionArvonta2() //testataan että kuvion luonnin ääreisarvot pitävät
    {
        boolean testi = true;
        for (int i = 0; i < 50; i++) {
            this.kuvio = new Kuvio();
            if (this.kuvio.getTyyppi() < 0 && this.kuvio.getTyyppi() > 6) {
                testi = false;
            }

        }

        assertEquals(testi, true);

    }
    @Test

    public void kuvioLiikkuuOikealle() {
        int alku = kuvio.sijaintiOikealla().getX();
        alku += 5;
        if (alku > 9) {
            alku = 9;
        }
        for (int i = 0; i < 10; i++) {
           this.kuvio.liikutaOikealle();
        }
        int loppu =kuvio.sijaintiOikealla().getX();

        assertEquals(alku, loppu);
    }

@Test

    public void kuvioLiikkuuVasemmalle() {
        int alku = kuvio.sijaintiVasemmalla().getX();
        alku -= 5;
        for (int i = 0; i < 5; i++) {
            kuvio.liikutaVasemmalle();
        }
        int loppu = kuvio.sijaintiVasemmalla().getX();

        assertEquals(alku, loppu);
    }

    @Test

    public void laidat() {
        for (int i = 0; i < 30; i++) {
            kuvio.liikutaVasemmalle();
        }
        
        assertEquals(kuvio.sijaintiVasemmalla().getX(), 0);
        for (int i = 0; i < 30; i++) {
            kuvio.liikutaOikealle();

        }
        assertEquals(9, kuvio.sijaintiOikealla().getX());
    }

   

    @Test

    public void pysyyRajoissa() //testataan, että jos kuviota kierretään kentän laidassa, pysyykö se kentällä
    {
        boolean testi = true;

        for (int i = 0; i < 30; i++) {
            kuvio.liikutaOikealle();
        }
        kuvio.kierra();

        int oikealla = kuvio.sijaintiOikealla().getX();
        if (oikealla > 9) {
            testi = false;
        }
        for (int i = 0; i < 30; i++) {
            kuvio.liikutaVasemmalle();
        }
        kuvio.kierra();
        int vasemmalla = kuvio.sijaintiVasemmalla().getX();
        if (vasemmalla < 0) {
            testi = false;
        }

        assertEquals(true, testi);

    }

    @Test
    public void liikuttaminenAlaspain() {
        //kuvio=new Kuvio();
        int y = kuvio.sijaintiAlhaalla().getY();
        for (int i = 0; i < 5; i++) {
            kuvio.liiku();
        }
        assertEquals(kuvio.sijaintiAlhaalla().getY(), y + 5);
    }
    @Test
    public void kentallaOlevatPalikat()
    {
        rivit.lisaaPalikka(new Palikka(3, 0));
        rivit.lisaaPalikka(new Palikka(3, 1));
        rivit.lisaaPalikka(new Palikka(3, 2));
        rivit.lisaaPalikka(new Palikka(3, 3));
        for(int i=0; i<7; i++)
        {
            this.kuvio.liikutaVasemmalle();
        }
        assertEquals(4, this.kuvio.sijaintiVasemmalla().getX());
        rivit.lisaaPalikka(new Palikka(4, 6));
        rivit.lisaaPalikka(new Palikka(5, 6));
        rivit.lisaaPalikka(new Palikka(6, 6));
        rivit.lisaaPalikka(new Palikka(7, 6));
        boolean testi;
        for(int i=0; i<7; i++)
        {
            testi=this.kuvio.liiku();
        }
        assertEquals(5, this.kuvio.sijaintiAlhaalla().getY());
        
    }
    @Test 
    public void kierto()
    {
        
    }

}
