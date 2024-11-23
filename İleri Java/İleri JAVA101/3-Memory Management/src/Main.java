import java.util.Stack;

// Stack LIFO
/*
1. Geçici değişkenlerin depolandığı yerdir.
2. Bir işi yürütmek için kullanılır. İş bitince değişkenler silinir.
3. Yığında depolanan değişkenler onları oluşturan işlev çalıştığı sürece var olur.
4. Boyutları kullanılan os a göre değişir.
5. Bellek tahsisi sağlanır. Kullanılmış olan bölgeler işi bitince serbest bırakılır.


Yerel değişkenler neden Stack'te depolanır?
  Sadece son eklenilen değerler silinebildiği için.
  Recursive ve local variablelarda kullanılması performanslıdır.

*/
// Heap
/*
1. Objeleri depolamayı sağlayan alandır.
2. Boyutunun sınırı dinamik olarak değişir.
3. Stack e göre daha yavaş objelere ulaşılır.

heap area
old space -> vadesi dolmuş objelerin olduğu alan
young space -> kullanılmakta olan objelerin bulunduğu alan

Garbage Collector FIFO ile old space i zaman içinde temizler(serbest bırakır)
*/

// Stack vs Heap
/*
Stack ->
    Statik hafıza tahsisi
    Değişkenlere doğrudan erişim
    Compile-time'da bellek tahsisi gerçekleşir.

Heap ->
    Dinamik hafıza tahsisi
    . operatorü ile referansı üzerinden ulaşılır.
    Runtime'da bellek tahsisi gerçekleşir.
*/

class Fruit{
    private String name;
    Fruit(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // obje ortadan kalktından sonra devreye giren method.
    @Override
    protected void finalize() throws Throwable {
        System.out.println(name+" isimli meyve ramden silindi.");
    }
}

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack);

        Fruit f1 = new Fruit("Elma"); // Heapde Fruit kadar alan ayrıldı ve adresi m1 değişkenine atandı. m1 referans olarak Heap alanındaki adresi gösteriyor.
        f1 = null; // Bağlantı kırılıyor ve heap'deki object bir süre sonra garbage collector tarafından serbest bırakılıyor.

        Fruit f2 = new Fruit("Armut");
        System.out.println(f2.getName());
        //1. Bir objenin adresinin null yapılması durumunda unreferenced object meydana gelir.
        f2 = null;
        try {
            System.out.println(f2.getName());
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        Fruit f3 = new Fruit("Berry");
        Fruit f4 = new Fruit("Melon");
        //2. f3 f4 objesine eşitlendiğinde f3 ün önceki referans gösterdiği alan artık boşa çıkıyor. Unreferenced object
        f3=f4;
        System.out.println(f3.getName());
        System.out.println(f4.getName());

        //3. Anonim obje oluşturursak adresi bilinmez. Oluşturulan objenin heap'teki adresi bilinmez.
        //Unreferenced object
        System.out.println(new Fruit("Olive"));

        // Gereksiz yer kaplayan alanlar ortadan kaldırılmalı.
        Fruit f5 = new Fruit("Banana");
        f4 = f5;
        f3 = f5;
        // f1 = null
        // f3,f4,f5 Banana bölgesinin adresini tutuyor
        System.gc(); // Garbage collector çağrımı.
        /*
            Olive isimli meyve ramden silindi.
            Melon isimli meyve ramden silindi.
            Berry isimli meyve ramden silindi.
            Armut isimli meyve ramden silindi.
            Elma isimli meyve ramden silindi.
         */

    }
}