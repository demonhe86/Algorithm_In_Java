package me.simon.Six;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by DemonHe on 16/10/7.
 * 两数字之和,返回这两个数字的下标，时间复杂度O(n)
 */
public class T2 {
    public static void main(String[] args) {
        int[] A = {1, 5, 3, 7};
        int target = 10;
        int[] res = twoSum(A, target);
        for (int i : res) {
            System.out.println(i);
        }

    }


    public static int[] twoSum(int[] A, int target) {
        int[] res = {-1, -1};
        if (A == null || A.length < 2) {
            return res;
        }
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            // 存储的格式是<Value, Key>
            hm.put(A[i], i);
        }

        for (int i = 0; i < A.length; i++) {
            if (hm.containsKey(target - A[i]) && target != 2*A[i]) {
                res[0] = i;
                res[1] = hm.get(target-A[i]);
                break;
            }
        }

        return  res;
    }
}
