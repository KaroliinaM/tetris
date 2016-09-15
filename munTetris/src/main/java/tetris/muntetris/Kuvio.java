/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tetris.muntetris;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kmietola
 */
public class Kuvio {
    
     private int tyyppi;
    private int x;
    private int y;
    private Palikka ekapalikka;
    private Palikka tokapalikka;
    private Palikka kolmaspalikka;
    private Palikka neljaspalikka;
    private ArrayList<Palikka> palikat;
    private int kierto;
    
    
    public Kuvio()
    {
        Random arpa=new Random();
        tyyppi=arpa.nextInt(7);
        this.palikat=new ArrayList<Palikka>();
        kierto=0;
        
        if(tyyppi==0) //neliö
        {
           this.ekapalikka=new Palikka(6, 0);
           palikat.add(ekapalikka);
           this.tokapalikka=new Palikka(7, 0);
           palikat.add(tokapalikka);
           this.kolmaspalikka=new Palikka(6, 1);
           palikat.add(kolmaspalikka);
           this.neljaspalikka=new Palikka(7, 1);
           palikat.add(neljaspalikka);
        }
        else if(tyyppi==1) //pitkä
        {
           this.ekapalikka=new Palikka(6, 0);
           palikat.add(ekapalikka);
           this.tokapalikka=new Palikka(6, 1);
           palikat.add(tokapalikka);
           this.kolmaspalikka=new Palikka(6, 2);
           palikat.add(kolmaspalikka);
           this.neljaspalikka=new Palikka(6, 3);
           palikat.add(neljaspalikka);
        }
        else if(tyyppi==2)//l oikealle
        {
           this.ekapalikka=new Palikka(6, 0);
           palikat.add(ekapalikka);
           this.tokapalikka=new Palikka(7, 0);
           palikat.add(tokapalikka);
           this.kolmaspalikka=new Palikka(6, 1);
           palikat.add(kolmaspalikka);
           this.neljaspalikka=new Palikka(6, 2);
           palikat.add(neljaspalikka);
        }
        else if(tyyppi==3)//l vasemmalle
        {
           this.ekapalikka=new Palikka(6, 0);
           palikat.add(ekapalikka);
           this.tokapalikka=new Palikka(7, 0);
           palikat.add(tokapalikka);
           this.kolmaspalikka=new Palikka(7, 1);
           palikat.add(kolmaspalikka);
           this.neljaspalikka=new Palikka(7, 2);
           palikat.add(neljaspalikka);
        }
        else if(tyyppi==4)//suunnikas oikealle
        {
           this.ekapalikka=new Palikka(6, 0);
           palikat.add(ekapalikka);
           this.tokapalikka=new Palikka(7, 0);
           palikat.add(tokapalikka);
           this.kolmaspalikka=new Palikka(7, 1);
           palikat.add(kolmaspalikka);
           this.neljaspalikka=new Palikka(8, 1);
           palikat.add(neljaspalikka);
        }
        else if(tyyppi==5)//suunnikas vasemmalle
        {
           this.ekapalikka=new Palikka(7, 0);
           palikat.add(ekapalikka);
           this.tokapalikka=new Palikka(7, 1);
           palikat.add(tokapalikka);
           this.kolmaspalikka=new Palikka(6, 1);
           palikat.add(kolmaspalikka);
           this.neljaspalikka=new Palikka(6, 2);
           palikat.add(neljaspalikka);
        }
        else if(tyyppi==6)//kolmipiikki
        {
           this.ekapalikka=new Palikka(6, 0);
           palikat.add(ekapalikka);
           this.tokapalikka=new Palikka(7, 0);
           palikat.add(tokapalikka);
           this.kolmaspalikka=new Palikka(8, 0);
           palikat.add(kolmaspalikka);
           this.neljaspalikka=new Palikka(7, 1);
           palikat.add(neljaspalikka);
        }
        
        

 
        
  
    }
    public int getTyyppi()
    {
        return tyyppi;
    }
    
    public Palikka palikanSijainti(int x)
    {
        Palikka palautettava=palikat.get(x);
        
        
        return palautettava;
    }
    public void liikutaOikealle()
    {
        for(int i=0; i <palikat.size(); i++)
        {
            if(this.sijaintiOikealla().getX()<12)
            {
           int arvo=palikat.get(i).getX();
           arvo++;
           palikat.get(i).setX(arvo);          
            }
        }
        
    }
    public void liikutaVasemmalle()
    {
        for(int i=0; i <palikat.size(); i++)
        {
            if(this.sijaintiVasemmalla().getX()>0)
            {
           int arvo=palikat.get(i).getX();
           arvo--;
           palikat.get(i).setX(arvo);   
            }
            
        }
        
    }
    
