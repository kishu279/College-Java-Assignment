public class prg1 {
    static int count = 0;

    prg1 () {
        count ++;
    }

    public static void main(String args[]) {
        prg1 obj1 = new prg1();
        prg1 obj2 = new prg1();
        prg1 obj3 = new prg1();
        prg1 obj4 = new prg1();

        System.out.println("The number of objects created: " + count);

    }
}