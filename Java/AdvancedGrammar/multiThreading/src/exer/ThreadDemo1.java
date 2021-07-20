package exer;

/**
 * 创建两个分线程，其中一个遍历100以内的偶数，另一个遍历100以内的奇数
 */
public class ThreadDemo1 {

    public static void main(String[] args) {

        // 对只用一次的类，使用匿名类的方式来实现，
        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if(i % 2==0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if(i % 2!=0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();


    }
}


