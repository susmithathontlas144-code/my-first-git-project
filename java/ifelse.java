import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        calculator();
    }
    
    public static void calculator() {
        Scanner sus = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sus.nextDouble();

        System.out.print("Enter the operation: ");
        char operator = sus.next().charAt(0);

        System.out.print("Enthe the second number: ");
        double num2 = sus.nextDouble();

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

        sus.close();

    }

    public static void grad(String[] args) {  
        Scanner pro = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = pro.nextInt();

        if (num >= 90){
            System.out.println("Grade A");
        } else if (num >= 80){
            System.out.println("Grade B");
        } else if (num >= 70){
            System.out.println("Grade C");
        } else if (num >= 60){
            System.out.println("Grade D");
        } else if (num >= 50){
            System.out.println("Grade F");
        }

        pro.close();
        
    }

    public static void grade(String[] args) {
        Scanner bhu = new Scanner(System.in);
        
        System.out.print("Enter your score: ");
        int score = bhu.nextInt();

        if (score < 0 || score > 100){
            System.out.println("Invalide score");
        } else if (score >= 90){
            System.out.println("Grade A ");
        } else if (score >= 80){
            System.out.println("Grade B ");
        }else if (score >= 70){
            System.out.println("Grade C");
        }else if (score >= 60){
            System.out.println("Grade D");
        }else{
            System.out.println("low score F");
        }
        
        bhu.close();
    }

    public static void pass(String[] args){
        Scanner rel = new Scanner(System.in);

        String correctUserName = "susmitha24";
        String correctPassword = "secret12";

        System.out.print("Username: ");
        String userName = rel.next();

        System.out.print("password: ");
        String password = rel.next();

        boolean validlogin = userName.equals(correctUserName) && password.equals(correctPassword);

        if (validlogin){
            System.out.println("Login successfull, welcome!");
        } else {
            System.out.println("Invalid credentials!");
        }

        rel.close();

    }

    public static void ageClassifier(String[] args) {
        Scanner cal = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = cal.nextInt();

        if (age <= 12){
            System.out.println("you are a child");
        } else if ( age <= 19){
            System.out.println("you are a teenager");
        } else if (age <= 59 ){
            System.out.println("you are an adult");
        } else if (age <= 120){
            System.out.println("you are a senior citizen");
        }else {
            System.out.println("invalid age");
        }

        cal.close();
    }
}
