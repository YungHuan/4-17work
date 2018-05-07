public abstract class shape {
    private double area,perimeter;
    public shape(){

    }
    public  shape(double area1 , double perimeter1){
        this();
        setArea(area1);
        setPerimeter(perimeter1);


    }
    public void setArea(double area1){
        area=area1;
    }
    public void setPerimeter(double perimeter1){
        perimeter=perimeter1;
    }
    public abstract void show();
}
