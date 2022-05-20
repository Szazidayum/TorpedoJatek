package main;

import java.util.Random;

public class Hajo {
    private int[] pozicio = new int[3];
    
    
    public Hajo(int[] pozicio) {
        this.pozicio = pozicio;
    }
    
    public String talalat(int poz){
        String talaltE = "";
        for (int i = 0; i < pozicio.length; i++) {
            if (!(pozicio[i]==poz)){
                talaltE="talált";
            }else{
                talaltE="nem talált";
            }
        }
        return talaltE;     
    }

    
}
