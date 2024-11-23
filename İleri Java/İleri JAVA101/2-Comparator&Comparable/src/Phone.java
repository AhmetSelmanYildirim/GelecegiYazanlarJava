import java.util.List;

public class Phone implements Comparable<Phone>{ // Karşılaştırılabilir sınıf yapmak için Comparable implement ettik.

    private String brand;
    private String model;
    private int ram;
    private int capacity;
    private int publishDate;

    public Phone(String brand, String model, int ram, int capacity, int publishDate) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.capacity = capacity;
        this.publishDate = publishDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +"GB"+
                ", capacity=" + capacity + "GB"+
                ", publishDate=" + publishDate +
                '}';
    }


    @Override
    public int compareTo(Phone o) {

        if(this.publishDate > o.publishDate){
            return 1;
        }else {
            return -1;
        }

    }

    public static void listAllPhones(List<Phone> phones){
        for(Phone p : phones){
            System.out.println(p.toString());
        }
    }
}
