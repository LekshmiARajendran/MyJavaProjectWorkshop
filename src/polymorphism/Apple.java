package polymorphism;

public class Apple extends Fruit{
    public Apple() {
        super(95); // Apple has 95 calories
    }

    public void removeSeeds() {
        System.out.println("Removing apple seeds...");
    }

    @Override
    public void makeJuice() {
        System.out.println("Making apple juice!");
    }
}
