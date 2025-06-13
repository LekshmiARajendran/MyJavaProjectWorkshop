package abstractandinterface;

public class Duck extends Animal implements Speakable{
    @Override
    public void makeSound() {
        System.out.println("The duck says: quack quack");
    }

    @Override
    public void speak() {
        System.out.println("The duck is speaking in quacks.");
    }
}
