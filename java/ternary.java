public class ternary {
    public static void main(String[] args) {
        int score = 80;
        int num = 8;
        int ab = -15;
        int age = 25;
        int a = 100;
        int b = 96;
        int score2 = 78 ;
        String colour = "yellow";
        int bhu = -45;
        int year = 2024;
        int price = 55;
        int day = 6;

        String evenOrOdd = (num % 2 == 0) ? "even" : "fail";
        String passOrFail = (score >= 60) ? "pass" : "fail";
        String absulote = (ab < 0) ? "-number" : "+number";
        String mi = (age < 18) ? "minor" : "major";
        String max = (a <= b) ? "b" : "a";
        String grade = score2 >= 90  ? "A" : (score2 >= 80 ? "B" : (score2 >= 70 ? "C" :"D"));
        String traffic = colour.equals("red") ? "stop" : (colour.equals("yellow") ? "caution" : (colour.equals("green") ? "go" : "invalid"));
        String number = bhu < 0 ? "negative" : (bhu == 0 ? "zero" : "positive");
        String leap = (year % 4 == 0 && year % 100 != 0 || year % 400 ==0 ) ? "leap" : "not leap" ;
        String discount = price >= 1000 ? "20%" : (price >= 500 ? "10%" : (price >= 100 ? "50%" : "no dicount"));
        String type = (day < 1 || day > 7 ? "not valid" : (day <= 5 ? "weekday" : "weekend"));

        System.out.println(max);
        System.out.println(mi);
        System.out.println(absulote);
        System.out.println(passOrFail);
        System.out.println(evenOrOdd);
        System.out.println(grade);
        System.out.println(traffic);
        System.out.println(number);
        System.out.println(leap);
        System.out.println(discount);
        System.out.println(type);
    }
}
