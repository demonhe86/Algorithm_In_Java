package me.simon.Six;

/**
 * Created by DemonHe on 16/10/8.
 * 产生括号
 */
public class T51 {
    public static void printPair(int l, int r, char[] str, int count) {
        if (l < 0 || r < 1) {
            return;
        }

        if (l == 0 && r == 0) {
            System.out.println(str);
        } else {
            if (l > 0) {
                str[count] = '(';
                printPair(l - 1, r, str, count+1);
            }
        }

        if (r > 0) {
            str[count] = ')';
            printPair(l, r - 1, str, count+1);
        }
    }

    public static void printPar(int n) {
        char[] str = new char[n*2];
        printPair(n, n, str, 0);
    }
}
