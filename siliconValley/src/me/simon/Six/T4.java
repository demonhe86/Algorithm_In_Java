package me.simon.Six;

/**
 * Created by DemonHe on 16/10/7.
 * 数组旋转
 */
public class T4 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int k = 2;
        rotateK(A, k);
        for(int i : A) {
            System.out.println(i);
        }
    }

    /**
     * 旋转三次
     * 整体，左，右
     * @param A
     * @param k
     * @return
     */
    public static int[] rotateK(int[] A, int k) {
        if (A  == null || k >= A.length) {
            return  A;
        }
        reverse(A, 0, A.length-1);
        reverse(A, 0, k-1);
        reverse(A, k, A.length-1);
        return A;
    }

    public static void reverse(int[] A, int start, int end) {
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
    }

}
