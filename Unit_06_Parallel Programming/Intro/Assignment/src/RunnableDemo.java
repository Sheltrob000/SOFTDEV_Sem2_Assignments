public class RunnableDemo implements Runnable {

    private Thread t;
    RunnableDemo() {

    }

    @Override
    public void run() {
        for (int i = 0; i <= 10000; i++) {
            System.out.println(Math.sqrt(i));

        }
    }

    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();;
        }
    }


}