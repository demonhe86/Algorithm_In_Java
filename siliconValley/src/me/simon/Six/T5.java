package me.simon.Six;

/**
 * Created by DemonHe on 16/10/7.
 * 最大下标距离
 */
public class T5 {
    public static void main(String[] args) {
        int[] arr = {5,3,4,0,1,4,1};
//        System.out.println(maxIndexDistance(arr));

    }


//    public static int maxIndexDistance(int[] A) {
//        if (A == null || A.length < 2) {
//            return 0;
//        }
//        boolean[] inDescSeq = new boolean[A.length];
//        int min = A[0], n = A.length;
//        inDescSeq[0] = true;
//        for (int i = 0; i < n; i++) {
//            if (A[i] < min) {
//                inDescSeq[i] = true;
//                min = A[i];
//            }
//        }
//
//        int maxDist = 0;
//        int i = n - 1;
//        int j = n - 1;
//        while (i >= 0) {
//            if (inDescSeq[i] == false) {
//                i--;
//                continue;
//            }
//            while (A[j] <= A[i] && j > i) {
//                j--;
//            }
//            if ((j-i) > maxDist) {
//                maxDist = j - 1;
//            }
//            i--;
//        }
//        return  maxDist;
//
//    }
}
