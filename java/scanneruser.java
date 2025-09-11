import java.util.Scanner;

public class scanneruser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your name: ");
        String userName = scanner.nextLine();

        System.out.println("enter you age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); //clear buffer

        System.out.println("enter your place: ");
        String place = scanner.nextLine();

        System.out.println("enter your class name: ");
        int grade = scanner.nextInt();

        scanner.nextLine();  // clear buffer

        System.out.println("enter your hobbies: ");
        String hobby = scanner.nextLine();

        System.out.println("enter your goals: ");
        float goal = scanner.nextFloat();

        System.out.println("My name is " + userName);
        System.out.println("I am " + age + "years old");
        System.out.println("I am from " + place);
        System.out.println("I am studying in class " + grade +" at vidyapeeth, tadepalli");
        System.out.println("My hobbies are " + hobby);
        System.out.println("My goals are " + goal);
        
        scanner.close();
    }
}
