public class circle extends shape{
    private double r;
    public circle(){

    }
    public  circle(double r1){
        this();
        setR(r1);
    }
    public void setR(double r1){
        r=r1;
    }
    public void show(){
        System.out.println("area="+r*r*3.14);
        System.out.println("perimeter="+2*r*3.14);
    }
}
