package me.simon.Six;

/**
 * Created by DemonHe on 16/10/8.
 * 字符交替
 */
public class T54 {
    public static void printStr(String s1, String s2) {
        printStr(s1, s2, "");
    }

    public static void printStr(String s1, String s2, String pstr) {
        if ((s1 == null || s1.length() == 0) && (s2 == null || s2.length() == 0)) {
            return;
        }
        if ((s1 == null || s1.length() == 0)) {
            System.out.println(pstr + s2);
            return;
        }
        if ((s2 == null || s2.length() == 0)) {
            System.out.println(pstr + s1);
            return;
        }

        printStr(s1.substring(1, s1.length()), s2, pstr+s1.charAt(0));
        printStr(s1, s2.substring(1, s2.length()), pstr+s2.charAt(0));

    }
}
