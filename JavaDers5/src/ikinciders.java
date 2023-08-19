public class ikinciders {
    public static void main(String[]args){
        int [] dizi1={4,78,9,7,8,10,2};
        int [] sonuc=new int[2];
        sonuc =enbuyukVEenkucukeleman(dizi1);
        System.out.println("dizinin en kucuk"+sonuc[0]);
        System.out.println("dizinin en buyuk"+sonuc[1]);


       /* System.out.println("en buyuk eleman "+enbuyuk );  */

    }

   /* public static int enbuyukeleman(int []a){
        int enbuyuk=a[0];
        for (int i:a){
            if(enbuyuk<i){
               enbuyuk=i;
            }
        }
        return enbuyuk;
    }  */
    public static int[] enbuyukVEenkucukeleman(int []a){
        int[]elemanlar=new int[2];
        int enbuyuk=a[0];
        int enkucuk=a[0];
        for (int i:a){
            if(enbuyuk<i){
                enbuyuk=i;
            }
        }
        for (int i:a){
            if(enkucuk>i){
                enkucuk=i;
            }
        }
        elemanlar[0]=enkucuk;
        elemanlar[1]=enbuyuk;

        return  elemanlar;

    }


}
