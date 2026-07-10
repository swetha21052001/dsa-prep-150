/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    private int pathSum(TreeNode node, int[] maxSum){
        if(node==null) return 0;
        int left = Math.max(0, pathSum(node.left, maxSum));
        int right = Math.max(0, pathSum(node.right, maxSum));
        
        maxSum[0] = Math.max(maxSum[0], left + right + node.val);

        return node.val + Math.max(left, right);
    }
    public int maxPathSum(TreeNode root) {
        int[] maxSum = new int[]{Integer.MIN_VALUE};
        pathSum(root, maxSum);
        return maxSum[0];
    }
}
