import java.util.Scanner;

public class asal_sayi {
    public static void main(String[]args){
        Scanner asal=new Scanner(System.in);
        System.out.println("sayi gir");
        int b,i;
        b=asal.nextInt();
        for (i=2; i<b/2; i++) {

            if (b % i == 0) {
                System.out.println("asal degil");
                break;
            } else {
                System.out.println("asal");
                break;
            }
        }
        if(b==2){
            System.out.println("asal");
        } else if (b==1) {
            System.out.println("asal sayi degil");
        }
    }
}
