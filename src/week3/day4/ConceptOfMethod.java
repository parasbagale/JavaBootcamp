package week3.day4;

public class ConceptOfMethod {
    public static void main(String[] args){
        // method = a block of code that is executed whenever it is called upon
        String name = "Ram";
        int age = 21;
        hello(name,age);

        int x=3;
        int y = 5;
        int z =sum(x, y);
        System.out.println(z);
    }
    static void hello(String name, int age){
        System.out.println("Hello " + name);
        System.out.println("You are  " + age);
    }

    static int sum(int x, int y){
        int z = x + y;
        return z;
    }
}

