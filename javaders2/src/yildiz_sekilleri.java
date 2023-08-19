

import java.util.Scanner;
public class yildiz_sekilleri {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int a;
        System.out.print("sayi gir:");
        a=input.nextInt();
        int i,j,m,n;
        for(i=1; i<=a; i++){
            for(j=1;j<=i; j++) {
                System.out.print("*");
            }
                System.out.println();
        }

        for(i=1;i<=a; i++){
            for(j=1;j<=a-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }




    }


}
