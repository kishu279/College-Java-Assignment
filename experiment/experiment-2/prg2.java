import java.util.Scanner;

public class prg2 {
    int number;

    prg2(int n) {
        this.number = n;
    }

    boolean prime() {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    boolean armstrong() {
        int digit = 0;
        int n = number;
        int arm = 0;

        // Counting the digits
        while (n != 0) {
            n = n / 10;
            digit++;
        }

        n = number;
        // Armstrong check
        while (n != 0) {
            int rem = n % 10;
            n = n / 10;
            arm += Math.pow(rem, digit);
        }

        return arm == number;
    }

    boolean perfect() {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String number = sc.nextLine();
        
        int n = 0;

        // Summing the digits of the input string
        for (int i = 0; i < number.length(); i++) {
            n += Character.getNumericValue(number.charAt(i));
        }

        // Create the prg2 object with the sum of digits
        prg2 obj = new prg2(n);

        // Checking whether the sum is prime, armstrong, or perfect
        System.out.println("Is prime? " + obj.prime());
        System.out.println("Is Armstrong? " + obj.armstrong());
        System.out.println("Is perfect? " + obj.perfect());

        sc.close();
    }
}
