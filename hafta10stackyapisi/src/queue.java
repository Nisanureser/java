public class queue {
    int []queue=new int[10];
    int head=0,tail=0;
    void enqueue(int sayi){
        queue[tail++]=sayi;
        //tail++;
        System.out.println(queue);

    }
    void dequeue(){
        System.out.println(queue[head++]+" eleman çıktı");


    }
    void print(){
        for(int i=head; i<tail; i++){
            System.out.println(queue[i]);
        }
    }

}
