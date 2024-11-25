package threadintercommunication;

public class Producer implements Runnable {

    private Source source;

    public Producer(Source source) {
        this.source = source;
        Thread thread = new Thread(this,"Producer");
        thread.start();
    }

    @Override
    public void run() {
        int i=0;
        while (true) {
            source.setId(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
