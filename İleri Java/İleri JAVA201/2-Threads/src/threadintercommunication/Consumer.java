package threadintercommunication;

public class Consumer implements Runnable {
    private Source source;

    public Consumer(Source source) {
        this.source = source;
        Thread thread = new Thread(this,"Consumer");
        thread.start();
    }

    @Override
    public void run() {

        while (true) {
            System.out.println(source.getId()+" numaralı kaynak tüketildi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
