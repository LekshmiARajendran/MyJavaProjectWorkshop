package abstractandinterface;

/*
 * Program Summary:
 * This Java program demonstrates the use of **abstraction** and **interfaces**.
 *
 * - An abstract class `Animal` is defined with:
 *     - A concrete method `eat()`
 *     - An abstract method `makeSound()`
 *
 * - An interface `Speakable` is defined with a method `speak()`.
 *
 * - Two classes `Pig` and `Duck`:
 *     - Extend the abstract class `Animal`
 *     - Implement the `Speakable` interface
 *     - Provide specific implementations for `makeSound()` and `speak()`
 *
 * - The `Farm` class is used to test:
 *     - Abstract class functionality
 *     - Interface implementation
 *     - Polymorphism using both `Animal` and `Speakable` references
 *
 * Output includes the sounds and actions of each animal.
 */

public class FarmMainClass {
    public static void main(String[] args) {
        Animal pig = new Pig();
        Animal duck = new Duck();

        Speakable speakingPig = (Speakable) pig;
        Speakable speakingDuck = (Speakable) duck;

        pig.makeSound();
        pig.eat();
        speakingPig.speak();

        System.out.println();

        duck.makeSound();
        duck.eat();
        speakingDuck.speak();
    }
}
