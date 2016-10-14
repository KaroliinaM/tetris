**Aihe:** Tarkoituksena luoda tetris-peli. Pelissä käyttäjä kääntää ja siirtää ikkunan yläosasta hitaasti putoavia neljästä  ruudusta muodostuvia erimuotoisia palikoita. Putoamisvauhti kiihtyy pelin edetessä.

Tarkoitus on saada palikoista muodostumaan ruudun alaosaan täysi rivi. Jokaisesta täydestä rivistä saa pisteen, ja rivi katoaa. Peli loppuu, kun ikkuna on täynnä palikoita

Aluksi on tarkoitus saada tehdyksi toimiva peli, jota parantelen tyylillisesti mikäli resurssit riittävät

**Käyttäjät:** Pelaaja (yksinpeli)

**Käyttäjän toiminnot:** tetris-palikoiden ohjaaminen space-painikkeella (palikan kääntäminen) ja nuolipainikkeilla (palikan siirtäminen oikea-vasen sekä sen pudotus riviin) 

#Rakennekuvaus
Tetriksen kuviot rakentuvat palikoista. Kullekin tetriksen kuviolleon oma luokkansa, abstrakti luokka tetrimino nivoo ne yhteen. Kuvio-luokka määrittelee niiden käyttäytymisen. 

Kenttä-luokka mudostaa sovelluslogiikan kentän. alas kasautuvat palikat on tarkoitus tallentaa rivi-olioihin, jotka on tallennettu rivit-olioon.

Graafiseen käyttöjärjestelmään kuvat piirretään jpanelia käyttäen alusta-olioon. piirtäminen tapahtuu kentää ja kuvio-luokkia hyväksi käyttäen.


![luokkakaavio](Luokkakaavio.png)

![Käyttötapaus pelin aloitus](Kayttotapaus1.png)

![Käyttötapaus kuvion siirto](Kayttotapaus2.png)
