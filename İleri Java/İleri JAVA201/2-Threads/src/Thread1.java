

// Thread nedir?
/*
    1. Thread'ler processlerin hafif halidir.
    2. Bir programın en küçük bağımsız birimidir.
    3. Ayrı yürütülme yolu vardır.
    4. Her java programı 1 thread içerir.
    5. java.land.Thread sınıfı tarafından thread oluşturulur ve kontrol edilir.
*/

// Thread lifecycle
/*
    new -> runnable -> running -> terminated
    running -> waiting -> runnable

*/

class MetaTask{

}

// Thread sınıfından kalıtım alındığında bir sınıftan daha kalıtım alınamayacağı için Runnable Interface'i implement edilebilir.
// Bu durumda task.start() geçersiz olacaktır.
// Bu durumda Polymorphism'den yararlanarak Task sınıfından bir Runnable obje oluşturup ve Yeni bir Thread oluşturup. Thread'e bu nesne verilmelidir.
/*
    Runnable r = new Task();
    Thread t = new Thread(r);
    t.start();
 */
class Task extends MetaTask implements Runnable {
    /*
    void runTask(){
        for(int i=0; i<20; i++){
            System.out.println("Task sınıfı - "+"Numara: "+i);
        }
    }
    */

    // Thread'den kalıtım aldıktan sonra method ismini run olarak ayarlıyoruz
    @Override
    public void run(){
        //Thread.currentThread().setName("Task thread-1");
        System.out.println("run() Thread Bilgisi: "+ Thread.currentThread().getName());
        System.out.println("TASK - Aktif thread sayısı: "+ Thread.activeCount()); //3
        for(int i=0; i<10; i++){
            System.out.println("Task sınıfı - "+Thread.currentThread().getName()+"-Numara: "+i);
        }

    }
}

class Task2 extends MetaTask implements Runnable {

    @Override
    public void run() {
        System.out.println("run() Thread Bilgisi: "+ Thread.currentThread().getName());
        System.out.println("TASK2 - Aktif thread sayısı: "+ Thread.activeCount()); //3
        for(int i=0; i<5; i++){
            System.out.println("Task2 sınıfı - "+Thread.currentThread().getName()+"-Numara: "+i);
        }
    }
}

public class Thread1 {
    // main method main threai temsil eder.
    public static void main(String[] args) {

        // main thread'i içinde default olarak işlemler yapılır.
        System.out.println("Aktif thread sayısı: "+ Thread.activeCount()); // 2

        // Job 1
        System.out.println("PROGRAM BAŞLADI");
        Thread.currentThread().setName("Main Thread");
        System.out.println("Main Thread Priority: "+Thread.currentThread().getPriority());
        for (int i=0; i<100; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }

        // Job 2
        /*
        Task task = new Task();
        //task.runTask();
        task.start(); // run metodunun çalışmasını sağlar.   **Asenkron olarak çalışır.
        */
        // Task sınıfı Runnable implementasyonu aldığı için..
        Runnable r = new Task();
        Thread t = new Thread(r,"Task thread-1");
        t.setPriority(1); // default 5 dir. Mümkünatı varsa önceliği ayarlar.
        t.start();

        System.out.println("Aktif thread sayısı: "+ Thread.activeCount()); // 3

        //System.out.println("main() Thread Bilgisi: "+ Thread.currentThread().getName());

        if(Thread.currentThread().isAlive()){
            System.out.println("MAIN THREAD ALIVE");
        } else{
            System.out.println("MAIN THREAD DEAD");
        }
        // Job 3
        Runnable r2 = new Task2();
        Thread t2 = new Thread(r2,"Task2 thread-1"); // Thread isimlendirmesi parametre ile de yapılabilir
        t2.setPriority(10);
        t2.start();

        // Job 4
        new Thread(new Task2(), "Task2 thread-2").start(); // anonim sınıf

        System.out.println("PROGRAM BİTTİ");
        System.out.println("MAIN - Aktif thread sayısı: "+ Thread.activeCount()); //3

        if(t.isAlive()){
            System.out.println(t.getName()+" THREAD ALIVE");
        } else{
            System.out.println(t.getName()+" THREAD DEAD");
        }
        if(t2.isAlive()){
            System.out.println(t2.getName()+" THREAD ALIVE");
        } else{
            System.out.println(t2.getName()+" THREAD DEAD");
        }



    }
}