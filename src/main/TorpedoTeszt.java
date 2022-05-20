package main;

import java.util.Scanner;

public class TorpedoTeszt {
    public static void main(String[] args) {
        int[] hajoHossz = new int[3];
       tesztLoves(4,hajoHossz);

    }
    public static String tesztLoves(int poz,int[] hajoHossz){
        
        int hely = (int)(Math.random()*5)+1;
        hajoHossz[0] = hely;
        hajoHossz[1] = hely+1;
        hajoHossz[2] = hely+2;
        Hajo hajo = new Hajo(hajoHossz);
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        return null;

}
public static void lovesBeker(int[] hajoHossz) {
        System.out.println("Kérem adjon meg egy tippet(0-7): ");
        Scanner sc = new Scanner(System.in);
        int tipp = sc.nextInt();
        for (int i = 0; i <hajoHossz.length ; i++) {
            if(tipp==hajoHossz[i]){
                System.out.println("talált");
            }else{
                System.out.println("nem talált");
            }
        }
}
}

