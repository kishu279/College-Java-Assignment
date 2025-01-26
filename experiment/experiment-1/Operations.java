public class Operations {
    public int a, b;

    // Constructor to initialize values
    Operations(int x, int y) {
        a = x;
        b = y;
    }

    // Methods for arithmetic operations
    public int add() {
        return a + b;
    }
    public int multiply() {
        return a * b;
    }
    public float division() {
        return (float) a / b;  // Casting to float to handle decimal results
    }
    public int remainder() {
        return a % b;
    }

      public static void main(String[] args) {
        // Create an object of Operations class
        Operations op = new Operations(10, 5);

        // Arithmetic Operations
        System.out.println("Addition: " + op.add());
        System.out.println("Multiplication: " + op.multiply());
        System.out.println("Division: " + op.division());
        System.out.println("Remainder: " + op.remainder());

        // Relational Operations
        System.out.println("\nRelational Operations:");
        System.out.println("a > b: " + (op.a > op.b));
        System.out.println("a < b: " + (op.a < op.b));
        System.out.println("a == b: " + (op.a == op.b));
        System.out.println("a != b: " + (op.a != op.b));

        // Logical Operations
        System.out.println("\nLogical Operations:");
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));  // Logical AND
        System.out.println("x || y: " + (x || y));  // Logical OR
        System.out.println("!x: " + (!x));          // Logical NOT
    }
}
