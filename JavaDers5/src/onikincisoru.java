public class onikincisoru {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 58, 57, 56, 54, 13};
        int enbuyuk =Integer.MIN_VALUE;
        int enbuyukiki = Integer.MIN_VALUE;
        int enbuyukuc = array1[0];
        for (int x : array1) {
            if (enbuyuk < x) {
                enbuyuk = x;
            }
        }
        for (int x : array1) {
            if (enbuyukiki < x && x != enbuyuk) {
                enbuyukiki = x;
            }
        }
        for (int x : array1) {
            if (enbuyukuc < x && x != enbuyuk && x!= enbuyukiki) {
                enbuyukuc = x;
            }
        }


        System.out.printf("en büyük %d \nen büyük ikinci %d \n en büyük ucuncu %d", enbuyuk,enbuyukiki,enbuyukuc);
    }

}