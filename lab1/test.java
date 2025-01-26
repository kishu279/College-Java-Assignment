class Student {
    public String name;
    public int roll_no;
    public String[] subject = {"maths", "english", "coding"};
    public int[] marks;

    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public void setMarks(int marks[]) {
        this.marks[0] = marks[0];
        this.marks[1] = marks[1];
        this.marks[2] = marks[2];
    }  
}

public class test {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Student obj1 = new Student("sourav poddar", 181);

        System.out.println("Name: "+ obj1.name+"\nRegistration: "+obj1.roll_no);
    }
}