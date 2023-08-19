import javax.sound.midi.Soundbank;
import java.io.PrintStream;

public class asalmi {


        public static void main(String []args){
            long start =System.currentTimeMillis();
            int a=15;
            while(a<200){
                if(asalmi(a)){
                    System.out.printf("%d sayisi asaldir \n",a);
                }
                a++;
            }


            long end =System.currentTimeMillis();
            PrintStream printf = System.out.printf("%.2f saniye sürdü", (double) (end - start) / 1000);


        }
        public static boolean asalmi(int x) {

            boolean asal=true;
            for (int i = 2; i < (x - 1)/2; i++) {
                if (x % i == 0) {
                    asal = false;
                    break;
                }
            }
            return asal;




        }


    }




