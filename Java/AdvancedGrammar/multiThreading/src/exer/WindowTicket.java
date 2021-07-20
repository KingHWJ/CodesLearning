package exer;

// 窗口卖票
public class WindowTicket {
    public static void main(String[] args) {

//        extendThread thread1 = new extendThread("窗口1");
//        extendThread thread2 = new extendThread("窗口2");
//        extendThread thread3 = new extendThread("窗口3");
//        thread1.start();
//        thread2.start();
//        thread3.start();


        implementRunable threadR = new implementRunable();
        Thread thread4 = new Thread(threadR,"窗口4");
        Thread thread5 = new Thread(threadR,"窗口5");
        Thread thread6 = new Thread(threadR,"窗口6");
        
        thread4.start();
        thread5.start();
        thread6.start();


    }
}


class extendThread extends Thread{

    private static int nums = 100;

    public extendThread(String name){
        setName(name);
    }


    @Override
    public void run() {

        while (true){
            if(nums <= 0){
                break;
            }
            System.out.println(getName() + ":" + nums);
            nums--;
        }
    }
}

class implementRunable implements Runnable{

    private int nums = 100;


    @Override
    public void run() {

        while (true){
            if(nums <= 0){
                break;
            }
            System.out.println(Thread.currentThread().getName() + ":" + nums);
            nums--;
        }
    }
}