public class ilkders {
    public static void main(String[] args){

        int [] dizi1= {2,4,7,8,9,45,};
        String[] str={"java","python","c#"};
        /*topla(dizi1);*/
        for(String s:str){
            System.out.println(s);
        }
    }
    public static void topla(int[] a ) {
        int toplam=0;
       /* for (int i = 0; i < a.length; i++){
            toplam+=a[i];
        }*/
        for(int i:a) {
           System.out.println(i);

        }
        System.out.println("toplam"+ toplam);
    }
}
