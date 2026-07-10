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
    int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> ino = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            ino.put(inorder[i],i);
        }
        return helper(preorder, 0, inorder.length-1, ino);
    }
    public TreeNode helper(int[] preorder, int start, int end, Map<Integer,Integer> ino){
        if(start>end) return null;
        TreeNode root = new TreeNode(preorder[index++]);
        int inorderIndex = ino.get(root.val);
        root.left = helper(preorder,start,inorderIndex-1,ino);
        root.right = helper(preorder,inorderIndex+1,end,ino);
        return root;
        
    }
}
