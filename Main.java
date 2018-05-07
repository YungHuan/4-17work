public class Main {

    public static void main(String[] args) {
	circle cir=new circle(5);
        System.out.println("圓形");
        cir.show();
        triangle tri=new triangle(3,4,90);
        System.out.println("三角形");
        tri.show();
        rectangle rec=new rectangle(4,5);
        System.out.println("矩形");
        rec.show();
    }
}
