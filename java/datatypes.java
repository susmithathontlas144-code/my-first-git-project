public class datatypes {
    public static void main(String[] args) {
    
    }

    public static void simple(String[] args) {
        
        //calculation of simple interest
        float p, r, si;
        int n;
        p = 1000.50f;
        n=3;
        r=15.5f;
        //formula for simple interest
        si=p*n*r/100;
        System.out.println("CALCULATION OF SIMPLE INTEREST");
        System.out.println("principal (p) = " + p);
        System.out.println("rate (r) ="+r);
        System.out.println("number (n) ="+n);
        System.out.println("si = p*n*r/100");
        System.out.println("simple interest = Rs." +si);

    }

    public static void temp(String[] args) {
        //in celsius
        int vij, guntur, elluru;
        double fvij,fguntur, felluru;
        vij = 30;
        guntur = 32;
        elluru = 31;
        //to convert into celsius
        fvij = (vij*9/5)+35;
        fguntur = (guntur*9/5)+35;
        felluru = (elluru*9/5)+35;
        System.out.println(fvij);
        System.out.println(fguntur);
        System.out.println(felluru);

    }

    public static void ram(String[] args) {
        int bs, da, hr, gs;
        bs = 10000;
        da = bs*40/100;
        //40% of dearness allowance
        hr = bs*20/100;
        //20% of house rent allowance
        gs = bs+da+hr;
        System.out.println("assume basic salary is" +bs);
        System.out.println("given percentage allowance of da is 40%");
        System.out.println("dearness allowance =" +da);
        System.out.println("given house rent is 20%");
        System.out.println("house rent =" +hr);
        System.out.println("gross salary =" +gs);
     
    }

    public static void mark(String[] args) {
        int t, e, sc, s, m, tm, percentage;
        t = 88;
        e = 95;
        sc = 91;
        s = 77;
        m = 89;
        tm = t+e+sc+s+m;
        percentage = tm*100/500;
        System.out.println("marks obtained by a student in each subject");
        System.out.println("telugu =" +t +"marks");
        System.out.println("english =" +e +"marks");
        System.out.println("science =" +sc +"marks");
        System.out.println("social =" +s +"marks");
        System.out.println("maths =" +m +"marks");
        System.out.println("marks obtained =" +tm +"marks");
        System.out.println("percentage obtained is" + percentage+"%");

    }

    public static void distance(String[] args) {
        int kms, cms;
        kms = 70;
        cms = kms*100000;
        double feet, inches;
        feet = kms*3280.84;
        inches = kms*39370.1;
        System.out.println(kms);
        System.out.println(cms);
        System.out.println(feet);
        System.out.println(inches);

    }

    public static void avg(String[] args) {
        int x, y, z, avg;
        x = 24;
        y = 19;
        z = 46;
        avg = x+y+z/3;
        System.out.println("CALCULATION OF AVERAGE");
        System.out.println("x =" +x);
        System.out.println("y =" +y);
        System.out.println("z =" +z);
        System.out.println("avg = x+y+z/3");
        System.out.println("average =" + avg);
    }
}
