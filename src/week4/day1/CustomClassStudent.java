package week4.day1;


import java.util.ArrayList;

class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}

public class CustomClassStudent {


    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 18, 95.5));
        students.add(new Student("Bob", 19, 88.0));
        students.add(new Student("Charlie", 20, 91.2));
        students.add(new Student("David", 18, 82.7));
        students.add(new Student("Eve", 19, 98.3));

        double totalGrade = 0;
        int count = 0;

        for (Student student : students) {
            totalGrade += student.getGrade();
            if (student.getGrade() > 90) {
                System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
            }
        }

        double averageGrade = totalGrade / students.size();
        System.out.println("Average Grade: " + averageGrade);
    }
}