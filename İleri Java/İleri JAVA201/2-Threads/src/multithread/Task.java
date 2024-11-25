package multithread;

public class Task implements Runnable {
    final Printer printerRef;
    String documentName;
    int copyCount;

    public Task(Printer printerRef, int copyCount, String documentName) {
        this.printerRef = printerRef;
        this.copyCount = copyCount;
        this.documentName = documentName;
    }

    @Override
    public void run() {
        synchronized(printerRef) { // bu thread işini bitirmeden bu sınıftan türeyen başka thread çalışmaya başlamaz.
            printerRef.print(copyCount,documentName);
        }
    }
}
