package me.simon.Six;

import java.util.Arrays;

/**
 * Created by DemonHe on 16/10/7.
 * 两数字之和, 时间复杂度为O(nlogn)
 */
public class T1 {
    public static boolean hasSum(int[] A, int target) {
        boolean res = false;
        if (A == null || A.length < 2) {
            return res;
        }
        Arrays.sort(A);
        int i = 0, j = A.length -1 ;
        while (i < j) {
            if (A[i] + A[j] == target) {
                res = true;
                break;
            } else if (A[i] + A[j] > target) {
                j--;    // 数值过大，减小
            } else {
                i++;    // 数值过小，增加
            }
        }

        return  res;
    }
}
