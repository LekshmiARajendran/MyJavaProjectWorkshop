package polymorphism;
/*
 * Program Summary:
 * This Java program demonstrates the concept of **polymorphism** using a superclass and subclasses.
 *
 * - A base class `Fruit` is defined with:
 *     - A field `calories`
 *     - A method `makeJuice()` (overridden in subclasses)
 *     - Getter and setter methods for `calories`
 *
 * - Two subclasses `Apple` and `Banana`:
 *     - Inherit from `Fruit`
 *     - Have their own specific methods: `removeSeeds()` and `peel()`
 *     - Override the `makeJuice()` method to provide specific behavior
 *     - Set specific calorie values in their constructors
 *
 * - The `Market` class:
 *     - Demonstrates polymorphism using `Fruit` references pointing to `Apple` and `Banana` objects
 *     - Calls overridden `makeJuice()` methods
 *     - Uses `instanceof` and casting to access subclass-specific methods
 *     - Displays the calories of each fruit
 *
 * This example shows how polymorphism allows for flexible and dynamic method behavior at runtime.
 */

public class Market {
    public static void main(String[] args){
        // Create an array of mixed Fruit objects (polymorphism in action)
        Fruit[] fruits = {
                new Apple(),
                new Banana(),
        };

        for (Fruit fruit : fruits) {
            fruit.makeJuice(); // Polymorphism: calls overridden method

            if (fruit instanceof Apple) {
                ((Apple) fruit).removeSeeds();
            } else if (fruit instanceof Banana) {
                ((Banana) fruit).peel();
            }

            System.out.println("Calories: " + fruit.getCalories());
            System.out.println();
        }
    }
}
