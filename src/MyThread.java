public class MyThread extends Thread {
    private  int timeout;

    public MyThread(ThreadGroup threadGroup, String name, int timeaut) {
        super(threadGroup, name);
        this.timeout = timeaut;
    }


    @Override
    public void run() {
        while (!isInterrupted()) {
            System.out.println("Я поток " +Thread.currentThread().getName() + ". Всем привет!");
            try {
                Thread.sleep(timeout);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Если убрать, выполнение не остановится
            }
        }
    }
}
