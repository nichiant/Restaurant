package practice;

public class FifElse {
    public static void main(String[] args) {

       int number = 2;

       if (number > 0) {
           if (number % 2 == 0) {

               if (number % 4 == 0) {
                  if (number > 5) {
                      System.out.println("Ваше число 8");
               } else {
                      System.out.println("ВАше число 4");
                  }
           } else if (number * 3 == 6) {
                   System.out.println("Ваше число 2");
               } else if (number < 8) {
                   System.out.println("Ваше число 6");
               } else {
                   System.out.println("Ваше число 10");
               }
           } else if (number % 3 == 0) {
               if (number / 3 == 1) {
                   System.out.println("Ваше число 3");
               } else {
                   System.out.println("Ваше число 9");
               }
           } else if (number != 7) {
               if (number == 1) {
                   System.out.println("Ваше число 1");
               } else {
                   System.out.println("Ваше число 5");
               }
           } else {
               System.out.println("Ваше число 7");
           }
           } else {
           System.out.println("Ваше число 0");
       }
    }
}
