package main;

import java.util.Random;

public class Hajo {
    private int[] pozicio = new int[3];
    
    public String talalat(int poz){
        String talaltE = "";
        poz = (int)(Math.random()*5)+1;
        poz = pozicio[1];
        int poz2 = pozicio[1]+1;
        int poz3 = pozicio[1]+2;
        if (poz==4){
            talaltE = "talált";
        }
        return talaltE;     
    }

    public Hajo(int[] pozicio) {
        this.pozicio = pozicio;
    }
}
