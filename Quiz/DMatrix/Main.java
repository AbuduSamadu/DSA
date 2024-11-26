
public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        ((Dog) dog).makesSound(3);

        Printable obj = new Student();
        obj.print();
    }
}
