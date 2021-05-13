package ProcessControl;

public class forEachLoop {
    public static void main(String[] args) {
        // 圆周率π可以使用公式计算：
        double pi = 0;
        for (double i = 1; i <= 3000; i++) {
            if (i% 2 != 0) {
                pi = pi + 1 / (2 * i -1);
            } else {
                pi = pi - 1 / (2 * i - 1);
            }
        }
        pi = pi * 4;
        System.out.println(pi);
    }
}
