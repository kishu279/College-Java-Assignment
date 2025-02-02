import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prg5 {
    String number;

    prg5(String number) {
        this.number = number;
    }

    int minProduct() {
        int min = 100000;
        for(int i = 0; i < number.length(); i++) {
            for(int j = i + 1; j < number.length(); j++) {
                int x = (int) number.charAt(i) - 48;
                int y = (int) number.charAt(j) - 48;

                // System.out.println(x + " " + y);

                if(min > (x * y)) {
                    min = x * y;
                }
            }
        }

        return min;
    }
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entter the number: ");
        String number = br.readLine();

        prg5 obj = new prg5(number);

        int min = obj.minProduct();
        System.out.println("The minimum multiplication of the digits: "+ min);
    }
}
