public class Lab_9_1_try implements Runnable {
    
    private String greeting;
    private int interval;

    public Lab_9_1_try(String greeting, int interval) {
        this.greeting = greeting;
        this.interval = interval;
    }

    public void run() {
        while (true) {
            System.out.println(greeting);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Runnable morning = new Lab_9_1_try("Good Morning", 1000);
        Runnable afternoon = new Lab_9_1_try("Good Afternoon", 3000);

        Thread morningThread = new Thread(morning);
        Thread afternoonThread = new Thread(afternoon);

        morningThread.start();
        afternoonThread.start();
    }
}
