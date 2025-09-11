import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        examp();
    }

    public static void example() {
        for (int counter = 0; counter < 4; counter = counter + 1){
            System.out.println("my name is susmitha");
        }
    }

    public static void numPrint() {
        //counter = counter + 1 = counter++
        for (int counter = 0; counter < 11; counter++){
            System.out.print(counter + " ");
        }
    }

    public static void whil() {
        int i = 0;
        while (i < 11) {
            System.out.print(i + " ");
            i = i + 1; //i++;
        }
    }

    public static void dowhil() {
        int i = 0;
        do{
            System.out.print(i + " ");
            i = i + 1;
        } while (i < 11);
    }

    public static void falseStat() {
        int i = 12;
        while(i < 11){
            System.out.println("my name");
        }

        do{
            System.out.println("my name");
        } while (i < 11);
    }

    public static void sums() {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);

        sc.close();
    }

    public static void exa() {
        Scanner ex = new Scanner(System.in);
            int i;

        do{
            System.out.println("Enter a positive number: ");
            i = ex.nextInt();
        }while (i <= 0);

        System.out.println("you entered: " + i);

        ex.close();
    }

    public static void examp() {
        System.out.println("bye susmitha");
        double a = 234%45;
        System.out.println(a);


    }
}
