public class Test {
  public static void main(String[] args) throws InterruptedException {
    //    MyThread myThread1 = new MyThread("스레드1");
    //    MyThread myThread2 = new MyThread("스레드2");
    //    MyThread myThread3 = new MyThread("스레드3");
    //    MyThread myThread4 = new MyThread("스레드4");
    //    MyThread myThread5 = new MyThread("스레드5");
    //
    //    myThread1.start();
    //    myThread2.start();
    //    myThread3.start();
    //    myThread4.start();
    //    myThread5.start();

    Thread thread1 = new Thread(new MyRunnable(1));
    Thread thread2 = new Thread(new MyRunnable(2));
    Thread thread3 = new Thread(new MyRunnable(3));
    Thread thread4 = new Thread(new MyRunnable(4));
    Thread thread5 = new Thread(new MyRunnable(5));

    thread1.start();
    thread2.start();
    thread3.start();
    Thread.sleep(5000);
    thread4.start();
    thread5.start();
  }
}
