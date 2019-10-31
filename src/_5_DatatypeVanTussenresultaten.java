public class _5_DatatypeVanTussenresultaten { //Class name
    public static void main(String[] args) { //Main method line

        byte aByte = 8; //Variable(byte) named aByte and the value is 8
        byte bByte = 8; //Variable(byte) named bByte and the value is 8
        //byte cByte = aByte * bByte; // We cannot multiple byte with byte because its always returns as an Integer
        byte cByte = 8 * 8; //Variable(byte) named cByte and the value is 8 X 8 = 64

        System.out.println(aByte); //Prints out the value of Variable aByte
        System.out.println(bByte); //Prints out the value of Variable bByte
        System.out.println(cByte); //Prints out the value of Variable cByte

        int a = 2147483645; //Variable(integer) named a and the value is 2147483645
        int b = 2147483642; //Variable(integer) named b and the value is 2147483642
        int c = a + b;  //Variable(integer) named c and the value is a X b = NOT POSSIBLE because the outcome is bigger than an Integer

        System.out.println(a); //Prints out the value of Variable a
        System.out.println(b); //Prints out the value of Variable b
        System.out.println(c); //Prints out the value of Variable c

        long d = 2147483645L; //Variable(long) named d and the value is 2147483645
        int e = 2147483642; //Variable(integer) named e and the value is 2147483642
        long f = d + e;  //Variable(long) named f and the value is d X e = long f with value 4294967287

        System.out.println(d); //Prints out the value of Variable a
        System.out.println(e); //Prints out the value of Variable b
        System.out.println(f); //Prints out the value of Variable c





    }
}
