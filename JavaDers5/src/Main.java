public class Main {
    public static void main(String[] args) {
    topla(5,7.2);
    alanhesapla(5,7);
    alanhesapla(4);
    }
    public static void topla(int a, double b){
        System.out.println("toplamı1 :" +(a+b));
    }
    public static void topla(double a, double b){
        System.out.println("toplamı2 :" +(a+b));

    } public static void alanhesapla(int kenar1){
        System.out.println("karenin alanı " +Math.pow(kenar1,2));
    }
    public static void alanhesapla(int kenar1,int kenar2){
        System.out.println("dikdörtgen alanı " +kenar1*kenar2);
    }



}