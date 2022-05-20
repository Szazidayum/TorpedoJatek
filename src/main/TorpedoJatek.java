package main;
    import java.util.Scanner;

public class TorpedoJatek {

    public static int palya = 7;
    public static void main(String[] args) {
        loves(4);
        }
    
    public static String loves(int poz){
        int[] hajoHossz = new int[3];
        int hely = (int)(Math.random()*5)+1;
        hajoHossz[0] = hely;
        hajoHossz[1] = hely+1;
        hajoHossz[2] = hely+2;
        Hajo hajo = new Hajo(hajoHossz);
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        return null;

}

    private static int lovesBeker(int[] hajoHossz) {
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
        return 0;
    }
}
