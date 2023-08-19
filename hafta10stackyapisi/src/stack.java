public class stack {


    int []stack=new int[20];
    int top=0;
    void push(int a){
        stack[top++]=a;
        System.out.println(a +"eklendi");
    }
    int pop(){
        //1 2 3 4
        //0 1 2 3
        if(size()==0){
            System.out.println("stack bos");
            return -1;
        }
        System.out.println(stack[top-1]+"çıkarıldı");
        return stack[--top];
    }
    int size(){
        return top;
    }
    void print(){
        for (int i=0; i<top;i++){
            System.out.println(stack[i]);
        }
    }

}
