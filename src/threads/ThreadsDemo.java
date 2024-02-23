package threads;

public class ThreadsDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread("custom");
        mt.start();

        for (int i = 1; i < 5; i++) {
            try{
                Thread.sleep(250);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " : " + i*10);
        }
    }
}
