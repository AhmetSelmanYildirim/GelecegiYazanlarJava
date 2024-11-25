package threadintercommunication;

public class Main {
    public static void main(String[] args) {
        Source source = new Source();
        new Producer(source);
        new Consumer(source);

   }
}
