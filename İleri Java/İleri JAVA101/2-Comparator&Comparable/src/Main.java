import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Phone> phones = new ArrayList<Phone>() {
            {
                add(new Phone("Iphone", "X", 16, 128, 2010));
                add(new Phone("Samsung", "Note8", 16, 256, 2018));
                add(new Phone("Xiaomi", "9s", 4, 64, 2016));
                add(new Phone("Huawei", "Mate 20", 8, 128, 2014));
            }
        };
        System.out.println("Telefonlar:");
        Phone.listAllPhones(phones);
        System.out.println("Comparabledaki compareTo() kuralı:");
        Collections.sort(phones); // default sortta compareTo daki kural geçerli olur.
        Phone.listAllPhones(phones);
        System.out.println("Sıralamayı terse çevir:");
        Collections.reverse(phones);
        Phone.listAllPhones(phones);
        System.out.println("Comparator ile hafızaya göre küçükten büyüğe sıralama:");
        Comparator<Phone> lessCapacity = new Comparator<Phone>() { // Comparator
            @Override
            public int compare(Phone o1, Phone o2) {
                return o1.getCapacity() - o2.getCapacity();
            }
        };
        Collections.sort(phones, lessCapacity);
        Phone.listAllPhones(phones);
        System.out.println("Lambda ile kullanım: ");
        Collections.sort(phones, (o1, o2) -> o1.getRam() - o2.getRam()); // Comparator
        Phone.listAllPhones(phones);
    }
}