import java.util.Scanner;

public class prime {
    int upper, lower;

    prime(int x, int y) {
        lower = x;
        upper = y;
    }

    void rangePrime() {
        System.out.print(lower + " " + upper);
        for(int i = lower; i <= upper; i++) {
            
            if(primeCheck(i) == true) {
                System.out.println(i + " is Prime Number");
            }
        }
    }

    boolean primeCheck(int n) {
        int count = 0;
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                count ++;
            }

            if(count > 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Lower limit and the Upper limit: ");
        x = sc.nextInt();
        y = sc.nextInt();


        prime obj = new prime(x, y);
        obj.rangePrime();

        sc.close();
    }
}
