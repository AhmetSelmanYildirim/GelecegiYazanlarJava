class Car<T>{
    private T brand;
    private T model;
    private T year;
    public Car(T brand, T model, T year) {
        System.out.println( HelperCars.getType(brand));
        System.out.println( HelperCars.getType(model));
        System.out.println( HelperCars.getType(year));
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public void printInfo(){
        System.out.println("Marka: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + year);
    }
    @Override
    public String toString() {
        return "Marka: "+ brand + " Model: " + model + " Yıl: " + year;
    }
}

class HelperCars{
    public static <T> String getType(T value){
        String[] typeArr = value.getClass().getName().split("\\.");
        return typeArr[typeArr.length-1];
    }
}

public class GenericConstructor {
    public static void main(String[] args) {

        Car c1 = new Car("Toyota", "Corona",2021);
        Car c2 = new Car("Mercedes", 200,1998); // Belirli bir tip istemediği için istenilen tip gönderilebilir.
        Car c3 = new Car<String>("Mercedes","E200","2022"); // tip belirlenirse o tip gönderilmesine zorlanır.
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);


    }
}
