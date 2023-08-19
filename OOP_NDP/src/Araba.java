public class Araba {
    String renk;
    String marka;
    double fiyat;
    String model;
    int uretim_yili;
    public void fiyatsoyle(){
        System.out.println("fiyat" +fiyat);
    }
    public void dur(){
        System.out.println("durdum");
    }
    public void markanNe(){
        System.out.println(marka);
    }
    Araba(String marka, String renk,int fiyat){
        this.marka=marka;
        this.renk=renk;
        this.fiyat=fiyat;
    }
}
