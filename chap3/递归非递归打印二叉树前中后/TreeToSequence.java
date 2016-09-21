import java.util.*;

public class TreeToSequence {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static class Pair {
        TreeNode node;
        boolean bool;
        public Pair(TreeNode node, boolean bool) {
            this.node = node;
            this.bool = bool;
        }
    }

    public static ArrayList<TreeNode> pre = new ArrayList<TreeNode>();
    public static ArrayList<TreeNode> mid = new ArrayList<TreeNode>();
    public static ArrayList<TreeNode> after = new ArrayList<TreeNode>();


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int[][] result = convert(root);
        for(int[] x : result) {
            for (int y : x) {
                System.out.print(y);
            }
            System.out.println();
        }
    }



    public static int[][] convert(TreeNode root) {
        // write code here
//        preTraverse(root);
        preTraverseNo(root);
//        midTraverse(root);
        midTraverseNo(root);
//        afterTraverse(root);
        afterTraverseNo(root);

        int[][] res = new int[3][pre.size()];
        for (int i = 0; i < pre.size(); i++) {
            res[0][i] = pre.get(i).val;
        }
        for (int i = 0; i < mid.size(); i++) {
            res[1][i] = mid.get(i).val;
        }
        for (int i = 0; i < after.size(); i++) {
            res[2][i] = after.get(i).val;
        }

        return res;


    }

    public static void preTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        pre.add(root);
        preTraverse(root.left);
        preTraverse(root.right);
    }

    public static void midTraverse(TreeNode root) {
        if (root == null) {
            return;
        }

        midTraverse(root.left);
        mid.add(root);
        midTraverse(root.right);
    }

    public static void afterTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        afterTraverse(root.left);
        afterTraverse(root.right);
        after.add(root);
    }

    // 非递归
    public static void preTraverseNo(TreeNode root) {
        LinkedList<Pair> stack = new LinkedList<Pair>();
        stack.push(new Pair(root, false));
        boolean visited;
        while(!stack.isEmpty()) {
            root = stack.peekFirst().node;
            visited = stack.peekFirst().bool;
            stack.pop();
            if (root == null) {
                continue;
            }
            if (visited) {
                pre.add(root);
            } else {
                stack.push(new Pair(root.right, false));
                stack.push(new Pair(root.left, false));
                stack.push(new Pair(root, true));
            }
        }
    }

    // 非递归
    public static void midTraverseNo(TreeNode root) {
        LinkedList<Pair> stack = new LinkedList<Pair>();
        stack.push(new Pair(root, false));
        boolean visited;
        while(!stack.isEmpty()) {
            root = stack.peekFirst().node;
            visited = stack.peekFirst().bool;
            stack.pop();
            if (root == null) {
                continue;
            }
            if (visited) {
                mid.add(root);
            } else {
                stack.push(new Pair(root.right, false));
                stack.push(new Pair(root, true));
                stack.push(new Pair(root.left, false));
            }
        }
    }


    // 非递归
    public static void afterTraverseNo(TreeNode root) {
        LinkedList<Pair> stack = new LinkedList<Pair>();
        stack.push(new Pair(root, false));
        boolean visited;
        while(!stack.isEmpty()) {
            root = stack.peekFirst().node;
            visited = stack.peekFirst().bool;
            stack.pop();
            if (root == null) {
                continue;
            }
            if (visited) {
                after.add(root);
            } else {
                stack.push(new Pair(root, true));
                stack.push(new Pair(root.right, false));
                stack.push(new Pair(root.left, false));
            }
        }
    }



}