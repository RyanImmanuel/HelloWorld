package lambdas;

import java.util.function.Predicate;

public class LambdaDemo {
    public static void main(String[] args) {
        Sayable s1 = () -> {System.out.println("This is lambda life");};
        s1.say();

        //predefined SAMs

        Predicate<Integer> pr = (tInt) -> (tInt > 20);
        System.out.println(pr.test(18));

    }
}
