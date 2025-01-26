public class prg3 {
    int number;

    prg3(int n) { 
        number = n;
    }

    void binary() {
        int n = number;
        String str = "";

        while(n > 0) {
            if(n % 2 == 0) {
                str = str + '0';
            } else {
                str += '1';
            }

            n = n / 2;
        }

        StringBuffer s = new StringBuffer();

        s.append(str);
        s.reverse();
        System.out.println("Binary Format: " + s);
    }

    void hexadecimal() {
        int n = number;
        String str = "";

        while(n > 0) {
            if(n % 16 <= 9) {
                str += (char) (n % 16 + '0');
            } else {
                str += (char) (n % 16 - 10 + 'A');
            }

            n = n / 16;
        }

        StringBuffer s = new StringBuffer();

        s.append(str);
        s.reverse();
        System.out.println("Hexadecimal Format: " + s);
    }
    public static void main(String[] args) {
        prg3 obj = new prg3(230);
        obj.binary();
        obj.hexadecimal();
    }
}
