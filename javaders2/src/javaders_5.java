import java.util.Scanner;

public class javaders_5 {
    public static void main(String[]args){
        Scanner deneme= new Scanner(System.in);
        String ask= "bize fazla geldi ask";
        /* küçük harfleri değiştirdi  "([0-9])" [A-Z] */
        System.out.println(ask.replaceAll("([a-z])","az"));
        String mart,mart2;
        mart= "her sey biraz anlamsiz";
        mart2=mart.substring(0,4);
        System.out.println(mart2);

        mart2=mart.substring(4);
        System.out.println(mart2);
        /* substring 4 den sonrasını alıyo*/


    }
}
