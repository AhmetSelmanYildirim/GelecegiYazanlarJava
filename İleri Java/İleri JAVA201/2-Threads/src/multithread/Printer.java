package multithread;

public class Printer {

    // synchronized key i bir method bitmeden (nesnenin methodu çağırması) başka methoda geçmesini engeller.
    // synchronized void print(int copyCount, String documentName) {  **AMA bu önerilmez çünkü belki bu sınıftan başka yazıcıların bu kurala uyması istenmeyebilir
    void print(int copyCount, String documentName) {
        for(int i=0; i<=copyCount; i++) {
            /*try{
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
            */
            System.out.println(documentName + " yazdırılıyor: " + i+". Kopya");
        }
    }


}
