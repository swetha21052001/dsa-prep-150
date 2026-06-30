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
    private TreeNode dfs(TreeNode node){
        if(node == null) return node;
        TreeNode temp = dfs(node.right);
        node.right = dfs(node.left);
        node.left = temp;
        return node;
        
    }
    public TreeNode invertTree(TreeNode root) {
        return dfs(root);
    }
}
