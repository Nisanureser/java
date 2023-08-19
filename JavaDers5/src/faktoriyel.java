public class faktoriyel {

    public static void main(String []args){
        String ad="nisanur";
        int yas=25;
        double boy=1.54;

        int fakt=1;
        int sayi=6;
        for (int i=1; i<=6; i++){
            fakt*=i;
        }
        System.out.println(+sayi +"sayısının faktöriyeli "+fakt);
        //***********************************************//

        System.out.printf("merhaba benim adım %s yasım %d boyum %.2f  \n ",ad,yas,boy);
        System.out.printf("merhaba benim adım %20S yasım %d boyum %f",ad,yas,boy);
    }
}
