package cf.tilgiz.hello;

public class Main {

    public static void main(String[] args) {

        float myFloatValue = 23.56f;
        double myDoubleValue = 23.56f;
        float newFloat = (float) myDoubleValue;
        long myLongValue = 888_888_888_888_888_888L;


        char myChar = 123;
        char myChar1 = 'T';
        char myChar2 = '\n';
        char myChar3 = '\u00A9';


/*
        System.out.println(newFloat);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);
        System.out.println(myFloatValue / 3);
        System.out.println(myDoubleValue / 3);

        System.out.println(myChar);
        System.out.println((int) myChar);
        System.out.println((int) myChar1);
        System.out.println("" + myChar + myChar1);
        System.out.println(myChar + myChar1);
        System.out.println(myChar2);
        System.out.println((int) myChar3);
        System.out.println(myChar3);

*/

        boolean b1 = true;
        boolean b2 = false;

        byte b = 122;

        short someShort = b;
        int someInt = someShort;

        someShort = (short) someInt;

        System.out.println("myLongValue " + myLongValue);

        someInt = (int) myLongValue;

        System.out.println("someInt " + someInt);
        System.out.println("someShort " + someShort);


        double someDouble = myFloatValue;

        double someLongToDouble = myLongValue;

        long someDoubleToLong = (long) someLongToDouble;

        System.out.println("someDouble " + someDouble);
        System.out.println("someLongToDouble " + someLongToDouble);
        System.out.println("someDoubleToLong " + someDoubleToLong);

    }
}
