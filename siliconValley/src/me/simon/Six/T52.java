package me.simon.Six;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by DemonHe on 16/10/8.
 * 提取单词
 */
public class T52 {
    public static ArrayList<String> tokenizeString(String input,
                                                   HashSet<String> d,
                                                   HashMap<String, ArrayList<String>> memorized) {
        ArrayList<String> res = new ArrayList<String >();
        if (input == null || input.length() == 0) {
            return res;
        }

        if (memorized.containsKey(input)) {
            return memorized.get(input);
        }
        if (d.contains(input)) {
            res.add(input);
        }

        int len = input.length();
        for (int i = 0; i < len; i++) {
            String prefix = input.substring(0, i);
            if (d.contains(prefix)) {
                for (String segSuffix : tokenizeString(input.substring(i, len), d, memorized)) {
                    if (segSuffix != null) {
                        res.add(prefix + " " + segSuffix);
                    }
                }
            }
        }

        memorized.put(input, res);
        return res;
    }

}
