import java.util.Scanner;

public class javaders2_1 {
    public static  void main(String [] args){
        Scanner in= new Scanner(System.in);
        System.out.println("günü gir:");
        int gun;
        gun=in.nextInt();
        switch (gun){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            default:
                System.out.println("gun dışı");
        }
    }

}

            //CONTUNİE GÖRÜLDÜĞÜ ZAMN BAŞA DÖNER KALDIĞI YERDEN DEVAM ETMEZ