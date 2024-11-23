
class Human<T,U>{
    private String name;
    private T height;
    private U weight;

    public Human(String name, T height, U weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public void printInfo(){
        System.out.println("Deger: "+name+" Tip: "+name.getClass().getName());
        System.out.println("Deger: "+height+" Tip: "+height.getClass().getName());
        System.out.println("Deger: "+weight+" Tip: "+weight.getClass().getName());
    }
}

class Employee<T,U,V>{

    private T no;
    private U name;
    private V startYear;

    public Employee(T no, U name, V startYear) {
        this.no = no;
        this.name = name;
        this.startYear = startYear;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "no=" + no +
                ", name=" + name +
                ", startYear=" + startYear +
                '}';
    }
}

public class GenericClassSample {

    public static void main(String[] args) {
        Human h1 = new Human("Adem",200.5,100.5f);
        h1.printInfo();
        /*
        Deger: Adem Tip: java.lang.String
        Deger: 200.5 Tip: java.lang.Double
        Deger: 100.5 Tip: java.lang.Float
         */

        Human h2 = new Human("Bob",200,100);
        h2.printInfo();
        /*
        Deger: Bob Tip: java.lang.String
        Deger: 200 Tip: java.lang.Integer
        Deger: 100 Tip: java.lang.Integer
         */

        Employee e1 = new Employee("233","Ahmet",2024);
        Employee e2 = new Employee<Integer,String,Integer>(444,"Selman",2024); // Tip belirtilirse constructor ona göre davranır.


    }

}
