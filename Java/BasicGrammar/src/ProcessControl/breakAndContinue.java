package ProcessControl;

public class breakAndContinue {
    public static void main(String[] args) {
        // break，终止循环
        int sum = 0;
        for(int i = 1;i<= 100;i++){
            // 只计算到50
            if(i>50){
                break;
            }
            sum += i ;
        }
        System.out.println(sum);

        // continue，跳过当前循环
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            // 只计算奇数,跳过偶数
            if(i%2==0){
                continue;
            }
            total += i;
        }
        System.out.println(total);
    }
}
