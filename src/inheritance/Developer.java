package inheritance;

class Developer extends Employee {
        String programmingLanguage;

        // Constructor
        Developer(String name, double salary, String programmingLanguage) {
            super(name, salary);
            this.programmingLanguage = programmingLanguage;
        }

        // Overriding the displayInfo method
        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("Role : Developer");
            System.out.println("Programming Language: " + programmingLanguage);
        }
}
