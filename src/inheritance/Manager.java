package inheritance;

class Manager extends Employee{
    String department;
    // Constructor
    Manager(String name, double salary, String department) {
        super(name, salary); // call the parent constructor
        this.department = department;
    }
    // Overriding the displayInfo method
    @Override
    void displayInfo() {
        super.displayInfo();// call the parent method
        System.out.println("Role : Manager");
        System.out.println("Department: " + department);
    }
}

