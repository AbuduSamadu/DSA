
class Animal {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }

}

class Dog extends Animal {

    void makeSound() {
        System.out.println("Dog barks");
    }

    void makesSound(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Dog barks");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        ((Dog) dog).makesSound(3);
    }
}
