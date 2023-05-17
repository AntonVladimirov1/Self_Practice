package day39_Collection.MultiThreading;

public class Test_MultiThreads {
    public static void main(String[] args) {

        Thread_HelloWorld thread1 = new Thread_HelloWorld(1);
        Thread_HelloWorld thread2 = new Thread_HelloWorld(2);
        Thread_HelloWorld thread3 = new Thread_HelloWorld(3);
        Thread_HelloWorld thread4 = new Thread_HelloWorld(4);
        Thread_HelloWorld thread5 = new Thread_HelloWorld(5);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }

}
