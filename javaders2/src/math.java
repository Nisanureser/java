public class math {
    public static void main(String[] args) {
      int sayi1,sayi2;
      sayi1=10;
      sayi2=-15;
      double sayi3=-9.7;

      System.out.println(Math.ceil(sayi3)); /*en yakın büyük sayiya yuvarlar*/
        System.out.println(Math.floor(sayi3)); /*en yakın küçük sayiya yuvarlar*/
      System.out.println(Math.abs(sayi3)); /* mutlak değer */
        System.out.println(Math.PI*sayi1);
        System.out.println(Math.sin(30*Math.PI/180));/* radyan cinsinden yazmalısın pi/6 şeklinde sin 30*/
        System.out.println(Math.cos(30*Math.PI/180));
        System.out.println(Math.pow(5,6));/* 5in 6. kuvveti */
        System.out.println(Math.sqrt(25)); /* karakök */
        System.out.println(Math.max(8,78)); /* büyük olanı yazdırır */
        System.out.println(Math.random());/* [0 ile 1)arasında deger dönderir*/
      System.out.println(Math.round(5.6)); /*   sayiya yuvarlıyo 5.4 olsa 5e yuvarlar*/
      int a,b;
      a=Math.round(5.5f); /* f olmalı long olduğu için int sığmıyo */
      System.out.println(a);

      char h;
      h=65;
      System.out.println(h); /* asci tablosunda denk gelen harfi yazdırır*/





    }
}
