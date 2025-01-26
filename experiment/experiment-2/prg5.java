public class prg5 {
    int number;

    prg5(int n) {
        number = n;
    }

    void pattern1() {
        for(int i = 0; i < number; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print((char)(j + 'A') + " ");
            }
            System.out.println();
        }
    }

    void pattern2() {
        for(int i = number; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }    
            for(int k = 0; k < number - i + 1; k++) {
                System.out.print("* ");
            }
            for(int l = 0; l < i - number; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args) {
        prg5 obj = new prg5(5);
        obj.pattern1();
        obj.pattern2();
    }   
}
