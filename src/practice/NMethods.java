package practice;

public class NMethods {


    public static String checkAge(int age) {

        if (age >= 0 && age < 16) {
            return "Sorry, you're too young";
        } else if (age >= 16 && age < 18) {
            return "You can drive a car";
        } else if (age >= 18 && age < 21) {
            return "You can buy a lottery ticket";
        } else if (age >= 21) {
            return "You can do whatever you want to do!";
        } else {
            return null;
        }

    }

    public static void main(String[] args) {
        int age = 19;
        System.out.println(checkAge(age));
    }
}
