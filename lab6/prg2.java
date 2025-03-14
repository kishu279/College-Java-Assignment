    import java.util.ArrayList;
    import java.util.Scanner;

    public class prg2 {
        int multiply(int a, int b, int c) {
            return a * b * c;
        }

        int multiply(int a, int b) {
            return a * b;
        }

        int multiply(int arr[]) {
            int cal = 1;

            for(int i = 0; i < arr.length; i++) {
                cal *= arr[i];
            }

            return cal;
        }

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);

            prg2 obj = new prg2();
            ArrayList<Integer> arr = new ArrayList<>();

            String ch;
            
            while(true) {
                System.out.println("Enter the * for stopping the input: ");
                ch = in.nextLine();
    
                if(ch.equals("*")) {
                    break;
                } else {
                    arr.add(Integer.parseInt(ch));
                }
            }


            int result = 0;

            if(arr.size() > 3) {
                int [] numbers = arr.stream().mapToInt(i -> i).toArray();
                result = obj.multiply(numbers);

            } else if(arr.size() == 3) {    
                result = obj.multiply(arr.indexOf(0), arr.indexOf(1), arr.indexOf(2));
            }
            else {
                result = obj.multiply(arr.indexOf(0), arr.indexOf(1));
            }

            System.out.println("Result : " + result);
            in.close();
        }
    }