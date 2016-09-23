/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tetris.muntetris;

import java.util.ArrayList;
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
public class KuvioTest {
    
    Kuvio kuvio;
    
    public KuvioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        kuvio= new Kuvio();
    }
    
   /** @After
    public void tearDown() {
    }**/

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
   public void hello() {}
   
   @Test
   public void hello1() {System.out.println("Kuvio on" +kuvio.getTyyppi());}

    
   /** @Test
    public void kuviomuodostuu() {
      
      
      ArrayList lista =kuvio.kuviotesti();
      int pituus=lista.size();

      assertEquals(pituus, 4);
  }
    @Test
    
    public void kuvioLiikkuuOikealle()
    {
        int alku=kuvio.sijaintiOikealla().getX();
        alku+=5;
        if(alku>12)
        {
            alku=12;
        }
        for(int i=0; i<5; i++)
        {
            kuvio.liikutaOikealle();
        }
        int loppu=kuvio.sijaintiOikealla().getX();
        
        assertEquals(alku, loppu);
    }
    @Test
    
    public void kuvioLiikkuuVasemmalle()
    {
        int alku=kuvio.sijaintiVasemmalla().getX();
        alku-=5;
        for(int i=0; i<5; i++)
        {
            kuvio.liikutaVasemmalle();
        }
        int loppu=kuvio.sijaintiVasemmalla().getX();
        
        assertEquals(alku, loppu);
    }
    
    @Test
    
    public void vasenLaita()
    {
        for(int i=0; i<30; i++)
        {
            kuvio.liikutaVasemmalle();
        }
        int sijainti=kuvio.sijaintiVasemmalla().getX();
        
        assertEquals(sijainti, 0);
    }
    
    @Test
    
    public void kuvionArvonta() //testataan ääreisarvoilla että arvonta toimii
    {
        boolean testi=false;
        while(testi==false)
        {
            if(kuvio.getTyyppi()!=0)
            {
                this.kuvio=new Kuvio();
                
            }
            else
            {
                testi=true;
            }
            
        }
        testi=false;
        
        while(testi==false)
        {
            if(kuvio.getTyyppi()!=5)
            {
                this.kuvio=new Kuvio();
                
            }
            else
            {
                testi=true;
            }
            
        }        
        
        assertEquals(testi, true);
    }
    
    @Test
    
    public void kuvionArvonta2() //testataan että kuvion luonnin ääreisarvot pitävät
    {
        boolean testi=true;
        for(int i=0; i<50; i++)
        {
            this.kuvio=new Kuvio();
            if(this.kuvio.getTyyppi()<0 && this.kuvio.getTyyppi()>6)
            {
                testi=false;
            }
            
        }
        
        assertEquals(testi, true);
        
    }
    
    @Test
    
    public void pitkulanKierto() //testataan, siirtyykä palikan pääty kiertäessä ja palautuuko paikalleen
    {
        boolean testi=false;
        while(testi==false)
        {
            if(kuvio.getTyyppi()!=1)
            {
                this.kuvio=new Kuvio();
                
            }
            else
            {
                testi=true;
            }
            
        }
        //this.kuvio=haluttuKuvio(1);
        //boolean testi=true;
        Palikka alussa=kuvio.palikanSijainti(3);
        int alussax=alussa.getX();
        System.out.println(alussax);
        
        
        
        kuvio.kierra();
        
        Palikka valissa=kuvio.palikanSijainti(3);
        int valissax=valissa.getX();
        System.out.println(valissax);
 
        
        if(alussax==valissax)
        {
            testi=false;
        }
        

        
        kuvio.kierra();
        
        Palikka lopussa=kuvio.palikanSijainti(3);
        
        int lopussax=lopussa.getX();
        
        if(alussax!=lopussax)
        {
            testi=false;
        }
        
        assertEquals (true, testi);        
        
    }
   @Test
    
    public void lOikealleKierto()
    {
        boolean testi=false;
        while(testi==false)
        {
            if(kuvio.getTyyppi()!=2)
            {
                this.kuvio=new Kuvio();
                
            }
            else
            {
                testi=true;
            }
            
        }
        //this.kuvio=haluttuKuvio(2);
        //boolean testi=true;
        
        Palikka alussa=kuvio.palikanSijainti(3);
        int alussax=alussa.getX();
        
        for(int i=0; i<2;i++)
        {
        
        kuvio.kierra();
        
        Palikka valissa=kuvio.palikanSijainti(3);
        int valissax=valissa.getX();
 
        
        if(alussax==valissax)
        {
            testi=false;
        }
        alussax=valissax;
        }
        
        kuvio.kierra();
        
        Palikka lopussa=kuvio.palikanSijainti(3);
        alussax=alussa.getX();
        
        int lopussax=lopussa.getX();
        
        if(alussax!=lopussax)
        {
            testi=false;
        }
        
        assertEquals (true, testi);         
        
    }
    @Test
    
    public void pysyyRajoissa() //testataan, että jos kuviota kierretään kentän laidassa, pysyykö se kentällä
    {
        boolean testi=false;
        while(testi==false)
        {
            if(kuvio.getTyyppi()!=1)
            {
                this.kuvio=new Kuvio();
                
            }
            else
            {
                testi=true;
            }
            
        }
        
        for(int i=0; i<30;i++)
        {
            kuvio.liikutaOikealle();
        }
        kuvio.kierra();
        
        int oikealla=kuvio.sijaintiOikealla().getX();
        if(oikealla>12)
        {
            testi=false;
        }
        
        assertEquals(true, testi);
        
    }
    @Test
    
    public void pysyyRajoissa2()  //kats.edellinen, toinen laita
    {
        boolean testi=false;
        while(testi==false)
        {
            if(kuvio.getTyyppi()!=2)
            {
                this.kuvio=new Kuvio();
                
            }
            else
            {
                testi=true;
            }
            
        }
        
        for(int i=0; i<30;i++)
        {
            kuvio.liikutaVasemmalle();
        }
        for(int i=0; i<3; i++)
        {
            this.kuvio.kierra();
            
            int vasemmalla=kuvio.sijaintiVasemmalla().getX();
            if(vasemmalla<0)
            {
                testi=false;
            }
        }
        
        
        assertEquals(true, testi);
        
    }**/
    
    
   /** public Kuvio haluttuKuvio(int tyyppi)
    {
        Kuvio kuvio=this.kuvio;
        boolean testi=false;
        while(testi==false)
        {
            System.out.println("hei");
            if(kuvio.getTyyppi()!=tyyppi)
            {
                this.kuvio=new Kuvio();
                
            }
            else
            {
                testi=true;
            }
            
        }
        return kuvio;
    }**/
        
        
   
            
    
}
