import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prg4 { 
    int [] arr;
    int n;

    prg4(int len) {
        arr = new int[len];
        this.n = len;
    }

    void moveToBack() {
        int nonZero = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                arr[nonZero] = arr[i];
                nonZero ++;
            }
        }

        for(int i = nonZero; i < n; i++) {
            arr[i] = 0;
        }   
    }

    void print() {
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        prg4 obj = new prg4(10);

        System.out.print("Enter the elements in array: ");
        for(int i = 0; i < 10; i++) {
            obj.arr[i] = Integer.parseInt(br.readLine());
        }

        obj.moveToBack();
        obj.print();
    }   
}
