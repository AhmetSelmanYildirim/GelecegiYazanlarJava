class GenericClass {
    private Object x;

    public void setX(Object x) {
        this.x = x;
    }

    public Object getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Bu generic class objesidir";
    }
}

class Student{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class Main {
    public static void main(String[] args) {

        GenericClass gc = new GenericClass();
        gc.setX(150);
        System.out.println(gc.getX().getClass().getName()); // java.lang.Integer

        GenericClass gc2 = new GenericClass();
        gc2.setX("asd");
        System.out.println(gc2.getX().getClass().getName()); // java.lang.String

        gc2.setX(15.5f);
        System.out.println(gc2.getX().getClass().getName()); // java.lang.Float

        GenericClass gc3 = new GenericClass();
        Student s1 = new Student();
        s1.setName("Ahmet");
        gc3.setX(s1);
        System.out.println(gc3.getX().getClass().getName()); // Student


    }
}