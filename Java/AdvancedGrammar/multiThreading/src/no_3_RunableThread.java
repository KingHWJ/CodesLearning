
// 使用实现Runable接口来创建线程
public class no_3_RunableThread {
    public static void main(String[] args) {
        // 1.创建实现Runable接口实现类对象
        AThread threadTest = new AThread();

        // 2.创建Thread类对象，并将实现类对象作为参数
        Thread thread1 = new Thread(threadTest);
        Thread thread2 = new Thread(threadTest);

        // 3.调用Thread类对象的start() 方法
        thread1.start();
        thread2.start();
    }

}



class AThread implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <=100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}