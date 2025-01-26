import java.util.Scanner;

public class pattern {
    int row;
    pattern(int x) {
        row = x;
    }

    void first() {
        for(int i = 1; i <= row; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j < i - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                System.out.println("*");
            }
        }
    }

    void reverseRight() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < row - i; j++) {
                System.out.print((char) (j + 65) + " ");
            }
            System.out.println();
        }
    }

    void right() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        row = sc.nextInt();

        pattern obj = new pattern(row);
        // obj.first();
        // obj.reverseRight();
        obj.right();
    }
}
