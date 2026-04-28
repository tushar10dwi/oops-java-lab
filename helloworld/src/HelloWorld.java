class MultiThreading implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            MultiThreading m = new MultiThreading();
            Thread t = new Thread(m);
            t.start();
        }
    }
}