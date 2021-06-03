package OPP.test;

// 计算圆的面积
public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle(3);
        System.out.println("圆的周长为：" + c1.getPerimeter());
        System.out.println("圆的面积为：" + c1.getArea());

        Circle2 c2 = new Circle2();
        c2.printAreas(c2,5);
    }
}

class Circle {

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

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }
}

class Circle2 {
    double radius;

    public double findArea() {
        return Math.PI * radius * radius;
    }

    public void printAreas(Circle2 c ,int time){
        System.out.println("Redius          Area");
        for (double i = 1; i <= time; i++) {
            c.radius = i;
            System.out.print(i+"             "+c.findArea() + '\n');
        }
    }

}