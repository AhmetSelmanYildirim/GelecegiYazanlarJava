package multithread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();
        //printer.print(5,"Vize1_Sinavi.pdf");
        //printer.print(5,"Vize2_Sinavi.pdf");
        //printer.print(5,"Final_Sinavi.pdf");

        Runnable r1 = new Task(printer,5,"Vize1_Sinavi.pdf");
        Runnable r2 = new Task(printer,5,"Vize2_Sinavi.pdf");
        Runnable r3 = new Task(printer,5,"Final_Sinavi.pdf");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        t1.start();
        // join() -> t1 threadini dead durumuna gelene kadar bekle demek
        t1.join();

        t2.start();
        // join() -> t2 threadini dead durumuna gelene kadar bekle demek
        t2.join();

        t3.start();
    }
}
