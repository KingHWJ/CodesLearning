package OPP.test;

// 递归测试
public class recursionTest {

    public static void main(String[] args) {

        recursionTest rec = new recursionTest();

        System.out.println(rec.getSum(5));
        System.out.println(rec.getN(5));
        System.out.println(rec.getFn(10));
        for (int i = 1; i <= 20; i++) {
            System.out.print(rec.getFibonacci(i)+" ");
        }


    }

    // 求1~n的和
    public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }

    // 求n！
    public int getN(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getN(n - 1);
        }
    }

    // 已知有一个数列 f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1)+f(n) 其中n是大于0的整数，求f(10)的值
    public int getFn(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * getFn(n - 1) + getFn(n - 2);
        }
    }

    // 斐波那契数列
    public int getFibonacci(int n){
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 1;
        }else{
            return getFibonacci(n-2) + getFibonacci(n-1);
        }
    }
}


