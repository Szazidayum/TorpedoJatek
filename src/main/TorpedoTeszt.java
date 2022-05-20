package main;

public class TorpedoTeszt {
    static int poz;
    public static void main(String[] args) {
       tesztLoves(poz); 
    }
    public static String tesztLoves(int poz){
        Hajo hajo = new Hajo([2,3,4]);
        String t = hajo.talalat(4);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        return null;

}
}

