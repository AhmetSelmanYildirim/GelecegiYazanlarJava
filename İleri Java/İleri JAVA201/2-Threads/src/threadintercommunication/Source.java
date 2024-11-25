package threadintercommunication;

public class Source {
    private int id;
    private boolean isProducing = true;

    // consumer
    public synchronized int getId() {

        while (isProducing) {
            try{
                // Consumer ı bekletecek
                wait(); // bu sınıfı kullanan thread i bekleme moduna alır.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        isProducing = true;
        // notify() -> bekleme modundaki thread i uyandırır
        notify();
        return id;
    }

    // producer
    public synchronized void setId(int id) {
        while (!isProducing) {
            try{
                // Producer üretim yapmadan consumer tüketme yapmayacak
                wait(); // thread i bekleme moduna alır.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(id +" numaralı kaynak üretildi");
        this.id = id;
        isProducing = false;
        // Producer uyandırılıyor
        notify();
    }
}
