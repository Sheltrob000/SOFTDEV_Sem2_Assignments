public class SqrtRunnable implements Runnable {

    private Thread t;
    private double number;

    SqrtRunnable(double number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("The square root of " + number + " is " + Math.sqrt(number));
    }

    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }

}
