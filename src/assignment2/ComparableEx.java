package assignment2;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class ComparableEx {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ryan", 20));
        students.add(new Student("Preethi", 18));
        students.add(new Student("Siddharth", 22));

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students);

        System.out.println("\nAfter sorting by age (ascending):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
