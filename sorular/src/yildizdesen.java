public class yildizdesen {
      public static void main(String[]args){
          int i,j,k; /*k boşluk*/

          for(i=0; i<=5; ++i){
              for(k=0; k<5-i; ++k){
                  System.out.print(" ");
              }
              for(j=i; j<=2*i-1; ++j){
                  System.out.print("*");
              }
              for(j=0; j<i-1; ++j)
                  System.out.print("*");
              System.out.println();


          }





          for(i=5; i>=1; --i){
              for(k=0; k<5-i; ++k){
                  System.out.print(" ");
              }
              for(j=i; j<=2*i-1; ++j){
                  System.out.print("*");
              }
              for(j=0; j<i-1; ++j)
                  System.out.print("*");
              System.out.println();


          }



      }
}
