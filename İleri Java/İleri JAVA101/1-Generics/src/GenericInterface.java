interface IConversion<T1,T2> {
    T1 convert(T2 t2);
    T2 convertReverse(T1 t1);
}

class Helper implements IConversion<String,Integer>{

    @Override
    public String convert(Integer integer) {
        return integer.toString();
    }

    @Override
    public Integer convertReverse(String s) {
        return Integer.parseInt(s);
    }

}

public class GenericInterface {
    public static void main(String[] args) {

        Helper h = new Helper();
        String s1 = "123";
        int i1 = 321;
        h.convertReverse(s1);
        h.convert(i1);
        System.out.println(h.convertReverse(s1).getClass()); //class java.lang.Integer
        System.out.println(h.convert(i1).getClass()); // class java.lang.String

    }
}
