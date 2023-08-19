public class onsekizincisoru {

    public static void main(String []args){
        int [] array1= {1,2,4,5,56,56,13};
        for(int x:array1){
            if(x%2==0){
               // System.out.println(x+"çift sayidir");
                System.out.printf("%d çift sayidir \n",x);
            }
            else
                System.out.println(x+"tek sayidir");

        }


    }
}
