public class prg4 {
    int number;

    prg4(int n) {
        number = n;
    }

    void fibonacci() {
        long a = 0;
        long b = 1;
        long fibo = 0;

        if(number < 2 && number >= 0) {
            System.out.println("Fibonacci: " + number);
            return ;
        }

        for(int i = 2; i <= number; i++) {
            fibo = a + b;
            a = b;
            b = fibo;
        }   

        System.out.println("Fibonacci: " + fibo);
    }

    long fibo(int num, long [] arr) {   // the arr is containing the memoized value
        if(num == 0 || num == 1) {
            return num;
        }

        if(arr[num] != -1) {    // memoized value is being returned
            return arr[num];
        }

        arr[num] = fibo(num - 1, arr) + fibo(num - 2, arr);

        return arr[num];
    }
    public static void main(String[] args) {
        prg4 obj = new prg4(10);
        obj.fibonacci();

        long [] memo = new long[11];
        for(int i = 0; i < memo.length; i++) {
            memo[i] = -1;
        }

        long ans = obj.fibo(10, memo);
        System.out.println("Fibonacci series: " + ans);
    }
}
