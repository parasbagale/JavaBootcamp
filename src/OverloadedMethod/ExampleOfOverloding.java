package OverloadedMethod;

public class ExampleOfOverloding {
    public static void main(String[] args){
        //overloaded methods = methods that share the same name but having the different parameters
                                //method name + parameters = method signature
        int x = add(1,2,3);
        System.out.println(x);
    }
    static int add(int a, int b){
        System.out.println("this is Overloaded method #1");
        return a+b;
    }
    static int add(int a, int b, int c) {
        System.out.println("this is overloaded method #2");
        return a + b + c;
    }
}
