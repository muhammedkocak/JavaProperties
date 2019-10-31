public class _2_FinalVariables { //Class name
    public static void main(String[] args) { //Main method line

        boolean aBoolean = false; //Variable(dataType boolean) named aBoolean is set to false
        char aCharacter = 'd'; //Variable(dataType char) named aCharacter and the value is d
        byte aByte = 126; //Variable(dataType byte) named aByte and the value is 126
        short aShortInteger = 1568; //Variable(dataType short) named aShortInteger and the value is 1568
        int anInteger = 1256456; //Variable(dataType int) named anInteger and the value is 1256456
        long aLongInteger = 45631341L; //Variable(dataType long) named aLongInteger and the value is 45631341L
        float aDecimalNumber = 1256.32F; //Variable(dataType float) named aDecimalNumber and the value is 1256.32F
        double aBigDecimalNumber = 12.365987451236; //Variable(dataType double) named aBigDecimalNumber and the value is 12.365987451236
        final double PI = 3.14; //Variable(dataType double) named PI and the  (final) value is fixed on 3.14

        System.out.println(aBoolean); //Prints out the value of Variable aBoolean
        System.out.println(aCharacter); //Prints out the value of Variable aCharacter
        System.out.println(aByte); //Prints out the value of Variable aByte
        System.out.println(aShortInteger); //Prints out the value of Variable aShortInteger
        System.out.println(anInteger); //Prints out the value of Variable aInteger
        System.out.println(aLongInteger); //Prints out the value of Variable aLongInteger
        System.out.println(aDecimalNumber); //Prints out the value of Variable aDecimalNumber
        System.out.println(aBigDecimalNumber); //Prints out the value of Variable aBigDecimalNumber
        System.out.println(PI); //Prints out the value of Variable PI

        //PI = 3.15; //Error:(26, 9) java: cannot assign a value to final variable PI
    }
}
