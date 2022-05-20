package main;

public class TorpedoTeszt {
    public static void main(String[] args) {
       tesztLoves(4);
       
    }
    public static String tesztLoves(int poz){
        int[] hajoHossz = new int[3];
        hajoHossz[0] = 2;
        hajoHossz[1] = 3;
        hajoHossz[2] = 4;
        Hajo hajo = new Hajo(hajoHossz);
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        return null;

}
}

