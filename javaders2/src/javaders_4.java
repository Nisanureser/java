

/* string özellikler */

public class javaders_4 {
        public static void main(String[]args) {
            String yazi,yazi2,yazi3,yazi4 ;
            yazi="denedik yiene "+" ask bitti";
            yazi2=" ama bitmemeliydi";
            yazi3=yazi+ yazi2;
            System.out.println(yazi);
            System.out.println(yazi.length());
            System.out.println(yazi2);
            System.out.println(yazi2.length());
            System.out.println(yazi3);
            System.out.println(yazi3.length());
            yazi4=yazi2.concat(yazi3);
            /* yazi 2 ye yazi 3 ekledi onu da yazi4 e ekledi*/
            System.out.println(yazi4);
            System.out.println(yazi4.length());
                int a,b,c,x;
                char k;
            a=yazi.indexOf('e');
            System.out.println(a);
            b=yazi.lastIndexOf('e');
            System.out.println(b);
            c=yazi.charAt(2);
            System.out.println(c);
            k=yazi.charAt(2);
            System.out.println(k);

          /*  indexof kelimein kaçıncı ilk  harfi oldugunu yazar lastindexof ta son kaçıncıoluğunu
            yoksa -1 döner büyük küçük harf önemlşi */

            /* charat() ascıı kodu yazdırır */

            x=yazi.compareTo(yazi2);
            System.out.println(x);
            /* compareto  iki değeri karşılaştırır aynıysa 0 döndürür
            değilsse farklı sayiler comparetoıgnorcase ise büyük küçük harf önem arz etmeden bKr  */

            System.out.println(yazi.contains("ene"));

             /*contain bir metin diğer metini içeriyor mu diye bakar*/


            System.out.println(yazi.endsWith("ene"));
            /* ensWith bi şeyle bitiyor mu diye bakılıyo*/
            System.out.println(yazi.replace('e','a'));
            /* replace bi harfi başka harfe değişiyo */
            System.out.println(yazi.replaceAll("en","as"));
            System.out.println(yazi.replaceFirst("en","as"));
            /* toLowarCase() küçük harfe dönüştürüyo toUpperCase() büyük harfe
            /* a=yazi.length();*/
        }

}
