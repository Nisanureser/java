public class test {
    public static void main(String[] args) {
      /*  ogrenci o1=new ogrenci();
        o1.ad="nisa";
        o1.soyad="eser";
        o1.no=54;
        ogrenci o2=new ogrenci();
        o2=o1;
        o2.ad="baby";
        System.out.println(o1.soyad);
        o2.adinisoyle();
        o1.adinisoyle();*/
        ogrenci o3=new ogrenci("aa","bb",34);
        ogrenci o4=new ogrenci("cc","kş",54);
        //System.out.println(o3.ad);
        o3.adinisoyle();
        o3.setAd("öldüm");
        o3.adinisoyle();
        System.out.println(o3.getSoyad());
    }


}
class ogrenci{

     private String ad;
     private String soyad;
    private int no;

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getNo() {
        return no;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public ogrenci(String ad, String soyad, int no){
        setAd(ad);
        this.soyad=soyad;
        this.no=no;


    }
    public void adinisoyle() {
        System.out.println("benim adim "+ad);
    }
}

