import java.util.Scanner;

class prg1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String name, department;
        int age;
        float salary;

        Employee [] emp = new Employee[5];

        for(int i = 0; i < 5; i++) {
            System.out.println("Enter name, department, age, salary of an Employee no. "+ Employee.id);
            name = sc.nextLine();
            department = sc.nextLine();
            age = sc.nextInt();
            salary = sc.nextFloat();

            sc.nextLine();
            
            emp[i] = new Employee(name, department, age, salary);
            Employee.IdNo();
        }

        for(int i = 0; i < Employee.id - 1; i++) {
            System.out.println("Employee id: "+ i);
            emp[i].ShowAll();
        }


    }
}

class Employee {
    String name;
    String department;
    int age;
    float salary;

    static int id = 1;

    static void IdNo() {
        id += 1;
    }

    Employee(String name,String department, int age, float salary) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    void ShowAll() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}