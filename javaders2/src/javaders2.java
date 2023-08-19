import java.util.Scanner;

public class javaders2 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        String a,b;
        System.out.print("1.sayi gir:");
        a=input.nextLine();
        System.out.print("2.sayi gir:");
        b=input.nextLine();
        System.out.println("1.sayi="+a+"\n2.sayi="+b);
        System.out.print("isim gir=");

        //Scanner scan =new Scanner(System.in);
        String isim = input.nextLine();
       System.out.println("girdiğiniz isim="+isim);
    }
}
        //CONTUNİE GÖRÜLDÜĞÜ ZAMN BAŞA DÖNER KALDIĞI YERDEN DEVAM ETMEZ