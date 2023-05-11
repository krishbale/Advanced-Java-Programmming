public class TestThread {
    public static void main(String args[])
    {
        RunnableDemo R1 = new RunnableDemo("One");
        Thread t1 = new Thread(R1);
        t1.start();
        RunnableDemo R2 = new RunnableDemo("Two");
        Thread t2 = new Thread(R2);
        t2.start();
    }
}