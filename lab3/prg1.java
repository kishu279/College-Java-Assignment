import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class prg1 {
    int [] arr = new int[10];

    // Insertion Sort
    void sort() {   
        int temp = 0;
        for(int i = 1; i < 10; i++) {
            temp = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];

                j -= 1;
            }

            arr[j + 1] = temp;
        }
    }

    int min() {
        // after the sort 
        sort();
        return arr[0];
    }

    int max() {
        sort();
        return arr[arr.length];
    }

    void show() {
        for(int i = 0; i < 10; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        prg1 obj = new prg1();
        
        for(int i = 0; i < 10; i++) {
            System.out.print("Enter the value: ");
            obj.arr[i] = Integer.parseInt(br.readLine());
        }


        obj.sort();
        obj.show();

        System.out.println("Maximum element: " + obj.max());
        System.out.println("Minimum element: " + obj.min());

    }
}
