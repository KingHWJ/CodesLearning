public class no_1_testThread {
    public static void main(String[] args) {

        TestThread testThread = new TestThread();
        testThread.start();

//        testThread.start();     // IllegalThreadStateException
//        testThread.run();
        // 如下操作，仍然是main方法
        for (int i = 1; i <= 200; i++) {
            if(i%2==1){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

/**
 * 创建多线程的方式 方式一
 * 1.继承Thread类
 * 2.重写run() 方法
 * 3.创建Thread子类对象
 * 4.运行start方法
 */
class TestThread extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 200; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName() + "：" + i);
            }
        }
    }
}