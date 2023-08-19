

public class Main {
    public static void main(String[] args) {
        queue q1=new queue();
        q1.enqueue(5);
        q1.enqueue(54);
        q1.enqueue(15);
        q1.enqueue(7);
        q1.dequeue();
        q1.print();


       /* stack s1=new stack();
        int sec=0;
        Scanner input=new Scanner(System.in);
       while(sec!=5){
           System.out.println("1-push");
           System.out.println("2-pop");
           System.out.println("3-stack boyutu");
           System.out.println("4-stack yazdir");
           System.out.println("5-cıkış");
           System.out.println("islem sec");
           sec=input.nextInt();
           int sayi;
           switch (sec){
               case 1:
                   System.out.println("eklemek istediğin sayi gir");
                   sayi=input.nextInt();
                   s1.push(sayi);
                   break;
               case 2:
                   s1.pop();
               case 3:
                   System.out.println("stack boyutu"+s1.size());
                   break;
               case 4:
                   s1.print();
                   break;
           }
       }*/


    }
}