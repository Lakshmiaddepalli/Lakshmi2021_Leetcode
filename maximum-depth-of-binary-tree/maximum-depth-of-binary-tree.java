/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        
        if(root == null){
            return 0;
        }
        
        Deque<TreeNode> q = new ArrayDeque<>();
        TreeNode curr;
        int depth = 0;
        int lengthoflevel = 0;
        
        q.offer(root);
        
        while(!q.isEmpty()){
            depth++;
            lengthoflevel = q.size();
            for(int i = 0; i < lengthoflevel; i++){
                curr = q.poll();
                if(curr.left!=null){q.offer(curr.left);}
                if(curr.right!=null){q.offer(curr.right);}
            }
        }
        
        return depth;
    }
}
