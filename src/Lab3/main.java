package Lab3;

public class main {


    public static void main(String[] args) throws InterruptedException {
        ThreadTest1 thread1 = new ThreadTest1();
        ThreadTest2 thread2 = new ThreadTest2();
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

//Zad. 1

       /* t1.start();
        t1.join();
        t2.start();
        t2.join();*/


//        t2.start();
//        t1.start();
    }
}

class ThreadTest1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

    }
}

class ThreadTest2 implements Runnable {
    @Override
    public void run() {
        for (int i = 100; i <= 120; i++) {
            System.out.println(i);
        }
    }
}