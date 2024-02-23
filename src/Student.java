public class Student {
    public static String COLLEGE = "IIT";
    String name;
    int age;
    boolean isEligible;


    public Student(String n, int a, boolean i) {
        this.name=n;
        this.age=a;
        this.isEligible=i;
    }
    public Student(String n, int a) {
        this.name=n;
        this.age=a;
        this.isEligible=true;
    }
    //empty constructor
    public Student() {
    }
}
