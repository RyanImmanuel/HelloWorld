package threads;

public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            try{
                Thread.sleep(500);
                System.out.println(MyThread.currentThread().getName() + " : " + i);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
