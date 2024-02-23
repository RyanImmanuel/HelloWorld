package exception;

public class Arithmetic {
    public static void main(String[] args) {
        try {
            try {
                int data = 100/0;
            }catch (ArithmeticException e){
                System.out.println(e);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Go Home");
        }
    }
}
