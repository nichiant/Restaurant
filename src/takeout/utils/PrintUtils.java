package takeout.utils;

import static takeout.utils.PrintUtils.CommonPrintMethod.*;

public class PrintUtils {

    private final static String LINE = "___________________________________________________________________";
    private final static String MAIN_DICHES_TITILE = "Our Best Main Dishes:";

    public static class CommonPrintMethod {

        public final static void print(String text) {
            System.out.print(text);
        }

        public final static void println() {
            System.out.println();
        }

        public static void printLine() {
            println();
            print(LINE);
        }

    }

    public static class PrintTitles {

        public static void printMenuTitle() {
            println();
            println();
            print("_______________ Take Out Menu _______________");
            println();
            println();
        }

        public static void printMainDishesTitle() {
            print(MAIN_DICHES_TITILE);
            println();
            println();
        }
        public static void printSidesTitle() {
            print("Our Healthy Sides");
            println();
            println();
        }
        public static void printDrinksTitle() {
            print("Drinks");
            println();
            println();
        }

        public static void printPrice(double price) {
            if(price < 10) {
                print("$ " + price);
            } else {
                print("$" + price);
            }
        }

    }

    public static class PrintSpaces {

        private static int maxLenght = 0;

        private static int maxLenghtName(String[] names) {
            for (int i = 0; i < names.length; i++) {
                if (names[i].length() > maxLenght) {
                    maxLenght = names[i].length();
                }
            }
            return maxLenght;
        }

        public static int spacesAfterName(String[] names, String[] names1, String[] names2, String name) {
            maxLenght = maxLenghtName(names);
            int maxLenght1 = maxLenghtName(names1);
            int maxLenght2 = maxLenghtName(names2);

            if (maxLenght < maxLenght1) {
                maxLenght = maxLenght1;
            } else if (maxLenght < maxLenght2) {
                maxLenght = maxLenght2;
            }

            int count = maxLenght - name.length();
            return count;
        }

        public static void printSpacesAfterName(int spacesCount) {
            for (int i = 0; i <= spacesCount; i++) {
                print(" ");
            }
        }
    }
}
