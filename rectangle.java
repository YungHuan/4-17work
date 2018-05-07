public class rectangle extends shape{
    private double width,high;
    public rectangle(){

    }
    public rectangle(double width1,double high1){
        this();
        setHigh(high1);
        setWidth(width1);
    }
    public void setWidth(double width1){
        width=width1;
    }
    public void setHigh(double high1){
        high=high1;
    }
    public void show(){
        System.out.println("area="+width*high);
        System.out.println("perimeter="+(width+high)*2);
    }

}
