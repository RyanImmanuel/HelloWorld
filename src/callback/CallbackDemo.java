package callback;

public class CallbackDemo {
    public static void main(String[] args) {
        Calc c = new Calc();
        int sum = c.add(10,20);
        System.out.println("sum is : " + sum);

        MobilePhone mb = new ElderBrother();
        c.addKid(20,30, mb);

        System.out.println("I am continuing without waiting for kid's answer");
    }
}
