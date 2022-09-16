package practice;

public class IArrays {
    public static void main(String[] args) {

////
////        //вызываем индексы массива
////        for (int i = 0; i <= 7; i++) {
////            System.out.println(i);
////        }
//
////        for (int boxNumber = 0; boxNumber <= catsNames.length; boxNumber++) {
////            System.out.println(catsNames[boxNumber]);
////        }
////
////        for (int i = 0; i <= 7; i++) {
////            System.out.println(i);
//    }
        String[] catsNames =  new String[8];

        catsNames[0] = "Мурзик";
        catsNames[1] = "Черныш";
        catsNames[2] = "Мурка";
        catsNames[3] = "Барсик";
        catsNames[4] = "Рыжик";
        catsNames[5] = "Эшли";
        catsNames[6] = "Джина";
        catsNames[7] = "Машка";

//        //вызываем
        for (int boxNumber = 0; boxNumber <= 7; boxNumber++) {
            System.out.println(catsNames[boxNumber]);
        }
            int[] catsAges = {2, 3, 4, 1, 5, 6, 9, 10};

        int min = 100;
        for (int boxNumber = 0; boxNumber < catsAges.length; boxNumber++) {
            if(catsAges[boxNumber] < min) {
                min = catsAges[boxNumber];

            }

        }
        System.out.println(min);

        int max = 0;
        for (int boxNumber = 0; boxNumber < catsAges.length; boxNumber++) {
            if(catsAges[boxNumber] > max) {
                max = catsAges[boxNumber];

            }

        }
        System.out.println(max);

        int result = 0;
        for (int boxNumber = 0; boxNumber < catsAges.length; boxNumber++) {
            result = result + catsAges[boxNumber];

        }
        System.out.println(result/ catsAges.length);

            String[] catsColors = new String[8];

            catsColors[0] = "Grey";
            catsColors[1] = "Black";
            catsColors[2] = "Grey";
            catsColors[3] = "Brown";
            catsColors[4] = "Red";
            catsColors[5] = "Grey";
            catsColors[6] = "Red";
            catsColors[7] = "Grey";


            String[] catsAgesString = new String[8];
            for (int boxNumber = 0; boxNumber < catsAges.length; boxNumber++) {
                catsAgesString[boxNumber] = String.valueOf(catsAges[boxNumber]);
                System.out.println(catsAgesString[boxNumber]);
            }
        System.out.println(catsAgesString[0].getClass());



        String[][] cats = new String[3][8];

        for (int row = 0; row < 3; row++) {
            for (int cell = 0; cell < 8; cell++) {
                if (row == 0) {
                    cats[row][cell] = catsNames[cell];
                } else if (row == 1) {
                    cats[row][cell] = catsAgesString[cell];
                } else if (row == 2) {
                    cats[row][cell] = catsColors[cell];
                }
                System.out.println(cats[row][cell]);
            }

        }

        for (int cell = 0; cell < 8; cell ++) {
            for (int row = 3; row < 3; row ++) {

                System.out.println(cats[row][cell]);

            }
            System.out.println("_______________________________");
        }

        int[] catsAgesInt = new int[8];

        for (int i = 0; i < catsAgesString.length; i++) {
            catsAgesInt[i] = Integer.parseInt(catsAgesString[i]);
            System.out.println(catsAgesInt[i]);

        }


    }
}
