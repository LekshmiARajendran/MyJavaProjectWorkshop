package polymorphism;

public class Banana extends Fruit{
    public Banana() {
        super(105); // Banana has 105 calories
    }

    public void peel() {
        System.out.println("Peeling the banana...");
    }

    @Override
    public void makeJuice() {
        System.out.println("Making banana smoothie!");
    }
}
