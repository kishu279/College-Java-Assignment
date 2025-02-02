import java.util.*;

public class prg2 {
    int [] arr;
    int []freq;

    prg2(int n) {
        arr = new int[n];
        freq = new int[n];
    }

    void count() {
        for(int i = 0; i < arr.length; i++) {
            if(freq[i] == 0) {
            int count = 1;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count ++;
                    freq[j] = -1;
                    }
                }
                freq[i] = count;
            }
        }
    }

    void show() {
        count();
        System.out.print("Frequency");
        for(int i = 0; i < arr.length; i++) {
            if(freq[i] != -1) {
                System.out.println(i + " " + freq[i]);
            }
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        prg2 obj1 = new prg2(10);


        System.out.println("Enter the elements in this array : ");

        for(int i = 0; i < 10; i ++) {
            obj1.arr[i] = in.nextInt();
        }

        obj1.show();
    }
}
