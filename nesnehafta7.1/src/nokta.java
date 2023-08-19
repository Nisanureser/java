public class nokta {

   private int x,y=0;
    public nokta(int x,int y){
        setX(x);
        setY(y);
        //this.x=x;
        //this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x>=0)
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if(y>=0)
        this.y = y;
    }
    public void orijinuzaklik(){
    double uzaklik=Math.sqrt(x*x+y*y);
        System.out.println(uzaklik);

    }
}
