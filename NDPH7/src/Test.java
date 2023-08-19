public class Test {
    public static void main(String[] args) {
    Ogrenci ogrenci1=new Ogrenci();
      /*  ogrenci1.AD="ahmet";
        ogrenci1.SOYAD="eser";
        ogrenci1.NO=146;
        System.out.println(ogrenci1.AD);
        Ogrenci ogrenci2=new Ogrenci();
        ogrenci1.AD="nisa";
        ogrenci1.SOYAD="esr";
        ogrenci1.NO=154;*/

    }

}
class Ogrenci{
    String AD;
      String SOYAD;
     int NO;
        public Ogrenci=(String AD,int No)
    public void setSOYAD(String SOYAD) {
        this.SOYAD = SOYAD;
    }

    public void setNO(int NO) {
        this.NO = NO;
    }

    public void setAD(String AD) {
        this.AD = AD;
    }

    public void adinisoyle(){
        System.out.println("adim"+AD);
    }
    public void NOsoyle(){
        System.out.println("yas"+NO);
    }

}