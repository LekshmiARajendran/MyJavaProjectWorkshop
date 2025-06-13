package inheritance;
/* We have a base class called Employee with common attributes like name and salary.
Then, we have specialized classes:
Manager who has a department.
Developer who has a programming language specialty.
Manager salary is more than or equal to 100000
Developer salary is between 50000 to 100000
Otherwise it is a Intern*/

import java.util.Scanner;

public class MainMethodEmployee {
    public static void main(String[] args){
        /*Manager manager = new Manager("Alice", 90000, "HR");
        Developer developer = new Developer("Bob", 80000, "Java");*/
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the employee name: ");
        String name= scanner.nextLine();
        System.out.println("Enter the salary of the Employee");
        double salary= scanner.nextDouble();
        scanner.nextLine();

        Employee employee;

        if(salary >= 100000){
            System.out.println("This employee is a Manager and Enter the department of the Manager");
            String department=scanner.nextLine();
            employee= new Manager(name,salary,department);
        }
        else if (salary>=50000 && salary <=100000){
            System.out.println("This employee is a Developer and Enter Programming language of the Developer");
            String language= scanner.nextLine();
            employee= new Developer(name,salary,language);
        }
        else{
            System.out.println("This employee is a Intern");
            employee= new Employee(name, salary);
        }
        System.out.println("The Employee Details is ");
        employee.displayInfo();
        scanner.close();
    }
}
