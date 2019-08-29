package cf.tilgiz.operators;

public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        a += 1;

        double f = (double) a / b;
        int g = a % b;
        System.out.println(f);
        System.out.println(g);

        int n = 2;
        int m = 2;
        System.out.println(n++);
        System.out.println(++m);

        int x = 3;
        int y = 5;
        int z = 8;
        boolean boolVal = n >= m;
        System.out.println(boolVal);

        boolean boolVal2 = y > z;

        boolean resultBoolean = boolVal && boolVal2;

        System.out.println("resultBoolean = " + resultBoolean);

        int res = (x < y) && (z < y) ? x : y;

        System.out.println("Ternary res = " + res);


    }
}
