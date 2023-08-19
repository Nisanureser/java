import java.util.Scanner;

public class karesorusu {
    public static void main(String[]args){
        int i,j,n;
        Scanner kenar=new Scanner(System.in);
        System.out.println("kenar sayisini gir");
        n=kenar.nextInt();
        for(i=1; i<=n ; i++){

            for(j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n) System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }






    }




}
