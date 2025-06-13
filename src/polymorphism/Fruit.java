package polymorphism;

public class Fruit {
        private int calories;

        // Constructor
        public Fruit(int calories) {
            this.calories = calories;
        }

        // Getter
        public int getCalories() {
            return calories;
        }

        // Setter
        public void setCalories(int calories) {
            this.calories = calories;
        }

        // Method to be overridden
        public void makeJuice() {
            System.out.println("Juice is made");
        }
}