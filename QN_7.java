
package labsheet_1;

/**
 *
 * @author rajis
 */


class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}
public class QN_7 {
    public static void main(String[] args) {
       
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
