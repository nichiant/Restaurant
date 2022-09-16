package practice;

import java.util.Locale;

public class BString {
    public static void main(String[] args) {
        String s1 = "mama";
        String s2 = "PAPA";


        System.out.println(s1.getClass());
        System.out.println(s2.toLowerCase(Locale.ROOT));
        System.out.println(s1.toUpperCase(Locale.ROOT));
        System.out.println(s1.repeat(7));
    }
}
