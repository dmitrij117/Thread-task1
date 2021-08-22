public class Main {
    public  static  void  main(String[] args) throws InterruptedException {
        final ThreadGroup threadGroup = new ThreadGroup("ThreadGroup");
        System.out.println("Создаю потоки......");
        Thread myThread1 = new MyThread(threadGroup, "1", 2300);
        Thread myThread2 = new MyThread(threadGroup, "2", 2700);
        Thread myThread3 = new MyThread(threadGroup, "3", 3000);
        Thread myThread4 = new MyThread(threadGroup, "4", 3300);

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();

        Thread.sleep(15000);

        System.out.println("Завершаю потоки");
        threadGroup.interrupt();

    }
}
