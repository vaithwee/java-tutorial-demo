public class ThreadGetpriEmp extends Thread {
    private int countDown = 5;
    private volatile double d = 0;
    public ThreadGetpriEmp(int priority) {
        setPriority(priority);
        start();
    }

    @Override
    public String toString() {
        return super.toString() + ": " + countDown;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            for (int i = 0; i < 10000; i++) {
                d = d + (Math.PI + Math.E) / (double)i;
                System.out.println(this);
                if (--countDown == 0) return;
            }
        }
    }

    public static void main(String[] args) {
        new ThreadGetpriEmp(Thread.MAX_PRIORITY);
        for (int i = 0; i < 5; i++) {
            new ThreadGetpriEmp(Thread.MIN_PRIORITY);
        }
        
    }
}