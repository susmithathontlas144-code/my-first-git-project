import java.util.Scanner;

public class july21 {
    public static void main(String[] args) {
        prob15();
    }

    public static void prob1() {
        Scanner basic = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = basic.nextLine();

        System.out.print("Enter your age: ");
        int age = basic.nextInt();

        basic.nextLine();

        System.out.print("Enter your favourite person: ");
        String name2 = basic.nextLine();

        System.out.println("Hello " + name + ", " + "you are " + age + " years old and your favourite person is " + name2);

        basic.close();
    }

    public static void prob2() {
        Scanner second = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = second.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = second.nextInt();
        
        System.out.println("Original first number: " + num1);
        System.out.println("Original second number: " + num2);

        int swapNumOne = num2;
        int swapNumTwo = num1;
        
        System.out.println("Swapped value of first number: " + swapNumOne);
        System.out.println("Swapped value of second number: " + swapNumTwo);

        second.close();
    }

    public static void prob3() {
        Scanner third = new Scanner(System.in);

        System.out.println("length of the rectangle: ");
        double length = third.nextDouble();

        System.out.println("width of the rectangle: ");
        double width = third.nextDouble();

        double result = length*width;

        System.out.println("The area of rectangle is " + result);

        third.close();
    }

    public static void prob4() {
        Scanner fourth = new Scanner(System.in);

        System.out.println("Enter the temperature(C): ");
        double temp = fourth.nextDouble();

        double result = (temp*9/5)+32;

        System.out.println("The coverted temperature is: " + result + "F");

        fourth.close();
    }

    public static void prob5(){
        Scanner fifth = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int digit = fifth.nextInt();

        int digit4 = digit % 10;
        int digit3 = (digit /10) %  10;
        int digit2 = (digit /100) %  10;
        int digit1 = (digit /1000) ;

        System.out.println(digit);
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);

        fifth.close();
    }

    public static void prob6() {
        Scanner sixth = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = sixth.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sixth.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = sixth.nextInt();

        double result = ((double)number1+number2+number3)/3;

        System.out.println("The avg of numbers: " + result);

        sixth.close();
    }

    public static void prob7() {
        int a = 5;
        double b = 7;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a/0);

    }

    public static void prob8() {
        double a = 5.987;
        int b = (int)a;  //explicit
        double c = b;    //implicit

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    
    }

    public static void prob9() {
        double a, b, c, d, e, tm;
        a = 90;
        b = 78;
        c = 89;
        d = 70;
        e = 96;
        tm = a+ b+ c+ d+ e;

        double per1, per2, per3, per4, per5,pertm;
        per1 = (a/100)*100;
        per2 = (b/100)*100;
        per3 = (c/100)*100;
        per4 = (d/100)*100;
        per5 = (e/100)*100;
        pertm = (tm/500)*100;
        
        System.out.println("maths: " + per1);
        System.out.println("science: " + per2);
        System.out.println("social: " + per3);
        System.out.println("telugu: " + per4);
        System.out.println("english: " + per5);
        System.out.println("total percentage: " + pertm);
    }

    public static void prob10() {
        
        Scanner tenth = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = tenth.nextDouble();

        System.out.print("Enter the operation: ");
        char operator = tenth.next().charAt(0);

        System.out.print("Enthe the second number: ");
        double num2 = tenth.nextDouble();

        if (operator == '+'){
            double result = num1 + num2;
            System.out.println("reslut: " + result);
        }else if (operator == '-'){
            double result = num1 - num2;
            System.out.println("result: " + result);
        }else if (operator == '*'){
            double result = num1 * num2;
            System.out.println("result: " + result);
        }else if (operator == '/'){
            if (num2 != 0){
                double result = num1/num2;
                System.out.println("result: " +result);
            }else {
                System.out.println("Error: Division by zero");
            }
        }else {
            System.out.println("Error: invalid operator. use +,-,*,/ ");
        }
            System.out.println("operation: " + num1 + " " + operator + " " + num2);

        tenth.close();
    }

    public static void prob11() {

        Scanner eleventh = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = eleventh.nextInt();

        if (a<0){
            System.out.println("negative");
        } else if (a==0){
            System.out.println("zero");
        } else {
            System.out.println("positive");
        }
        eleventh.close();
    }

    public static void prob12() {
        Scanner twelth = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = twelth.nextInt();

        System.out.print("Enter the second number: ");
        int b = twelth.nextInt();

        System.out.print("Enter the third number: ");
        int c = twelth.nextInt();

        if (a > b) {
             if (a > c) {
                System.out.println(a + " is the largest number");
            } else {
                System.out.println(c + " is the largest number");
            }
        } else {
           if (b > c) {
                System.out.println(b + " is the largest number");
           } else {
                System.out.println(c + " is the largest number");
                }
        }
        twelth.close();
    }

    public static void prob13() {
        Scanner thirtheen = new Scanner(System.in);

        System.out.print("enter the year: ");
        int year = thirtheen.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 ==0)){
            System.out.println("Leap year");
        } else {
            System.out.println("not leap year");
        }

        thirtheen.close();
    }

    public static void prob14() {
        Scanner fourteen = new Scanner(System.in);

        System.out.print("enter the score: ");
        int score = fourteen.nextInt();

        if (score > 100 ){
            System.out.println("invalid score");
        } else if (score >= 90){
            System.out.println("Grade A");
        }else if (score >= 80){
            System.out.println("Grade B");
        }else if (score >= 70){
            System.out.println("Grade C");
        }else if (score >= 60){
            System.out.println("Grade D");
        }else {
            System.out.println("Grade F");
        }

        fourteen.close();
    }

    public static void prob15() {
        Scanner fifteen = new Scanner(System.in);

        System.out.print("enter the age: ");
        int age = fifteen.nextInt();

        if (age >= 18 ){
            System.out.println("you can vote");
        }else if (age >= 16 && age < 18){
            System.out.println("you can drive");
        }else{
            System.out.println("you are a minor");
        }

        fifteen.close();
    }

    public static void prob() {
        
    }
}

