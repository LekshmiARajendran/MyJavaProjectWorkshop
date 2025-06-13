package abstractandinterface;

public class Pig extends Animal implements Speakable{
    @Override
    public void makeSound() {
        System.out.println("The pig says: oink oink");
    }

    @Override
    public void speak() {
        System.out.println("The pig is grunting happily.");
    }
}
