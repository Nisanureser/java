

        public class Exam {
            public static void main(String[] args) {
                String str="Zonguldak"
                        ;
                metod(str);
            }
            public static void metod(String str){
                if(str.charat(0)=='z')
                    System.out.println(str.toUpperCase ());
                else if(str.charAt (1)=='0')
                    System.out.println(str.toLowerCase());
                else
                    System.out.println(str.length());
            }




    }


