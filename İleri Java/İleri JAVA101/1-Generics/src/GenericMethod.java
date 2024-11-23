import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.*;

class Animal{
    String name;
    public Animal(String name) {
        setName(name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return super.toString() + " Hav..";
    }
}
class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return super.toString() + " Miyav..";
    }
}

class MethodHelper{
    public static String oldGetType(Object o){
        return o.getClass().getName();
    }
    // Generic Method Type
    public static <T> String getType(T value){
        String[] typeArr = value.getClass().getName().split("\\.");
        return typeArr[typeArr.length-1];
    }

    // Tip farketmeksizin bir arrayden gelen değerleri alıp nesneye ekleyecek.
    public static <T> void arrayToList(List<T> list, T[] array){
        for(T t : array){
            list.add(t);
        }
        System.out.println();
    }

    public static <T> void printList(List<T> list){
        list.forEach((i)->System.out.print(i + " "));
        System.out.println();
    }

    public static void printList2(List<?> list){
        list.forEach((o)->System.out.print(o + " "));
        System.out.println();
    }
    // Sadece Animal sınıfından kalıtım almış sınıfların listelerini alır.
    public static void printList3(List<? extends Animal> list){
        list.forEach((o)->System.out.print(o.toString() + " "));
        System.out.println();
    }

}


public class GenericMethod {
    public static void main(String[] args) {

        int number = 5;
        String name = "Ahmet YILDIRIM";
        System.out.println(MethodHelper.oldGetType(number)); //java.lang.Integer
        System.out.println(MethodHelper.oldGetType(name)); //java.lang.String

        System.out.println(MethodHelper.getType(number)); //Integer
        System.out.println(MethodHelper.getType(name)); //String

        Integer[] numbers = {1,2,3,4,5,-5,0};
        List<Integer> numbers2 = new ArrayList<>();
        List<String> names = new ArrayList<String>(){
            {
                add("Ahmet YILDIRIM");
                add("Ali");
                add("Veli");
                add("Mehmet");
                add("Selim");
            }
        };
        /*
        for (Integer i : numbers) {
            numbers2.add(i);
        }
        */
        MethodHelper.arrayToList(numbers2, numbers);
        //numbers2.forEach((i)-> System.out.print(i+" "));
        MethodHelper.printList(numbers2);
        MethodHelper.printList(names);
        MethodHelper.printList2(numbers2);
        MethodHelper.printList2(names);

        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();

        cats.add(new Cat("Harley"));
        cats.add(new Cat("Reis"));
        cats.add(new Cat("Gece"));

        dogs.add(new Dog("Paşa"));
        dogs.add(new Dog("Duman"));
        dogs.add(new Dog("Pamuk"));

        //System.out.println(cats.get(0));
        //System.out.println(dogs.get(0));

        MethodHelper.printList3(dogs);
        MethodHelper.printList3(cats);

    }
}
