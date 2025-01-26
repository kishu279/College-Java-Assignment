    class Number {
        private double a, b;

        Number(double x, double y) {
            a = x;
            b = y;
        }

        public double add() {
            return a + b;
        }

        public double sub() {
            return a - b;
        }

        public double multiply() {
            return a * b;
        }

        public double divide() {
            if(b == 0) {
                System.out.println("Invalid number");
                return Double.NaN;
            }

            return a / b;
        }
    }

    public class calculator {
        public static void main(String []args) {
            Number obj = new Number(10, 5);

            System.out.println("Addition of x and y is : " + obj.add());
            System.out.println("Substraction of x and y is : " + obj.sub());
            System.out.println("Multiply of x and y is : " + obj.multiply());
            System.out.println("Division of x and y is : " + obj.divide());
        }
    }
