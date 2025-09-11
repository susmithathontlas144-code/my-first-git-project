import java.util.Scanner;

public class witch {
    public static void main(String[] args) {

    }

    public static void itch(String[] args) {
        int n , m ;
        n = 4;
        m = 6;

        switch (n) {
            case 1:
                System.out.println("byte");
                break;
            case 2:
                System.out.println("short");
                break;
            case 3:
                System.out.println("int");            
                break;
            case 4:
                System.out.println("long"); 
                break;
            case 5:
                System.out.println("float"); 
                break;
            case 6:
                System.out.println("double"); 
                break;
            case 7:
                System.out.println("boolean"); 
                break;
            case 8:
                System.out.println("char"); 
                break; 
            case 9:
                System.out.println("string"); 
                break;
        }
    }

    public static void calc() {
        Scanner buff = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = buff.nextDouble();

        System.out.println("Enter the operation: ");
        char operator = buff.next().charAt(0);

        System.out.println("Enter the second number: ");
        double num2 = buff.nextDouble();

        switch(operator) {
            case '+':
                double result = num1 + num2;
                System.out.println(result);
                break;
            case '-':
                double result1 = num1 - num2;
                System.out.println(result1);
                break;
            case '*':
                double result2 = num1 * num2;
                System.out.println(result2);
                break;
            case '/':
                if (num2 != 0){
                    double result3 = num1 / num2;
                    System.out.println(result3);
                } else {
                    System.out.println("not valid");
                }
                break;
        }

        buff.close();

    }

    public static void sus() {
        
    }
}
