package day39_Collection.MultiThreading;

public class Thread_HelloWorld extends Thread{

    int threadNumber;

    public Thread_HelloWorld(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {
            System.out.println(i+" Hello World thread "+threadNumber);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
