package exception;

public class ThrowEx {

    public static void validate(int age) throws UserDefined {
        if(age < 18){
//            throw new ArithmeticException("Hey, you're too young");
            throw new UserDefined("User defined exception it is");
        }else{
            System.out.println("You're old");
        }
    }

    public static void main(String[] args) {
        try {
            validate(17);
        } catch (UserDefined e) {
            throw new RuntimeException(e);
        }

    }
}