    public ArrayList<Palikka> kuviotesti()
    {
        return palikat;
    }
    public Palikka sijaintiOikealla()
    {
        Palikka oikealla=palikat.get(0);
        for(int i=1; i<palikat.size();i++)
        {
           if(palikat.get(i).getX()>oikealla.getX())
           {
               oikealla=palikat.get(i);
           }
        }
        return oikealla;
    }
    public Palikka sijaintiVasemmalla()
    {
        Palikka vasemmalla=palikat.get(0);
        for(int i=1; i<palikat.size();i++)
        {
            if(palikat.get(i).getX()>vasemmalla.getX())
           {
               vasemmalla=palikat.get(i);
           }
        }
        return vasemmalla;
    }
    
    public void kierra()
    {
        if(this.tyyppi==1)
        {
            if(kierto==0)
            {
                
               this.palikat.get(0).setX(6);
               this.palikat.get(0).setY(0);

               this.palikat.get(1).setX(7);
               this.palikat.get(1).setY(0);

               this.palikat.get(2).setX(8);
               this.palikat.get(2).setY(0);

               this.palikat.get(3).setX(9);
               this.palikat.get(3).setY(0);
               this.testaaRajat();
               kierto++;
            }
            else if(kierto==1)
            {
                
               this.palikat.get(0).setX(6);
               this.palikat.get(0).setY(0);

               this.palikat.get(1).setX(6);
               this.palikat.get(1).setY(1);

               this.palikat.get(2).setX(6);
               this.palikat.get(2).setY(2);

               this.palikat.get(3).setX(6);
               this.palikat.get(3).setY(3);
               this.testaaRajat();
               kierto--;
            }
            
            
        }
        if(this.tyyppi==2)
        {
            if(kierto==0)
            {
                this.palikat.get(0).setX(5);
               this.palikat.get(0).setY(0);

               this.palikat.get(1).setX(6);
               this.palikat.get(1).setY(0);

               this.palikat.get(2).setX(7);
               this.palikat.get(2).setY(0);

               this.palikat.get(3).setX(7);
               this.palikat.get(3).setY(1);
               this.testaaRajat();
                kierto++;
            }
            else if(kierto==1)
            {
                this.palikat.get(0).setX(7);
               this.palikat.get(0).setY(0);

               this.palikat.get(1).setX(7);
               this.palikat.get(1).setY(1);

               this.palikat.get(2).setX(7);
               this.palikat.get(2).setY(2);

               this.palikat.get(3).setX(6);
               this.palikat.get(3).setY(2);
               this.testaaRajat();
               kierto++; 
            }
            else if(kierto==2)
            {
                this.palikat.get(0).setX(6);
               this.palikat.get(0).setY(0);

               this.palikat.get(1).setX(6);
               this.palikat.get(1).setY(1);

               this.palikat.get(2).setX(7);
               this.palikat.get(2).setY(1);

               this.palikat.get(3).setX(1);
               this.palikat.get(3).setY(8);
                this.testaaRajat();
                kierto++;
            }
            else if(kierto==3)
            {
                this.palikat.get(0).setX(6);
               this.palikat.get(0).setY(0);

               this.palikat.get(1).setX(7);
               this.palikat.get(1).setY(0);

               this.palikat.get(2).setX(6);
               this.palikat.get(2).setY(1);

               this.palikat.get(3).setX(6);
               this.palikat.get(3).setY(2);
                this.testaaRajat();
                kierto=0;
            }
 
            
        }
        if(this.tyyppi==3)
        {
            
        }
        if(this.tyyppi==4)
        {
            
        }
        if(this.tyyppi==5)
        {
            
        }
        if(this.tyyppi==6)
        {
            
        }
    }
    
    public void testaaRajat()
    {
        while(this.sijaintiOikealla().getX()>12)
        {
            this.liikutaVasemmalle();
        }
        while(this.sijaintiVasemmalla().getX()<0)
        {
            this.liikutaOikealle();
        }
    }
    
}
