package callback;

public class Calc {
    public int add(int a, int b){
        return a+b;
    }
    public void addKid(int a, int b, MobilePhone mb){
        try {
            Thread.sleep(5000);
            int c = a+b;
            mb.sumResult(c);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
