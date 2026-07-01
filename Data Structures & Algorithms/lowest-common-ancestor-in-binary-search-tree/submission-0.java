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
    private TreeNode lca(TreeNode root, TreeNode p, TreeNode q){
        if(root==null) return null;

        if(root.val == p.val) return root;
        if(root.val == q.val) return root;

        TreeNode left = lca(root.left, p, q);
        TreeNode right = lca(root.right,p,q);
        if(left!= null && right!= null){
            return root;
        }
        return left!=null?left:right;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lca(root,p,q);
    }
}
