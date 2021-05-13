package ProcessControl;

// while 循环
public class whileLoop {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        while(n <= 100){
            sum += n;
            n++;
        }
        System.out.println(sum);

        // 死循环
//        while(n>99){
//            System.out.println(n);
//        }
    }
}
