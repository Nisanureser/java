import java.util.Scanner;

public class fibonacci {
    public static void main(String[]args){
        int t1=0,t2=1,nexterm=0, n,i;
        Scanner nsayi = new Scanner(System.in);
        System.out.println(" n sayisini gir");
        n= nsayi.nextInt();
        System.out.println(t1);
        System.out.println(t2);
      /*  nexterm=(t1+t2);*/
        for(i=1; i<=n; ++i){
            System.out.println(t1);
            nexterm=(t1+ t2);
            t1=t2;
            t2=nexterm;
        }


    }

}
