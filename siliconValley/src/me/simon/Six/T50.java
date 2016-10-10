package me.simon.Six;

/**
 * Created by DemonHe on 16/10/8.
 * 字符判重
 */
public class T50 {
    // ASCLL
    public static boolean isUniqueChars(String str) {
        boolean[] charSet = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charSet[val]) {
                return true;
            }
            charSet[val] = true;
        }
        return false;
    }

    // a-z TODO 扩展

}
