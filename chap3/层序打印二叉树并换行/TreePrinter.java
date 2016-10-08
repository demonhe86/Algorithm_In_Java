import java.util.*;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class TreePrinter {
    public int[][] printTree(TreeNode root) {
        // write code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> arrs = new ArrayList<ArrayList<Integer>>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode last = root;
        TreeNode nlast = root;
        TreeNode temp = null;
        queue.addLast(root);
        while(!queue.isEmpty()) {
            temp = queue.poll();
            arr.add(temp.val);
            if (temp.left != null) {
                queue.addLast(temp.left);
                nlast = temp.left;
            }
            if (temp.right != null) {
                queue.addLast(temp.right);
                nlast = temp.right;
            }
            if (last == temp) {
                arrs.add(arr);
                arr = new ArrayList<Integer>();
                last = nlast;
            }
        }
        int[][] res = new int[arrs.size()][];
        for (int i = 0; i < arrs.size(); i++) {
            res[i] = new int[arrs.get(i).size()];
            for (int j = 0; j < arrs.get(i).size(); j++) {
                res[i][j] = arrs.get(i).get(j);
            }
        }
        
        return res;
    }
}