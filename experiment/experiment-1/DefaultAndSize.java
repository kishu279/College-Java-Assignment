public class DefaultAndSize {
    int int_var;
    double double_var;
    float float_var;
    long long_var;
    char char_var;
    boolean boolean_var;
    short short_var;
    byte byte_var;

    public static void main(String[] args) {
        DefaultAndSize obj = new DefaultAndSize();

        System.out.println("Default Values:" +
                "\nINTEGER: " + obj.int_var +
                "\nDOUBLE: " + obj.double_var +
                "\nFLOAT: " + obj.float_var +
                "\nLONG: " + obj.long_var +
                "\nCHAR: " + obj.char_var +
                "\nBOOLEAN: " + obj.boolean_var +
                "\nSHORT: " + obj.short_var +
                "\nBYTE: " + obj.byte_var);

        // sizeAgent the size of various fields in the object
        System.out.print("Sizes obtained: \n");
        System.out.println("Integer : " + Integer.BYTES);
        System.out.println("Double : " + Double.BYTES);
        System.out.println("Float : " + Float.BYTES);
        System.out.println("Character : " + Character.BYTES);
        System.out.println("Boolean : ");
        System.out.println("Long : " + Long.BYTES);
        System.out.println("Short : " + Short.BYTES);
        System.out.println("Byte : " + Byte.BYTES);

    }
}
