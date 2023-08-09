package constructor;

public class Main {
    public static void main(String[] args){
        //constructor = special method that is called when object is instantiated(Created)

        Human human1 = new Human("ram",40,55);
        Human human2 = new Human("hari",20,33);
        System.out.println(human1.name);
        System.out.println(human2.name);

        human1.eat();
        human2.drink();

    }
}
