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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int s = q.size();
            for(int i=0;i<s;i++){
                TreeNode pop = q.poll();
                if(pop!=null){
                    level.add(pop.val);
                    q.offer(pop.left);
                    q.offer(pop.right);
                }
            }
            if(level.size()!= 0)
                levels.add(level);
        }
        return levels;
    }
}
