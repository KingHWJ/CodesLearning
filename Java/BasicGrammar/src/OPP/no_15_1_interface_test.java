package OPP;

public class no_15_1_interface_test {
    public static void main(String[] args) {

        ComparableCircle c1 = new ComparableCircle(5);
        ComparableCircle c2 = new ComparableCircle(5);

        int result = c1.compateTo(c2);
        System.out.println(result);

    }

}

interface CompareObject{
    public abstract int compateTo(Object o);
}


class Circle{
    private double redius;  // 半径

    public double getRedius() {
        return redius;
    }

    public void setRedius(double redius) {
        this.redius = redius;
    }
}

class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle(double r){
        setRedius(r);
    }

    @Override
    public int compateTo(Object o) {
        if(o instanceof Circle){
            Circle circle = (Circle) o;
            if(circle.getRedius() == this.getRedius()){
                return 0;
            }else if(circle.getRedius() < this.getRedius()){
                return 1;
            }else {
                return -1;
            }

        }

        return -1111;
    }
}

