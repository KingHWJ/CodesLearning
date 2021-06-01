package OPP.test;

// 计算圆的面积
public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle(3);
        System.out.println("圆的周长为："+c1.getPerimeter());
        System.out.println("圆的面积为："+c1.getArea());

   }
}

class Circle{

    private double r;   // 半价

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPerimeter(){
        return 2 * Math.PI * r;
    }

    public double getArea(){
        return Math.PI * Math.pow(r,2);
    }
}