package ProcessControl;

// do while 循环
public class doWhile {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do {
            sum += i;
            i++;
        }while (i<= 100);

        System.out.println(sum);

        // do while 至少执行一次循环体内的代码
        int n = 1;
        int s = 0;
        do{
            s += n;
            i++;
        }while (n>1);
        System.out.println(s);      // 只加一次，输出1
    }
}
