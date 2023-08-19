import java.util.Scanner;

public class JavaDers1 {
    public static void main(String[] args ){
        System.out.println("Merhaba Dünya- Hello World");
        //ln alt satıra geçmesini sağlıyo
        System.out.print("ilk ders ");
        System.out.println("eğlenceli değil");
      /*  int a=15;
        int b=20;
        System.err.println((a+b));
        System.out.println(a);
        System.out.println(""+a+b); */
        System.out.println("eğlenceli \n çok sakfclskmv \r senföndrf \"sıkıldım\" \t değil");
        //int c=a+b;
       // System.out.println(c);
        float m=1.5f;
        float n=(float)1.7;
        System.out.println(n);
        System.out.println(m);
        char h='s';
        System.out.println(h);
        boolean w=true;
        boolean q=false;
        System.out.println(w);
        int x = 10;
        int y = 3;
        System.out.println("x+y="+(x+y) );
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + x * y);
        System.out.println("x / y = " + (x / y) );
        System.out.println("x % y = " + x % y);
            //**************   double > float> int   **********
        int p=58;
        System.out.println(p++);    //önce yazdırır sonra artırır
        System.out.println(p);
        int t=5;
        System.out.println(t++ + t); //5+6 oluyo
        System.out.println(t++ + t++); //5+6 oluyo
        int s=7;
        System.out.println(++s);
        System.out.println(s++);
        System.out.println(s);
            int d=10;
            d+=15; // d=d+15 ile aynıdır
        System.out.println(d);
        System.out.println(s==d);   // x y ye eşit mi?
        System.out.println(s!=d);   // x y ye eşit değil  mi?
        System.out.println(s<=d);   // x y yeden küçük eşit mi?
        byte e=5; //çay bardağı
        short f=656; // su bardağı
        int l=15 ;  //sürahi
        l=e; // olur sürahinin içine çay bardağı sığar e=b olmaz çay bardağına sürahi sığmaz
        System.out.println(l);
        l=45;
        e=(byte)l ;
        System.out.println(e);
        // ************  KULLANICIDAN ÇIKTI ALMA  *****
        int c ,z;
        Scanner input=new Scanner(System.in);
        System.out.println("1.sayiyi giriniz");
        c=input.nextInt();
        System.out.println("2.sayiyi giriniz");
        z= input.nextInt();
        System.out.println("girdiğiniz 1. sayi:"+ c+  "\n girdiğiniz 2. sayi :" + z);

    }
}
