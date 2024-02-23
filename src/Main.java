public class Main {
    public static void main(String[] args) {

        Student obj = new Student("Ryan", 21, true);
        Student obj1 = new Student();

        System.out.println("name : " + obj.name);
        System.out.println("age : " + obj.age);
        System.out.println("isEligible : " + obj.isEligible);
        System.out.println("college : " + Student.COLLEGE); //static keyword

        System.out.println();

        System.out.println("name : " + obj1.name);
        System.out.println("age : " + obj1.age);
        System.out.println("isEligible : " + obj1.isEligible);

        int sum = Amath.add(obj.age, obj1.age);
        System.out.println("sum : " + sum);
    }
}