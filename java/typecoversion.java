public class typecoversion {
    public static void main(String[] args) {
    
    }

    public static void div(String[] args) {
        int a = 22;
        int b = 7;
        int result = a/b;
        double dresult = (double)a/b;
        double mresult = 22.0/b;
        float fresult = (float)a/b;
        System.out.println(result);
        System.out.println(dresult);
        System.out.println(mresult);
        System.out.println(fresult);
    }

     public static void susMi() {
        int a, b, c, d;
        long e = 456789234576l;
        String name, town;
        a = (int)e;
        b = 3;
        c = 4;
        d = a+b+c;
        name = "susmitha";
        town = "vijayawada";

        System.out.println("my sisters age is " +d +"years");
        System.out.println(name+d);
        System.out.println(a);

    }

     public static void calcu(String[] args) {
        double d = -50.7;
        int i = (int)d;
        float f = (float)d;
        long l = (long)d;
        byte b = (byte)d;
        char c = (char)d;
        System.out.println("original double value: " +d);
        System.out.println("");
        System.out.println("conversions:");
        System.out.println("double to int: " + i);
        System.out.println("double to float:" + f);
        System.out.println("double to long:" + l);
        System.out.println("double to byte:" +b);
        System.out.println("double to char:" + c);

    }
}
