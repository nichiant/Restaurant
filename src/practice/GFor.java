package practice;
// for (int i = 0; i < 11; i++)
public class GFor {
    public static void main(String[] args) {

        String bottlesOfBeer = " bottles of beer.";

        for (int beerBottlesCount = 99; beerBottlesCount >= 0; beerBottlesCount--) {
            if (beerBottlesCount == 0) {
                System.out.println("No more bottles of beer");

                System.out.print("Go to the store and buy some more ");
                beerBottlesCount = 99;
                System.out.println(beerBottlesCount + " bottles of the beer on the wall.");
                System.out.println();
                break;
            } else if (beerBottlesCount == 1) {
                System.out.print(beerBottlesCount + " bottle of beer on the wall, ");
                System.out.println(beerBottlesCount + " bottle of beer on the wall, ");
                printTakeOneDown();
                System.out.println("no more bottles of the beer on the wall");
                System.out.println();
               // continue;
            } else if (beerBottlesCount == 2) {
                System.out.print(beerBottlesCount + " bottles of beer on the wall, ");
                System.out.println(beerBottlesCount + " bottles of beer.");
                printTakeOneDown();
                System.out.println(beerBottlesCount - 1 + " bottle of the beer on the wall");
                System.out.println();
                //continue;
            } else {
                print(beerBottlesCount);
                System.out.print(" bottles of beer on the wall, ");
                System.out.println(beerBottlesCount);
                printString(bottlesOfBeer);
                printDot();
                println();
                printTakeOneDown();
                print(beerBottlesCount - 1);
                System.out.println(beerBottlesCount - 1 + " bottles of the beer on the wall");
                System.out.println();
            }
        }
    }
    private static void println() {
        System.out.println();
    }

    private static void printTakeOneDown() {
        System.out.print("Take one down and pass it around, ");
    }

    private static void printString(String string) {
        System.out.print(string);
    }

    private static void printDot() {
        System.out.print(". ");
    }

    private static void print(int number) {
        System.out.print(number);
    }

}
