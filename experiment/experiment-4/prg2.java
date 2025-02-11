import java.util.*;

class Employee {
    String name;
    int year;
    float salary;
    String address;
    static int count = 0;

    Employee(String name, int year, float salary, String address) {
        this.name = name;
        this.year = year;
        this.salary = salary;
        this.address = address;
        count++;
    }
}

public class prg2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int len = 2;
        Employee[] obj = new Employee[len];

        System.out.println("Enter the Name, Year of Joining, Salary, Address:");

        for (int i = 0; i < len; i++) {
            System.out.println("\nEmployee " + (Employee.count + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Year of Joining: ");
            int year = sc.nextInt();
            System.out.print("Salary: ");
            float salary = sc.nextFloat();
            System.out.print("Address: ");
            sc.nextLine(); // Consume newline
            String address = sc.nextLine();

            obj[i] = new Employee(name, year, salary, address);
        }

        System.out.println("\n------------------------------------------");
        System.out.println("|\tName\t\t| Year | Salary\t | Address\t|");
        System.out.println("------------------------------------------");

        for (Employee e : obj) {
            System.out.printf("| %-15s | %-4d | %-7.2f | %-10s |\n", e.name, e.year, e.salary, e.address);
        }
        
        System.out.println("------------------------------------------");

        sc.close();
    }
}
