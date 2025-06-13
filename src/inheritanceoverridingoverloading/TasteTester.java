package inheritanceoverridingoverloading;
/*
 * Program Summary:
 * This Java program demonstrates the concept of **inheritance**.
 *
 * - A superclass `Cake` is defined with two fields: `flavor` and `price`,
 *   along with their getter and setter methods.
 *
 * - Two subclasses extend `Cake`:
 *     - `BirthdayCake` adds a `candles` field with getter and setter.
 *     - `WeddingCake` adds a `tiers` field with getter and setter.
 *
 * - The `TasteTester` class tests the inheritance by creating instances of
 *   `BirthdayCake` and `WeddingCake`, setting their fields, and printing their details.
 *
 * This example illustrates how subclasses inherit fields and methods from a superclass,
 * and how additional fields can be added in subclasses.
 */

public class TasteTester {
    public static void main(String[] args){
            // Testing BirthdayCake
            BirthdayCake birthdayCake = new BirthdayCake();
            birthdayCake.setFlavor("Chocolate");
            birthdayCake.setPrice(25.99);
            birthdayCake.setCandles(10);

            System.out.println("Birthday Cake:");
            System.out.println("Flavor: " + birthdayCake.getFlavor());
            System.out.println("Price: $" + birthdayCake.getPrice());
            System.out.println("Candles: " + birthdayCake.getCandles());

            // Testing WeddingCake
            WeddingCake weddingCake = new WeddingCake();
            weddingCake.setFlavor("Vanilla");
            weddingCake.setPrice(199.99);
            weddingCake.setTiers(3);

            System.out.println("\nWedding Cake:");
            System.out.println("Flavor: " + weddingCake.getFlavor());
            System.out.println("Price: $" + weddingCake.getPrice());
            System.out.println("Tiers: " + weddingCake.getTiers());
    }
}
