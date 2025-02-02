import java.util.*;

public class prg1 {
    int n, m;
    int [][] arr;

    prg1(int n, int m) {
        this.n = n;
        this.m = m;

        arr = new int[n][m];
    }

    void show() {
        for(int i = 0; i < n; i++) {
            System.out.println("Time: " + arr[i][0] + " Value: " + arr[i][1]);
        }
    }

    public static void main(String [] args ) {
        Scanner in = new Scanner(System.in);

        int n = 10;
        prg1 obj1 = new prg1(n ,2);

        
        System.out.println("Enter the time and value of Stocks: ");
        
        for(int i = 0; i < n; i++) {
            System.out.print("Time : ");
            obj1.arr[i][0] = in.nextInt();
            System.out.print("Value : ");
            obj1.arr[i][1] = in.nextInt();
            System.out.println();
        }

        obj1.show();
    }   
}
