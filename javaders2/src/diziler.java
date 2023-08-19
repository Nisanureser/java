import java.util.Scanner;

public class diziler {
    public static void main(String[]srgs){
     Scanner input = new Scanner(System.in);
   /*  int [] og_not =new int[5];*/
        double[] og_not={50,70,78,98,54};
        int []dizi={(int)1.4,(int)4.5};
        String []stdizi= {"ask","yalan"};
        System.out.println(stdizi[1]);

        System.out.println(og_not.length);
     for(int i=0; i<5; i++){
         System.out.println(og_not[i]); /* hiç eleman girilmezse 0 girilir.*/
     }


    }
}
